/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.Stack;

/**
 *
 * @author camil
 */
        
  public class Nodo <T>{
    
    private T value;
    
	private Nodo <T> next;

	public Nodo() {}

	public Nodo(T valor) {
		this.value = valor;}

	public Nodo(T dato, Nodo <T> siguiente) {
		this.value = dato;
		this.next = siguiente;}

	public Nodo <T> getNext() {
		return next;}

	public void setNext(Nodo <T> siguiente) {
		this.next = siguiente;}

	public T getDato() {
		return value;}

	public void setDato(T dato) {
		this.value = dato;}

	@Override
	public String toString() {
		return "/" + value + "";}
}  

