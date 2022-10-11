/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimplementeL;

/**
 *
 * @author camil
 */
public class Listas <T> {
    
    public static void main(String[] args) {
		ListasLigadaADT<Integer> c = new ListasLigadaADT<>();

		System.out.println("¿El m\u00e9todo esta vacio?");
		c.isEmpty();

		System.out.println("\nM\u00e9todo de longitud");
		c.getLength();

		System.out.println("\nM\u00e9todo de agregar al final: ");
		c.addLast(18);
		c.transversal();

		System.out.println("\nM\u00e9todo para agregar al inicio: ");
		c.addFirst(19);
		c.transversal();

		System.out.println("\nM\u00e9todo para agregar despues: ");
		c.addAt(18, 17);
		c.transversal();
		c.addFirst(0);
		c.addLast(37);
		c.addLast(91);
		c.addLast(5);
		c.addLast(2222);
                c.addLast(10000);
                c.addLast(374834);
		c.addAt(5, 23);
                
		System.out.println("\nM\u00e9todo para agregar más elementos a la lista:");
		c.transversal();

		System.out.println("\nM\u00e9todo para eliminar elementos (eliminar el numero 5):");
		c.delete(6);
		c.transversal();

		System.out.println("\nM\u00e9todo para eliminar el último elemento (eliminar el numero 374834):");
		c.deleteLast();
		c.transversal();

		System.out.println("\nM\u00e9todo para eliminar el primer elemento (eliminar el 0):");
		c.deleteFirst();
		c.transversal();

		System.out.println("\nM\u00e9todo para buscar elementos:");
		c.search(37);
                c.search(123456); //Para que se corra la excepcion

		System.out.println("\nM\u00e9todo para actualizar:");
		c.update(18, 20);
                c.update(22, 191); //Para que se corra la excepcion
		c.transversal();

		System.out.println("\nM\u00e9todo para obtener el tamaño:");
		c.getLength();

		System.out.println("\nM\u00e9todo transversal:");
		c.transversal();

		System.out.println("\n¿El m\u00e9todo esta vacio?");
		c.isEmpty();
	}
}
