package edd.Stack;

/**
 *
 * @author camil
 */
public class MainStackADT {
   
   public static void main(String[] args){
       
       StackADT perrito = new StackADT();
       System.out.println (perrito.estaVacia());
       perrito.pop();
       perrito.push("Perrito");
       perrito.push("panzón");
       perrito.push("todo chiquito|todo panzón");
       System.out.println (perrito.toString());
       System.out.println (perrito.estaVacia());
       
       System.out.println(perrito.pop());
       System.out.println(perrito.peek());
       System.out.println(perrito.longitud());
       perrito.push("'Ay miren al perro, todo chiquito todo panzón'");
       System.out.println (perrito.toString());
   }       
}
