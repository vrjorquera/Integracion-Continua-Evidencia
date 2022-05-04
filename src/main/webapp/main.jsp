<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
 %>
 <% 
 	int id = (int)request.getAttribute("id");
 	int idMascota = (int)request.getAttribute("idMascota");
 	int rutDueño = (int)request.getAttribute("rutDueño");
 	String nombreMascota = (String)request.getAttribute("nombreMascota");
 	String hora = (String)request.getAttribute("hora");
 	String fecha = (String)request.getAttribute("fecha");
 %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="tect/html; charset=UTF-8">
<meta charset="ISO-8859-1">
<link href="main.css" rel="stylesheet" type="text/css" />

<title>Login</title>

</head>

<body>

<div align="center">

		<form method="POST" action="index.jsp?menj=1">
		
		<table width="700" border="1" cellpadding="4" cellspacing="0" bordercolor="#666666">
		  <tr>
		    <td>ID:</td>
		    <td>Id Mascota:</td>
		    <td>Rut Dueño:</td>
		    <td>Mascota:</td>
		    <td>Hora:</td>
		    <td>Fecha:</td>
		    <td> </td>
		  </tr>
		  <tr>
		    <td><%=id %></td>
		    <td><%=idMascota %></td>
		    <td><%=rutDueño %></td>
		    <td><%=nombreMascota %></td>
		    <td><%=hora %></td>
		    <td><%=fecha %></td>
		    <td><input type="submit" name="btn-detalle" value="Detalle"></td>
		  </tr>
		</table>
				
		</form>
		
</div>

</body>
</html>