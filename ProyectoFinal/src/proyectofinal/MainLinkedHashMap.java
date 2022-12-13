package proyectofinal;

import java.util.LinkedHashMap;

/**
 *
 * @author camil
 */
public class MainLinkedHashMap {
    public static void main(String[] args) {
		LinkedHashMap<Integer,String> LHM = new LinkedHashMap<>();
		
		System.out.println("Método Put");
		LHM.put(1, "DaVinci"); 
		LHM.put(2, "Raffaello");
		LHM.put(3, "Kahlo");
		LHM.put(5, "MiguelAngel");
		LHM.put(8, "Picasso");
		LHM.put(13,"Dali");
		System.out.println(LHM);
		//Mediante el método Put podemos agregar los values con su 
		//key al LinkedHashMap
		
		
		System.out.println("\nMétodo IsEmpty"); 
		System.out.println(LHM.isEmpty());
		//Con este método podemos conocer si un LinkedHashMap 
		//esta lleno o vacio mediante un boooleano
		
		
		System.out.println("\nMétodo Get");
		System.out.println(LHM.get(1));
		//El método get funciona regresando el value asociado a la Key
		
		
		//Este método comprueba si existe la llave dentro del mapa 
		//y nos regresa un booleano
		System.out.println("\nMétodo ContainsKey");
		System.out.println(LHM.containsKey(13));
		//Al existir esta llave nos regresa un true
		System.out.println(LHM.containsKey(4));
		//Al no existir esta llave nos regresa un false
		
		
		//Este método comprueba si existe el valor dentro del mapa 
		//y tambien regresa un valor booleano
		System.out.println("\nMétodo ContainsValue");
		System.out.println(LHM.containsValue("Kahlo"));
		//Al existir este valor nos regresa un true
		System.out.println(LHM.containsValue("Rembrant"));
		//Al no existir este valor nos regresa un false
		
		
		System.out.println("\nMétodo KeySet");
		for(Integer indi:LHM.keySet()) { 
			System.out.println(LHM.get(indi));
		}
		//Este método regresa una lista con todos los valores pero 
		//sin llaves
		
		
		System.out.println("\nMétodo Size");
		System.out.println(LHM.size());
		//Con este método podemos obtener el tamaño de nuestro 
                //LinkedHashMap
		
		
		System.out.println("\nMétodo Clone"); 
		Object LHM2=LHM.clone();
		System.out.println(LHM2);
		//Con este método podemos clonar nuestro
		//LinkedHashMap para almacenarlo como un objeto
		
		
		System.out.println("\nMétodo Replace");
		LHM.replace(5, "Monet");
		System.out.println(LHM.get(8));
		//Este método remplaza el valor mediante la llave
		
		
		System.out.println("\nMétodo Remove");
		//Con este método podemos eliminar el value mediante el key 
		System.out.println(LHM.remove(2));
		//Si se imprime el remove nos muestra el valor que elimino
		System.out.println(LHM.remove(93));
		//En caso de que la llave no exista imprimira un null
		System.out.println(LHM);
		
		
		System.out.println("\nMétodo clear");
		LHM.clear();
		System.out.println(LHM);
		//El método clear borra todo el contenido
		//dentro del LinkedHashMap
		
	}
}
    