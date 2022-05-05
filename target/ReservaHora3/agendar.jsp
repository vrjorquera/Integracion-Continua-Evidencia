<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="tect/html; charset=UTF-8">
<meta charset="ISO-8859-1">
<link href="css/main.css" rel="stylesheet" type="text/css" />

<title>Insert title here</title>

</head>

<body>

<div class="container">

<h1>Agendar Hora</h1>

	<div class="nav">
		<a href="agendar.jsp">Agendar Cita</a> | <a href="list-agenda.jsp">Lista Agenda</a> | <a href="login.jsp">Salir</a>
	</div>
	
	</br>

	<form method="post" action="ServletForm">
	
		<table width="350" border="1" cellpadding="4" cellspacing="0" bordercolor="#666666">
		  <tr>
		    <td>Id Mascota:</td>
		    <td><input type="text" id="idMascota" name="txtidMascota" placeholder="id Mascota" required></td>
		  </tr>
		  <tr>
		    <td>Rut Dueño:</td>
		    <td><input type="text" id="rutDueño" name="txtrutDueno" placeholder="Rut Dueño" required></td>
		  </tr>
		  <tr>
		    <td>Nombre Mascota:</td>
		    <td><input type="text" id="nombreMascota" name="txtnombreMascota" placeholder="Nombre Mascota" required></td>
		  </tr>
		  <tr>
		    <td>Hora:</td>
		    <td><input type="date" id="hora" name="txthora" placeholder="Hora" required></td>
		  </tr>
		  <tr>
		    <td>Fecha:</td>
		    <td><input type="time" id="fecha" name="txtfecha" placeholder="Fecha" required></td>
		  </tr>
		  <tr>
		    <td colspan="2"><input type="submit" id="registrar" name="registrar" value="Registrar"></td>
		  </tr>
		</table>
		
	</form>
	
</div>

</body>
</html>