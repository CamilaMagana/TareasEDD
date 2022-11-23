package fes.aragon.modelo;

import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;

public class Barco {
//	Object[] tripulantes = new Object[5];
	public ListaSimple<Tripulacion> tripulacion = new ListaSimple<>();

	public void enqueue(String tipo, int prioridad, int llegada) {
		tripulacion.agregarEnCola(new Tripulacion(tipo, prioridad, llegada));
		for (int i = 0; i < tripulacion.getLongitud() - 1; i++) {
			for (int j = i + 1; j < tripulacion.getLongitud(); j++) {
				if (tripulacion.obtenerNodo(i).getPrioridad() > tripulacion.obtenerNodo(j).getPrioridad()) {
					Tripulacion tmp = tripulacion.obtenerNodo(i);
					tripulacion.asignar(tripulacion.obtenerNodo(j), i);
					tripulacion.asignar(tmp, j);
				} else if (tripulacion.obtenerNodo(i).getPrioridad() == tripulacion.obtenerNodo(j).getPrioridad()) {
					if (tripulacion.obtenerNodo(i).getOrdenLlegada() > tripulacion.obtenerNodo(j).getOrdenLlegada()) {
						Tripulacion tmp = tripulacion.obtenerNodo(i);
						tripulacion.asignar(tripulacion.obtenerNodo(j), i);
						tripulacion.asignar(tmp, j);
					}
				}
			}
		}

	}

	public void dequeue() {
		tripulacion.eliminarEnIndice(0);
	}

}
