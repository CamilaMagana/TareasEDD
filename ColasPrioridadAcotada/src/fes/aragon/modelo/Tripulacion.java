package fes.aragon.modelo;

public class Tripulacion {
	private String tipo;
	private int prioridad;
	private int ordenLlegada;

	public Tripulacion(String tipo, int prioridad, int ordenLlegada) {
		super();
		this.tipo = tipo;
		this.prioridad = prioridad;
		this.ordenLlegada = ordenLlegada;
	}

	public int getOrdenLlegada() {
		return ordenLlegada;
	}

	public void setOrdenLlegada(int ordenLlegada) {
		this.ordenLlegada = ordenLlegada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Tripulacion [tipo=" + tipo + ", prioridad=" + prioridad + "]";
	}

}
