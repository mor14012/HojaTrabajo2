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

/**
 * @author Diego Morales, Julio Gonzalez, Diego Sosa
 * Clase que permite controlar el stack 
 * @param <E>
 */
public class Stack<E> implements ADTStack<E>{
	/**
	 * Atributo de tipo E que son los valores que se ingresen al stack 
	 */
	private E[] value;
	/**
	 * Atributos que permiten saber el valor de encima y el tamano del stack 
	 */
	private int size, top;
	/**
	 * Cosntructor de la clase Stack 
	 * @param size
	 */
	public Stack(int size){
		top =-1;
		this.size = size;
		value = (E[]) new Object[size];
	}
	/* (non-Javadoc)
	 * @see hoja.ADTStack#empty()
	 */
	public void empty(){
		for(int i=0; i<size; i++){
			value[i]=null;
		}
	}
	/* (non-Javadoc)
	 * @see hoja.ADTStack#isEmpty()
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	/* (non-Javadoc)
	 * @see hoja.ADTStack#push(java.lang.Object)
	 */
	public void push(E x){
		if(top==(size-1))
			System.out.println("Stack lleno, no se pueden agregar más objetos.");
		else
			value[++top] = x;
	}
	/* (non-Javadoc)
	 * @see hoja.ADTStack#pop()
	 */
	public E pop() throws Exception{
		if(top==-1)
			throw new Exception("Stack vacío. No hay nada que retirar.");
		else{
			return value[top--];	
		}
	}
	/* (non-Javadoc)
	 * @see hoja.ADTStack#size()
	 */
	public int size(){
		return size;
	}
	/* (non-Javadoc)
	 * @see hoja.ADTStack#peek()
	 */
	public E peek() throws Exception{
		if(top==-1)
			throw new Exception("Stack vacío. No hay ningún pico.");
		return value[top-1];
	}
}
