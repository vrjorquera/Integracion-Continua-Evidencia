package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {

	public static String url ="jdbc:mysql://localhost:3306/petsmile";
	public static String usuario ="test";
	public static String clave ="test";
	public static String clase = "com.mysql.cj.jdbc.Driver";
	PreparedStatement ps=null;
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			Class.forName(clase);
			conexion = (Connection) DriverManager.getConnection(url, usuario, clave);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return conexion;
	}
	
	public ResultSet ejecutarConsulta(String sql) throws Exception{
		Statement st = null;
		st= conectar().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	
	public void desconectar() throws SQLException {
		conectar().close();
	}
	
	
}