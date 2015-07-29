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
		this.size = size;
		value = (E[]) new Object[size];
	}
	public void empty(){
		for(int i=0; i<size; i++){
			value[i]=null;
		}
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public void push(E x){
		if(top==(size-1))
			System.out.println("Stack lleno, no se pueden agregar más objetos.");
		else
			value[++top] = x;
		System.out.println("Element: '"+value[top]+"' pushed");
	}
	public E pop() throws Exception{
		if(top==-1)
			throw new Exception("Stack vacío. No hay nada que retirar.");
		else{
			return value[top--];	
		}
	}
	public int size(){
		return size;
	}
	public E peek() throws Exception{
		if(top==-1)
			throw new Exception("Stack vacío. No hay ningún pico.");
		return value[top-1];
	}
}
