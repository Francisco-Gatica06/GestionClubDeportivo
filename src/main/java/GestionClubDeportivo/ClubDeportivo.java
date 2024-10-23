package GestionClubDeportivo;
import java.util.ArrayList;
import java.util.List;

public class ClubDeportivo {

	private String nombre;
	private List<Partido> partido;

	public ClubDeportivo(String nombre) {
		this.nombre = nombre;
		this.partido = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean registrarPartido(Partido partido) {
		// TODO - implement ClubDeportivo.registrarPartido
		throw new UnsupportedOperationException();
	}

	public boolean modificarPartido(Partido partido) {
		// TODO - implement ClubDeportivo.modificarPartido
		throw new UnsupportedOperationException();
	}

	public boolean eliminarPartido(Partido partido) {
		// TODO - implement ClubDeportivo.eliminarPartido
		throw new UnsupportedOperationException();
	}
}