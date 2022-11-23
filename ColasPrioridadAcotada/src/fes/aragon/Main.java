package fes.aragon;

import fes.aragon.modelo.Barco;

public class Main {
	public static void main(String[] args) {
		Barco simulacion = new Barco();

		simulacion.enqueue("Niña", 1, 1);
		simulacion.enqueue("Maestre", 4, 2);
		simulacion.enqueue("Mecanico", 4, 3);
		simulacion.enqueue("Mujeres", 3, 4);
		simulacion.enqueue("Capitan", 5, 5);
		simulacion.enqueue("Timonel", 4, 6);
		simulacion.enqueue("3ra Edad", 2, 7);
		simulacion.enqueue("Hombres", 3, 8);
		simulacion.enqueue("Vigia", 4, 9);
		simulacion.enqueue("Niños", 2, 10);
		simulacion.tripulacion.imprimeToString();
		simulacion.dequeue();
		System.out.println("Despues del primero en salir: \n");
		simulacion.tripulacion.imprimeToString();
		
	}
}
