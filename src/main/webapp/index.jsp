<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
<%request.getSession().setAttribute("vengoLol", true);%>
  <head>
		  
	<link rel="icon" type="image/jpg" href="https://i.ibb.co/BqntJ8D/icono.png">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>GameShup</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    	     <link rel="stylesheet" type="text/css" href="css/index.css"/>
    
  </head>

  <body>
  <div class="media">
  <img src="https://i.ibb.co/BqntJ8D/icono.png" class="mr-3" alt="..." width="100" height="100">
  <div class="media-body">
    <h2 class="display-3" style="color:#ffffff;">GameShup</h2>
  </div>
</div>

<nav class="navbar navbar-expand-lg navbar-light bg-light">

 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation"> -->

  <span class="navbar-toggler-icon"></span>
 </button>
<div>
<ul class="navbar-nav">
 <li class="nav-item dropdown">
    <a class="nav-link dropdown-toggle navbar-brand" data-toggle="dropdown" style="color:#E9A719" href="#" role="button" aria-haspopup="true" aria-expanded="false">GameShup</a>

    <div class="dropdown-menu">
      <a class="dropdown-item" href="pubgbusqueda.jsp">Player Unknown BattleGrounds</a>
      <a class="dropdown-item" href="lolbusqueda.jsp">League of Legends</a>
      
    </div>
  </li>

    
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/componentes.jsp">Componentes del grupo</a>
      </li>

      <li class="nav-item">
        <form method="POST" id="myform" action="/googleDriveFileList">
  		<input class="nav-link" id="botonLol" name="botonLol" type="submit" value="Mis partidas LoL" style="border:none;background:none;"/>
		</form>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/googleDriveFileList">Mis partidas PUBG</a>
      </li>
    
      
    </ul>
 </div>
 </nav>
 	<br><br><br><br>
 	
 	<p align="center" style="border: PowderBlue 5px double; margin: 10px 305px 100px 305px;  border-top-left-radius: 20px; border-bottom-right-radius: 20px; padding: 3px 10px;; background-color: #ffffff9e; color: black; font-family: arial,helvetica; font-size: 12px; font-weight: bold;">
 					<br><em><b> ¡Bienvenidos a GameShup!</b></em></br>
 					<br>GameShup es un proyecto de varios alumnos para una asignatura de la carrera. Es una aplicación</br>
 					 <br> destinada a la recolección de las estadísticas de cada jugador distribuidas en partidas. La idea</br>
 					  <br>surgio de la necesidad de descubir el rendimiento y la evolución de otros jugadores, para seguir</br>
 					<br>  fomentando la rivalidad actual en los videojuegos. En este caso, GameShup estará enfocada en </br>
 					 <br> dos juegos, que son League of Legends y el mítico Player Unknows Battleground, más conocido como</br>
 					 <br> PUBG. Se podrá elegir cualquiera de los dos juegos, e introduciendo el nickname y eligiendo la season</br>
 					 <br> o region, se desplegarán las últimas partidas con sus estadísticas. Cabe recordar que la season es </br>
 					 <br> la temporada que, normalmente, van acorde con el año en el que vivimos. A continuación podrán </br>
 					<br>  seleccionar cualquiera de los dos juegos para acceder a su descripción y un trailer. </br>
 					<br></br></p>
 	
 	
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
     
  </body>
</html>
