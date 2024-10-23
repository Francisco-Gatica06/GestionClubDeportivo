package GestionClubDeportivo;

public class Partido {

	private String local;
	private String visitante;
	private String resultado;
	private String fecha;
	private Cancha cancha;
	private String deporte;

	public Partido(String local, String visitante, String resultado, String fecha, Cancha cancha, String deporte) {
		this.local = local;
		this.visitante = visitante;
		this.resultado = resultado;
		this.fecha = fecha;
		this.cancha = cancha;
		this.deporte = deporte;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getVisitante() {
		return this.visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cancha getCancha() {
		return this.cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public String getDeporte() {
		return this.deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

}