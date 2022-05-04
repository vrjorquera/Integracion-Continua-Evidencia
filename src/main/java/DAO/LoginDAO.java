package DAO;

import java.sql.ResultSet;
import DB.conexion;
import Model.Usuario;

import DB.conexion;
import Model.Usuario;

public class LoginDAO {
	
	String sql = "";
	String id = "";
	ResultSet rs = null;
	
	public String validar(String usr, String pass) throws Exception {
		conexion cn = new conexion();
		sql = "SELECT id FROM usuario WHERE nombreUsuario='"+usr+"' AND password='"+pass+"'";
		rs = cn.ejecutarConsulta(sql);
		while(rs.next()) {
			id=rs.getString("id");
		}
		cn.desconectar();
		return id;
	}
	
	public Usuario Read(String id) throws Exception {
		conexion cn = new conexion();
		Usuario user = new Usuario();
		sql = "SELECT * FROM agenda WHERE id='"+id+"'";
		rs = cn.ejecutarConsulta(sql);
		while(rs.next()) {
			//user.setnombreUsuario (rs.getString("usuario"));
			//user.setApellido(rs.getString("Apellido"));
			//user.setRut(rs.getString("Rut"));
			//user.setTelefono(rs.getInt("Telefono"));
			//user.setFechaIn(rs.getString("FechaIn"));
			}
		cn.desconectar();
		return user;
	}

}