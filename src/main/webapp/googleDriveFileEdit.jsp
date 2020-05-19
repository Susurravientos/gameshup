<%@include file="includes/header.jsp"%>
<%@page import="aiss.MatchLoL"%>
<%@page import="aiss.MatchLoL2"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<% String controller = "/googleDriveFileNew"; %>

<c:if test="${not empty file}">
    <% controller = "/googleDriveFileUpdate";%>
</c:if>

<div class="container">

    <p class="message">${message}</p>

    <form action="<%= controller%>" method="post">
        <c:if test="${not empty file}">
            <input type="hidden" name="id" value="${file.id}">
        </c:if>
        <label for="title">File name:</label>
        <%String titulo = "GameShup " +request.getAttribute("asesinatos")+request.getAttribute("asistencias")+request.getAttribute("muertes")+request.getAttribute("tripleKills")+ request.getAttribute("quadraKills")+ request.getAttribute("pentaKills");%>
        <input type="text" name="title" id="title" value="<%=titulo%>"
             
               />
        <label for="content">Content:</label>
        <%String contenido = ""; 
        contenido+="Campe�n invocado : " +  request.getAttribute("campeon");
        contenido+= "\nN�mero de asesinatos  :  " + request.getAttribute("asesinatos");
        contenido+= "\nN�mero de asistencias :  " + request.getAttribute("asistencias");
        contenido+= "\nN�mero de muertes     :  " + request.getAttribute("muertes");
        contenido+= "\nN�mero de asesinatos triples :  " + request.getAttribute("tripleKills");
        contenido+= "\nN�mero de asesinatos cu�druples :  " + request.getAttribute("quadraKills");
        contenido+= "\nN�mero de pentakills :  " + request.getAttribute("pentaKills");
         
        
        %>
        <textarea id="content" name="content"><%=contenido%></textarea>

        <div class="bottom_links">
            <button type="submit" class="button">Submit</button>
            <button type="button" onClick="javascript:window.location.href = '/'" class="button">Cancel</button>
        </div>
    </form>
</div>

<%@include file="includes/footer.jsp"%>
