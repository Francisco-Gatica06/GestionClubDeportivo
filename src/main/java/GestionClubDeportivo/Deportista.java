package GestionClubDeportivo;

public class Deportista {

	private string nombre;
	private string apellido;
	private string celular;
	private string deporte;

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(string apellido) {
		this.apellido = apellido;
	}

	public string getCelular() {
		return this.celular;
	}

	/**
	 * 
	 * @param celular
	 */
	public void setCelular(string celular) {
		this.celular = celular;
	}

	public string getDeporte() {
		return this.deporte;
	}

	/**
	 * 
	 * @param deporte
	 */
	public void setDeporte(string deporte) {
		this.deporte = deporte;
	}

}