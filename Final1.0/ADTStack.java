
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
 * @author Diego Morales, Diego Sosa, Julio Gonzalez
 * Clase interfaz que permite implementar metodos en clase Stack
 * @param <E>
 * 
 */



public interface ADTStack<E> {
	/**
	 * Metodo que permite vaciar el stack 
	 */
	public void empty();
	/**
	 * Metodo que permite determinar si el stack esta vacio o no 
	 * @return boolean 
	 */
	public boolean isEmpty();
	/**
	 * Metodo que permite  meter datos de tipo E a el stack 
	 * @param x
	 */
	public void push(E x) ;
	/**
	 * Metodo que permite sacar dato guardado en el stack 
	 * @return Atributo de tipo E
	 * @throws Exception
	 */
	public E pop() throws Exception;
	/**
	 * Metodo que permite saber el tamano del stack 
	 * @return int
	 */
	public int size();
	/**
	 * Metodo que mira el objeto encima del stack sin removerlo de este
	 * @return E
	 * @throws Exception
	 */
	public E peek() throws Exception;
	
}
