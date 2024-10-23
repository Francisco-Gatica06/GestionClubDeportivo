package GestionClubDeportivo;

public class Deportista {

	private String nombre;
	private String apellido;
	private String celular;
	private String deporte;

	public Deportista(String nombre, String apellido, String celular, String deporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.deporte = deporte;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDeporte() {
		return this.deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

}