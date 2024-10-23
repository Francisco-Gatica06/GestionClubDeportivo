package GestionClubDeportivo;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List<Deportista> deportistas;


	public Equipo(String nombre) {
		this.nombre = nombre;
		this.deportistas = new ArrayList<>();
	}
	/**
	 * 
	 * @param deportista
	 */
	public boolean registrarDeportista(Deportista deportista) {
		// TODO - implement Equipo.registrarDeportista
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deportista
	 */
	public boolean modificarDeportista(Deportista deportista) {
		// TODO - implement Equipo.modificarDeportista
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deportista
	 */
	public boolean eliminarDeportista(Deportista deportista) {
		// TODO - implement Equipo.eliminarDeportista
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entrenador
	 */
	public boolean registrarEntrenador(Entrenador entrenador) {
		// TODO - implement Equipo.registrarEntrenador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entrenador
	 */
	public boolean modificarEntrenador(Entrenador entrenador) {
		// TODO - implement Equipo.modificarEntrenador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entrenador
	 */
	public boolean eliminarEntrenador(Entrenador entrenador) {
		// TODO - implement Equipo.eliminarEntrenador
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}