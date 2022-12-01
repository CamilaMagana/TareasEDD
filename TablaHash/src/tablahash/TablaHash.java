/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablahash;

/**
 *
 * @author camil
 */
public class TablaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TablaHashADT<String, String> plantaFavorita = new TablaHashADT<>();
        
        plantaFavorita.add("Camila", "Savila");
        plantaFavorita.add("Jose Antonio", "La de petroleo");
        plantaFavorita.add("Emilio", "Lirio");
        plantaFavorita.add("Gabo", "Flores de loto");
        
        plantaFavorita.remove("Camila");
        System.out.println(plantaFavorita.valueOf("Camila"));
        
        System.out.println(plantaFavorita.valueOf("Emilio"));
    }
    
}
