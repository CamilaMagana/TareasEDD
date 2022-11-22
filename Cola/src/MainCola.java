/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camil
 */
public class MainCola {
    
    public static void main(String[] args){
       
       ColaADT cola = new ColaADT();
       System.out.println (cola.estaVacia());
       cola.enqueue("Perrito");
       cola.enqueue("panzón");
       cola.enqueue("todo chiquito|todo panzón");
       System.out.println (cola.toString());
       System.out.println (cola.estaVacia());
       System.out.println(cola.longitud());
       cola.enqueue("'Ay miren al perro, todo chiquito todo panzón'");
       cola.dequeue();
       System.out.println(cola.toString());
   }     
}
