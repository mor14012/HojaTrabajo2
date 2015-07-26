/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carné: 14012
Diego Sosa. Carné: 14735
Julio González. Carné: 14096
30/07/2015
Hoja de Trabajo 2
*/

public class Stack<E> implements ADTStack{
	private E value;
	public Stack(E value){
		this.value=value;
	}
	public void empty(){
		System.out.println("empty");
	}
	public boolean isEmpty(){
		System.out.println("isEmpty");
		return true;
	}
	public void push(E x){
		System.out.println("push");
	}
	public E pop() throws Exception{
		System.out.println("pop");
	}
	public int size(){
		System.out.println("size");
		return 0;
	}
	public E peek() throws Exception{
		System.out.println("peek");
	}
}
