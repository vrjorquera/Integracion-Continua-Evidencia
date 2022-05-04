package Model;

public class Mascota {
	private String tipoMascota, nombreMascota;
	private int idMascota , rutDueno, edad;
	
	public Mascota() {
		super();
	}

	public Mascota(int idMascota , int rutDueno, String tipoMascota, int edad, String nombreMascota) {
		super();
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.tipoMascota = tipoMascota;
		this.edad = edad;
		this.nombreMascota = nombreMascota;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public int getRutDueno() {
		return rutDueno;
	}

	public void setRutDueno(int rutDueno) {
		this.rutDueno = rutDueno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

