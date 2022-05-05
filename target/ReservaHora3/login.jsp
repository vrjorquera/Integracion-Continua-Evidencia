<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="tect/html; charset=UTF-8">
<meta charset="ISO-8859-1">
<link href="css/main.css" rel="stylesheet" type="text/css" />

<title>Login</title>

</head>
<%
	String menj="";
	if(request.getParameter("menj") != null){
		int r= Integer.parseInt(request.getParameter("menj"));
		if(r==0){
			menj="Error! - usuario o contraseña incorrectos";
		}
		if(r==1){
			menj="Conexion Ok";
		}
	}
%>
<body>

<div class="container">

<h1>Login</h1>

	<div class="nav">
		<a href="#">Inicio</a> 
	</div>
	
	</br>

		<form method="POST" action="ServletAuth">
		
		<table width="350" border="1" cellpadding="4" cellspacing="0" bordercolor="#666666">
		  <tr>
		    <td colspan="2"><p style="color:red; font-weight:bold;"><%=menj %></p></td>
		  </tr>
		  <tr>
		    <td>Usuario:</td>
		    <td><input type="text" id="username" name="txtusuario" placeholder="Usuario" required></td>
		  </tr>
		  <tr>
		    <td>Contraseña:</td>
		    <td><input type="password" id="password" name="txtclave" placeholder="Contraseña" required></td>
		  </tr>
		  <tr>
		    <td colspan="2"><input type="submit" id="loginbtn" name="btn-login" value="Ingresar"></td>
		  </tr>
		</table>

		</form>
		
</div>

</body>
</html>