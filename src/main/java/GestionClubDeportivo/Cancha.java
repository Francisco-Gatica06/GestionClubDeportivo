package GestionClubDeportivo;

public class Cancha {

	private String tipoSuperficie;
	private String ubicacion;
	private int capacidad;
	private boolean disponible;

	public Cancha(String tipoSuperficie, String ubicacion, int capacidad, boolean disponible) {
		this.tipoSuperficie = tipoSuperficie;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
		this.disponible = disponible;
	}

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	/**
	 * 
	 * @param tipoSuperficie
	 */
	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	/**
	 * 
	 * @param ubicacion
	 */
	public void setUbicacion(String ubicacion) {
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