package aiss.controller;

import aiss.MatchLoL;
import aiss.model.google.drive.FileItem;
import aiss.model.google.drive.Files;
import aiss.model.resource.GoogleDriveResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.apphosting.utils.remoteapi.RemoteApiPb.Request;

public class GoogleDriveFileNewController extends HttpServlet {

    private static final Logger log = Logger.getLogger(GoogleDriveFileDeleteController.class.getName());

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	HttpSession request = req.getSession();
	    Integer tripleKills =0;
	    Integer quadraKills =0;
	    Integer pentaKills =0;
	   
	    String  campeon="";
	    Integer asesinatos=0;
	    Integer asistencias=0;
	    Integer muertes=0;
	     	 for(int i=0;i<6;i++) {
	    	 if(req.getParameter("boton"+i)!=null) {
	    		 campeon =(String) request.getAttribute("campeon"+i);
	    		 asesinatos =(Integer) request.getAttribute("asesinatos"+i);
	    		 asistencias =(Integer) request.getAttribute("asistencias"+i);
	    		 muertes =(Integer) request.getAttribute("muertes"+i);
	    		 tripleKills =(Integer) request.getAttribute("tks"+i);
	    		 quadraKills =(Integer) request.getAttribute("qks"+i);
	    		 pentaKills =(Integer) request.getAttribute("pks"+i);
	    	 }
	     }


   	
   	 String accessToken = (String) req.getSession().getAttribute("GoogleDrive-token");
        if (accessToken != null && !"".equals(accessToken)) {

            GoogleDriveResource gdResource = new GoogleDriveResource(accessToken);
            
            Files files = gdResource.getFiles();
            
        	String title = "GameShup " +asesinatos+muertes+asistencias+tripleKills+ quadraKills+ pentaKills;
        	   	String content = ""; 
        	   	content+="Campeon invocado : " +  campeon;
        	   	content+= "\nNumero de asesinatos  :  " + asesinatos;
        	   	content+= "\nNumero de asistencias :  " + asistencias;
        	   	content+= "\nNumero de muertes     :  " + muertes;
        	   	content+= "\nNumero de asesinatos triples :  " + tripleKills;
        	   	content+= "\nNumero de asesinatos cuadruples :  " +quadraKills;
        	    content+= "\nNumero de pentakills :  " +pentaKills;
        	  
        	    List<FileItem> files2 = files.getItems();

                for(FileItem file:files2) {
                	if(file.getTitle().equals(title)) {
//                		 req.setAttribute("mensaje", "<div id=\"errorp\" class=\"w-50 alert alert-danger\" role=\"alert\">\r\n" + 
//             					"  ESE ARCHIVO YA EXISTE\r\n" + 
//            					"</div>");
                         req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
                	}
                }
                
            if (title != null && !"".equals(title)) {
                FileItem file = new FileItem();
                file.setTitle(title);
                file.setMimeType("text/plain");
                gdResource.insertFile(file, content);
                req.setAttribute("message", "File '" + title + "' added to your Drive!");
                req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
            } else {
                req.setAttribute("message", "You must provide a valid title for file");
                req.setAttribute("content", content);
                req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
            }
        } else {
            log.info("Trying to access Google Drive without an access token, redirecting to OAuth servlet");
            req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req, resp);
        }
//    	        String accessToken = (String) req.getSession().getAttribute("GoogleDrive-token");
//        String title = req.getParameter("title");
//        System.out.println(req.getParameter("content"));
//        String content = req.getParameter("content");
//        if (accessToken != null && !"".equals(accessToken)) {
//            if (title != null && !"".equals(title)) {
//                GoogleDriveResource gdResource = new GoogleDriveResource(accessToken);
//                FileItem file = new FileItem();
//                file.setTitle(title);
//                file.setMimeType("text/plain");
//                gdResource.insertFile(file, content);
//                req.setAttribute("message", "File '" + title + "' added to your Drive!");
//                req.getRequestDispatcher("/googleDriveFileList").forward(req, resp);
//            } else {
//                req.setAttribute("message", "You must provide a valid title for file");
//                req.setAttribute("content", content);
//                req.getRequestDispatcher("googleDriveFileEdit.jsp").forward(req, resp);
//            }
//        } else {
//            log.info("Trying to access Google Drive without an access token, redirecting to OAuth servlet");
//            req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req, resp);
//        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
