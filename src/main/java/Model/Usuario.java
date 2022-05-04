package Model;

public class Usuario {
	private String nombreUsuario, password;
	private int id;
	
	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String password, int id) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}