package GestionClubDeportivo;

public class Entrenador {

	private String nombre;
	private String experiencia;
	private String deporteEspecializacion;

	public Entrenador(String nombre, String experiencia, String deporteEspecializacion) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.deporteEspecializacion = deporteEspecializacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**{
		return this.experiencia;
	}
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	/**
	 * 
	 * @param experiencia
	 */
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getDeporteEspecializacion() {
		return this.deporteEspecializacion;
	}

	/**
	 * 
	 * @param deporteEspecializacion
	 */
	public void setDeporteEspecializacion(String deporteEspecializacion) {
		this.deporteEspecializacion = deporteEspecializacion;
	}

	public void getAttribute() {
		// TODO - implement Entrenadorr.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Entrenadorr.setAttribute
		throw new UnsupportedOperationException();
	}

}