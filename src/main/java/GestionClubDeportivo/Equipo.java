package GestionClubDeportivo;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List<Deportista> deportistas;
	private Entrenador entrenador;


	public Equipo(String nombre, Entrenador entrenador) {
		this.nombre = nombre;
		this.entrenador = entrenador;
		this.deportistas = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean registrarDeportista(Deportista deportista) {
		// TODO - implement Equipo.registrarDeportista
		throw new UnsupportedOperationException();
	}

	public boolean modificarDeportista(Deportista deportista) {
		// TODO - implement Equipo.modificarDeportista
		throw new UnsupportedOperationException();
	}

	public boolean eliminarDeportista(Deportista deportista) {
		// TODO - implement Equipo.eliminarDeportista
		throw new UnsupportedOperationException();
	}

	public boolean registrarEntrenador(Entrenador entrenador) {
		// TODO - implement Equipo.registrarEntrenador
		throw new UnsupportedOperationException();
	}

	public boolean modificarEntrenador(Entrenador entrenador) {
		// TODO - implement Equipo.modificarEntrenador
		throw new UnsupportedOperationException();
	}

	public boolean eliminarEntrenador(Entrenador entrenador) {
		// TODO - implement Equipo.eliminarEntrenador
		throw new UnsupportedOperationException();
	}

}