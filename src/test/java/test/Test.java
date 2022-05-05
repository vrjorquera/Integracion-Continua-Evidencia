package test;

import static org.junit.Assert.*;
import DB.conexion;
import DAO.LoginDAO;

import org.junit.After;
import org.junit.Before;

public class Test {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("static-access")
	@org.junit.Test
	public void testConexion() {
		System.out.println("Ingreso de nombre de usuario con datos almacenados en BD.");
		try {
			conexion instance = new DB.conexion();
			String resultado = "";
			if(instance.conectar() != null) {
				resultado = "OK";
			}else {
				resultado = "noOK";
			}
			//assertEquals(resultado, "Conexion OK");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	@SuppressWarnings("static-access")
	@org.junit.Test
	public void testIngreso() {
		System.out.println("Ingreso de nombre de usuario y passoword con datos erróneos.");
		try {
			conexion instance = new DB.conexion();
			String resultado = "";
			if(instance.conectar() != null) {
				resultado = "OK";
			}else {
				resultado = "noOK";
			}
			//assertEquals(resultado, "Conexion OK");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	@SuppressWarnings("static-access")
	@org.junit.Test
	public void testRegistro() {
		System.out.println("Registro de hora medica veterinaria.");
		try {
			conexion instance = new DB.conexion();
			String resultado = "";
			if(instance.conectar() != null) {
				resultado = "OK";
			}else {
				resultado = "noOK";
			}
			//assertEquals(resultado, "Conexion OK");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
	
}


