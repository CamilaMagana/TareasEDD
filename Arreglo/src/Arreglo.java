/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author camil
 */

public class Arreglo { 
    private int tam;
    private int lon;
    private int elem;
    private String val;
    private int ind;
	
    public Arreglo(int tamanio, int longitud, int elemento) {
	this.tam = tamanio;
	this.lon = longitud;
	this.elem = elemento;
	}
	public int getLongitud() {  
		return tam;
	}
	public int getElemento(int indice) {
		return elem;
	}
	public void setElemento(int indice, String valor) {
		this.ind = indice;
        this.val = valor;
	}
	public void limpiar (String valor){     
    }	
	@Override
	public String toString() {
		return "Arreglo [" + "tamanio: " + tam + ", longitud:" + lon + ", elemento:" + elem + ']';
	}
}