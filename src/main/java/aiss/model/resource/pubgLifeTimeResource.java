package aiss.model.resource;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import pubfLifeStats.Datum;
import pubfLifeStats.LifeStats;

public class pubgLifeTimeResource {
	
	public LifeStats getLifeTimePubg(String id,String plataforma) throws IOException {
		LifeStats lifestats = null;
		try {
			doTrustToCertificates();

			ObjectMapper objectMapper3 = new ObjectMapper();
			objectMapper3.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			doTrustToCertificates();
			URL url3 = new URL("https://api.pubg.com/shards/"+plataforma+"/players/"+id+"/seasons/lifetime");
			HttpURLConnection conn3 = (HttpURLConnection) url3.openConnection();
			conn3.setRequestMethod("GET");
			conn3.setRequestProperty("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiMDNhZWE2MC0zNmNlLTAxMzgtYmJjOS0zNzRkM2UxZGEzNjYiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTgyMjg2MDA0LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6InNlcmdpb3JvamFzamltIn0.dFS0GuKAPpTrOEChROMqc3APivDw-NDbwAhDpK4WMT8");
			conn3.setRequestProperty("Accept", "application/vnd.api+json");
			lifestats = objectMapper3.readValue(conn3.getInputStream(),LifeStats.class);
			
			//Compruebo si el lifestats devuelto no tiene partidos lo que quiere decir que el
			//jugador no ha jugado ninguna partida en su vida (por lo tanto no hay partidos a mostrar)
			//o bien que la id del jugador buscada es erronea.
			List<Datum> compruebaHttp= lifestats.getData().getRelationships().getMatchesDuo().getData();
			List<Object> compruebaHttp2= lifestats.getData().getRelationships().getMatchesDuoFPP().getData();
			List<Object> compruebaHttp3= lifestats.getData().getRelationships().getMatchesSolo().getData();
			List<Object> compruebaHttp4= lifestats.getData().getRelationships().getMatchesSoloFPP().getData();
			List<Object> compruebaHttp5= lifestats.getData().getRelationships().getMatchesSquad().getData();
			List<Object> compruebaHttp6= lifestats.getData().getRelationships().getMatchesSquadFPP().getData();
			if(compruebaHttp.isEmpty() && compruebaHttp2.isEmpty() &&compruebaHttp3.isEmpty() &&compruebaHttp4.isEmpty() && 
					compruebaHttp5.isEmpty() &&compruebaHttp6.isEmpty()) {
				return null;
			}
		} catch (Exception e) {
			return lifestats;
		}
		return lifestats;
		
	}

		@SuppressWarnings("deprecation")
		public void doTrustToCertificates() throws Exception {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
                        return;
                    }

                    public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
                        return;
                    }
                }
        };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String urlHostName, SSLSession session) {
                if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
                    System.out.println("Warning: URL host '" + urlHostName + "' is different to SSLSession host '" + session.getPeerHost() + "'.");
                }
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }
}
