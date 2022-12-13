package proyectofinal;

/**
 *
 * @author camil
 */

    import java.util.HashMap;

public class MainHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> HM = new HashMap<>();
		
		System.out.println("Método Put");
		HM.put(1, "DaVinci"); 
		HM.put(2, "Raffaello");
		HM.put(3, "Kahlo");
		HM.put(5, "MiguelAngel");
		HM.put(8, "Picasso");
		HM.put(13,"Dali");
		System.out.println(HM);
		//Mediante el método Put podemos agregar los values con su 
		//key al HashMap
		
		
		System.out.println("\nMétodo IsEmpty"); 
		System.out.println(HM.isEmpty());
		//Con este método podemos conocer si un 
		//HashMap esta lleno o vacio mediante
		//un boooleano
		
		
		System.out.println("\nMétodo Get");
		System.out.println(HM.get(2));
		//El método get funciona regresando el value
		//asociado a la Key
		
		
		//Este método comprueba si existe la llave dentro del mapa 
		//y nos regresa un booleano
		System.out.println("\nMétodo ContainsKey");
		System.out.println(HM.containsKey(1));
		//Al existir esta llave nos regresa un true
		System.out.println(HM.containsKey(7));
		//Al no existir esta llave nos regresa un false
		
		
		//Este método comprueba si existe el valor dentro del mapa 
		//y tambien regresa un valor booleano
		System.out.println("\nMétodo ContainsValue");
		System.out.println(HM.containsValue("Kahlo"));
		//Al existir este valor nos regresa un true
		System.out.println(HM.containsValue("Rembrant"));
		//Al no existir este valor nos regresa un false
		
		
		System.out.println("\nMétodo KeySet");
		for(Integer indi:HM.keySet()) { 
			System.out.println(HM.get(indi));
		}
		//Este método regresa una lista con 
		//todos los valores pero sin llaves
		
		
		System.out.println("\nMétodo Size");
		System.out.println(HM.size());
		//Con este método podemos obtener el 
		//tamaño de nuestro HashMap
		
		
		System.out.println("\nMétodo Clone"); 
		Object HM2=HM.clone();
		System.out.println(HM2);
		//Con este método podemos clonar nuestro
		//HashMap para almacenarlo como un objeto
		
		System.out.println("\nMétodo Compute");
		HM.compute(1, (key, val) -> val.concat(" Italia"));
                HM.compute(2, (key, val) -> val.concat(" Italia"));
                System.out.println("Nuevo Map: " + HM);
                //Con este metodo podemos actualizar datos de valor
        	
		
		System.out.println("\nMétodo Replace");
		HM.replace(5, "Monet");
		System.out.println(HM.get(5));
		//Este método remplaza el valor mediante 
		//la llave
		
		
		System.out.println("\nMétodo Remove");
		//Con este método podemos eliminar 
		//el value mediante el key 
		System.out.println(HM.remove(13));
		//Si se imprime el remove nos muestra 
		//el valor que elimino
		System.out.println(HM.remove(71));
		//En caso de que la llave no exista 
		//imprimira un null
		System.out.println(HM);
		
		
		System.out.println("\nMétodo clear");
		HM.clear();
		System.out.println(HM);
		//El método clear borra todo el contenido
		//dentro del HashMap
		
	}
}

