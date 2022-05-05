<%@ page language="java" %>
<%@ page import = "java.sql.Connection"%>
<%@ page import = "java.sql.DriverManager"%> 
<%@ page import = "java.sql.ResultSet"%> 
<%@ page import = "java.sql.Statement"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="tect/html; charset=UTF-8">
<meta charset="ISO-8859-1">
<link href="css/main.css" rel="stylesheet" type="text/css" />

<title>Login</title>

</head>

<body>

<div class="container">

<h1>Agenda</h1>

	<div class="nav">
		<a href="agendar.jsp">Agendar Cita</a> | <a href="list-agenda.jsp">Lista Agenda</a> | <a href="login.jsp">Salir</a>
	</div>
	
	</br>

<%
try
{
   // Conexion con bd
   //Class.forName("com.mysql.cj.jdbc.Driver");
   Class.forName("com.mysql.jdbc.Driver");
   Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/petsmile", "test", "test");
   if (!conexion.isClosed())
   {
      // La consulta
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery("select * from agenda" );

      // Ponemos los resultados en un table de html
      out.println("<table width=\"700\" cellpadding=\"4\" border=\"1\" bordercolor=\"#666666\"><tr><td>Id</td><td>Mascota</td><td>Dueño</td><td>Mascota Nombre</td><td>Hora</td><td>Fecha</td></tr>");
      while (rs.next())
      {
         out.println("<tr>");
         out.println("<td>"+rs.getObject("id")+"</td>");
         out.println("<td>"+rs.getObject("idMascota")+"</td>");
         out.println("<td>"+rs.getObject("rutDueno")+"</td>");
         out.println("<td>"+rs.getObject("nombreMascota")+"</td>");
         out.println("<td>"+rs.getObject("hora")+"</td>");
         out.println("<td>"+rs.getObject("fecha")+"</td>");
         out.println("</tr>");
      }
      out.println("</table>");

      // cierre de la conexion
      conexion.close();
   }
   else
      // Error en la conexion
      out.println("fallo!");
}
catch (Exception e)
{
   // Error en algun momento.
   out.println("Excepcion "+e);
   e.printStackTrace();
}
%>

</div>

</body>
</html>