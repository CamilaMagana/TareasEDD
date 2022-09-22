/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaconjuntos;
import java.util.ArrayList;
/**
 *
 * @author camil
 */
public class TareaConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    conjunto <Integer> c1 = new conjunto();
        conjunto <Integer> c2 = new conjunto();

        // Para añadir elementos a cada conjunto
        c1.add(0);
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(3);
        c1.add(4);
        c2.add(5);
        c2.add(6);
        c2.add(7);
        c2.add(8);
        c2.add(9);
        c2.add(10);

        // Para conocer el tamaño de conjuntos
        System.out.println("Tamaño conjunto 1 " + c1.length());
        System.out.println("Tamaño conjunto 2" + c2.length());

        // Para conocer el contenido de cada conjunto 
        System.out.println("El conjunto 1 contiene 0 " + c1.contains(0));
        System.out.println("El conjunto 2 contine 7 " + c2.contains(7));
        
        // Igualando conjuntos 
        System.out.println("Conjunto 1 == Conjunto 2 " + c1.equals(c2));
        
        // Para eliminar un contenido de un conjunto
        c1.remove(4);
        c2.remove(10);

        // Hcer subconjuntos
        System.out.println("Conjunto 1 subconjunto Conjunto 2 " + c1.isSubset(c2));
        
        // Para sacar la diferencia entre los conjuntos
        conjunto <Integer> conjunto_difference = c1.difference(c2);
        System.out.println("Diferencia entre Conjunto 1 y Conjunto 2 " + conjunto_difference);
        
        // Para hacer la unión de conjuntos
        c1.union(c2);
        System.out.println("Conjunto 1 UNION (U) Conjunto 2 " + c1);
        
        // Para hacer la intersección entre conjuntos
        conjunto <Integer> conjunto_intersection = c1.intersection(c2);
        System.out.println("La intersección del Conjunto 1 Conjunto 2 " + conjunto_intersection);

       
    }
    
}
