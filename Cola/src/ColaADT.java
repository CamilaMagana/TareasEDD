/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author camil
 */
public class ColaADT<T> {
    int tamanio;
    ArrayList<T> colas = new ArrayList<>();
    int top = 0;
    
    public ColaADT(){
    }

    public boolean estaVacia(){
        return this.tamanio == 0;
    }
    
    public int longitud(){
        return this.tamanio;
    }
    
    public T dequeue () {
		T delete = null;
		if (estaVacia() == true) {
                    System.out.println("-COLA VACÍA-");
                    System.out.println("-Agrega datos para usar la pila-");
                } else {
                    delete = colas.remove(0);
                    this.tamanio--;
                }
		return delete;
	}


	public void enqueue(T dato) {
		colas.add(top, dato);
		this.top++;
		this.tamanio++;
	}

	@Override
	public String toString() {
		return "La cola contiene: " + colas ;
	}

   
}
    
