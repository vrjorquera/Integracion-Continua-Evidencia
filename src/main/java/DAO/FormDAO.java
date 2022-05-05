package DAO;

import java.sql.ResultSet;
import DB.conexion;
import Model.Usuario;

import DB.conexion;
import Model.Usuario;

public class FormDAO {
	
	String sql = "";
	String id = "";
	String guardar = "";
	ResultSet rs = null;
	boolean resul = false;
	
	public boolean Guardar(int txtidMascota, int txtrutDueno, String txtnombreMascota, String txthora, String txtfecha) throws Exception {
		conexion cn = new conexion();
		sql = "INSERT INTO agenda VALUES(0, "+txtidMascota+","+txtrutDueno+",'"+txtnombreMascota+"','"+txthora+"','"+txtfecha+"')";
		resul = cn.guardarConsulta(sql);
		cn.desconectar();
		return resul;
	}

}