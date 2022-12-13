package proyectofinal;

import java.util.TreeMap;
/**
 *
 * @author camil
 */

public class MainTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> TM = new TreeMap<>();
		
		System.out.println("Método Put");
		TM.put(1, "DaVinci"); 
		TM.put(2, "Raffaello");
		TM.put(3, "Kahlo");
		TM.put(5, "MiguelAngel");
		TM.put(8, "Picasso");
		TM.put(13,"Dali");
		System.out.println(TM);
		//Mediante el método Put podemos agregar los 
		//values con su key al TreeMap
		
		
		System.out.println("\nMétodo IsEmpty"); 
		System.out.println(TM.isEmpty());
		//Con este método podemos conocer si un TreeMap esta lleno o 
                //vacio mediante un boooleano
		
		
		System.out.println("\nMétodo Get");
		System.out.println(TM.get(13));
		//El método get funciona regresando el value asociado a la Key
		
		
		//Este método comprueba si existe la llave dentro del  
		//TreeMap y nos regresa un booleano
		System.out.println("\nMétodo ContainsKey");
		System.out.println(TM.containsKey(5));
		//Al existir esta llave nos regresa un true
		System.out.println(TM.containsKey(7384));
		//Al no existir esta llave nos regresa un false
		
		
		//Este método comprueba si existe el valor dentro del 
		//TreeMap y tambien regresa un valor booleano
		System.out.println("\nMétodo ContainsValue");
		System.out.println(TM.containsValue("Kahlo"));
		//Al existir este valor nos regresa un true
		System.out.println(TM.containsValue("Perro Bermudez"));
		//Al no existir este valor nos regresa un false
		
		
		System.out.println("\nMétodo KeySet");
		for(Integer indi:TM.keySet()) { 
			System.out.println(TM.get(indi));
		}
		//Con este método regresa una lista con todos los valores
                //pero sin llaves
		
		
		System.out.println("\nMétodo FirstKey"); 
		System.out.println(TM.firstKey());	
		//Con este método se devuelve la primer llave dentro del TreeMap
		
		
		System.out.println("\nMétodo LastKey"); 
		System.out.println(TM.lastKey());			  
		//Con este método se devuelve la ultima llave dentro del TreeMap
		
		
		System.out.println("\nMétodo HigherKey");  
		System.out.println(TM.higherKey(8));          
		//Con este método se devuelve la siguente
		//llave despues de la llave ingresada
		
		
		System.out.println("\nMétodo LowerKey");
		System.out.println(TM.lowerKey(3));		   
		//Con este método se devuelve la llave
                //anterior a la llave ingresada
		
		
		System.out.println("\nMétodo FirstEntry");
		System.out.println(TM.firstEntry());
		//Con este método se devuelve el primer par
                //de llave valor del TreeMap
		
		
		System.out.println("\nPrueba del metodo LastEntry"); 
		System.out.println(TM.lastEntry());		    
		//Con este método se devuelve el ultimo par
		//llave valor dentro del TreeMap
		
		System.out.println("\nMétodo Size");
		System.out.println(TM.size());
		//Con este método podemos obtener el tamaño de nuestro TreeMap
		
		
		System.out.println("\nMétodo Clone"); 
		Object TM2=TM.clone();
		System.out.println(TM2);
		//Con este método podemos clonar nuestro
		//TreeMap para almacenarlo como un objeto
		
		
		System.out.println("\nMétodo Replace");
		TM.replace(13, "Caravaggio");
		System.out.println(TM.get(13));
		//Este método remplaza el valor mediante la llave
		
		
		System.out.println("\nMétodo Remove");
		//Con este método podemos eliminar el value mediante el key 
		System.out.println(TM.remove(13));
		//Si se imprime el remove nos muestra el valor que elimino
		System.out.println(TM.remove(189));
		//En caso de que la llave no exista imprimira un null
		System.out.println(TM);
		
		
		System.out.println("\nMétodo clear");
		TM.clear();
		System.out.println(TM);
		//El método clear borra todo el contenido dentro del TreeMap
	}
}

