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
		System.out.println("TEST Ok: Conexion");
		try {
			conexion instance = new DB.conexion();
			String resultado = "";
			if(instance.conectar() != null) {
				resultado = "Conexion OK";
			}else {
				resultado = "Conexion noOK";
			}
			//assertEquals(resultado, "Conexion OK");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
}


