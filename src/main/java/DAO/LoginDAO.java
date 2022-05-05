package DAO;

import java.sql.ResultSet;
import DB.conexion;
import Model.Usuario;

import DB.conexion;
import Model.Usuario;

public class LoginDAO {
	
	String sql = "";
	String id = "";
	String guardar = "";
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
		cn.desconectar();
		return user;
	}

}