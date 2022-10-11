/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimplementeL;

/**
 *
 * @author camil
 */
public class ListasLigadaADT <T> {
    Nodo<T> head;
	int tamanio;

	public ListasLigadaADT() {}

	// Esta vacio en booleano
	public boolean isEmpty() {
		System.out.println(this.head == null);
		return this.head==null;}

	// Para obtener el tamaño
	public int getLength() {
		System.out.println("El tamaño de la lista es de: " + this.tamanio);
		return this.tamanio;}

	// Para agregar al final
	public void addLast(T valor) {
		if (this.head == null) {
			head = new Nodo<>(valor);
                } else {
			Nodo<T> nuevo = new Nodo(valor);
			Nodo<T> aux = this.head;
			while (aux.getNext() != null) {
				aux = aux.getNext();}
			aux.setNext(nuevo);
			tamanio++; }
	}
        
	//Para agregar al inicio
	public void addFirst(T valor) {
		if (this.head == null) {
			head = new Nodo<>(valor);
		} else {
			Nodo<T> nuevo = new Nodo(valor);
			nuevo.setNext(head);
			head = nuevo;
			tamanio++;}
	}
        
	//Para gregar despues de
	public void addAt(T referencia, T valor) {
		if (this.head == null) {
			System.out.println("La lista está vacía, se agregará el valor como único elemento.");
			head = new Nodo<>(valor);
		} else {
			Nodo<T> nuevo = new Nodo(valor);

			Nodo<T> aux = this.head;
			Nodo<T> aux2 = this.head.getNext();

			while (aux.getDato() != referencia) {
				aux = aux.getNext();
				aux2 = aux2.getNext();
			}
			aux.setNext(nuevo);
			aux.getNext().setNext(aux2);
			tamanio++; }
	}
        
	//Para borrar
	public void delete(int posicion) {
		int posi = 0;
		if (head == null) {
			System.out.println("La lista está vacía, ingrese elementos a la lista para probar este método");
		} else {
			Nodo<T> aux_anterior = this.head;
			Nodo<T> aux = this.head.getNext();
			while (posi != posicion) {
				posi++;
				aux = aux.getNext();
				aux_anterior = aux_anterior.getNext();
			}
			aux_anterior.setDato(aux.getDato());
			aux_anterior.setNext(aux.getNext());
			tamanio--; }
	}
        
	//Para borrar al inicio
	public void deleteFirst() {
		Nodo<T> aux = this.head;
		aux.setDato(head.getNext().getDato());
		aux.setNext(head.getNext().getNext());
		tamanio--; }
        
	//Para borrar al final
	public void deleteLast() {
		Nodo<T> nuevo = this.head.getNext();
		Nodo<T> aux = this.head;
		while (nuevo.getNext() != null) {
			aux =aux.getNext();
			nuevo =nuevo.getNext(); }
		aux.setNext(null);
		tamanio--; }
        
	//Para buscar un elemento
	public void search(T valor) {
		Nodo<T> aux =this.head;
		int indice =0;
		try {
			while (aux.getDato() != valor && aux.getDato() !=null) {
				aux =aux.getNext();
				indice++; }
                        
			System.out.println("El dato '" + aux.getDato() + "' se encuentra en la posición: " + indice);
		} catch (Exception e) {
			System.out.println("El dato '" + valor + "' no pertenece a la lista, intenta con otro valor"); }
	}
        
	//Para actualizar
	public void update(T aBuscar, T valor) {
		Nodo<T> aux = this.head;
		try {
			while (aux.getDato() !=aBuscar) {
				aux =aux.getNext(); }
			aux.setDato(valor);
                        System.out.println("El dato '" + aBuscar + "' fue buscado y sustituido correctamente");
		} catch (Exception e) {
			System.out.println("El dato '" + aBuscar + "' no pertenece a la lista, entonces no se puede cambiar"); }
	}
        
	//Para mostrar de forma transversal
	public void transversal() {
		Nodo<T> aux =this.head;
		while (aux !=null) {
			System.out.print(aux);
			aux = aux.getNext(); }
		System.out.print("\n"); }
}
