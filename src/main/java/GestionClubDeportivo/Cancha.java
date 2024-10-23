package GestionClubDeportivo;

public class Cancha {

	private string tipoSuperficie;
	private string ubicacion;
	private int capacidad;
	private boolean disponible;

	public string getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	/**
	 * 
	 * @param tipoSuperficie
	 */
	public void setTipoSuperficie(string tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public string getUbicacion() {
		return this.ubicacion;
	}

	/**
	 * 
	 * @param ubicacion
	 */
	public void setUbicacion(string ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	/**
	 * 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	/**
	 * 
	 * @param disponible
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}