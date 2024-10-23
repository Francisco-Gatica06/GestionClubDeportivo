package GestionClubDeportivo;

public class Partido {

	private string local;
	private string visitante;
	private string resultado;
	private string fecha;
	private Cancha cancha;
	private string deporte;

	public string getLocal() {
		return this.local;
	}

	/**
	 * 
	 * @param local
	 */
	public void setLocal(string local) {
		this.local = local;
	}

	public string getVisitante() {
		return this.visitante;
	}

	/**
	 * 
	 * @param visitante
	 */
	public void setVisitante(string visitante) {
		this.visitante = visitante;
	}

	public string getResultado() {
		return this.resultado;
	}

	/**
	 * 
	 * @param resultado
	 */
	public void setResultado(string resultado) {
		this.resultado = resultado;
	}

	public string getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(string fecha) {
		this.fecha = fecha;
	}

	public Cancha getCancha() {
		return this.cancha;
	}

	/**
	 * 
	 * @param cancha
	 */
	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
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