package edd.Stack;
import java.util.ArrayList;

/**
 *
 * @author camil
 */

public class StackADT<T> {
    int tamanio;
    ArrayList<T> Stack = new ArrayList<>();
	int top = 0;

	public StackADT() {
	}

	public boolean estaVacia() {
		return this.tamanio == 0;
	}
        
       /* public T estaVacia2() {
            T vacia = null;
            if (estaVacia() == true) {
                System.out.println("-PILA VACÍA-");
            }else {
                vacia == estaVacia();
                        System.out.println("-PILA NO VACÍA");
            }
            return vacia;
        }*/
            
        
	public int longitud() {
		return this.tamanio;
	}

	public T pop () {
		T delete = null;
		if (estaVacia() == true) {
                    System.out.println("-PILA VACÍA-");
                    System.out.println("-Agrega datos para usar la pila-");
                } else {
                    delete = Stack.remove(top - 1);
                    this.top--;
                    this.tamanio--;
                }
		return delete;
	}

	public T peek() {
		T consulta = null;
		if (estaVacia() == true) {
			System.out.println("-PILA VACÍA-");
                        System.out.println("-Agrega datos para usar la pila-");
		} else {
			consulta = Stack.get(top - 1);
		}
		return consulta;
	}

	public void push(T dato) {
		Stack.add(top, dato);
		this.top++;
		this.tamanio++;
	}

	@Override
	public String toString() {
		return "La pila contiene: " + Stack ;
	}
}