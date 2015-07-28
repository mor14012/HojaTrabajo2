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

public class Stack<E> implements ADTStack<E>{
	private E[] value;
	private int size, top;

	public Stack(int size){
		top =-1;
		value = (E[]) new Object[size];
	}

	public void empty(){
		System.out.println("empty");
	}
	public boolean isEmpty(){
		System.out.println("isEmpty");
		return true;
	}
	public void push(E x){
		value[++top] = x;
		System.out.println("Element: '"+value[top]+"' pushed");
	}
	public E pop() throws Exception{
		System.out.println("pop");
		return value[top--];
	}
	public int size(){
		System.out.println("size");
		return 0;
	}
	public E peek() throws Exception{
		System.out.println("peek");
		return value[0];
	}
}
