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

import java.io.FileNotFoundException;

/**
 * @author Diego Morales, Diego Sosa, Julio Gonzalez
 * Clase Interfaz para implementar metodos en la clase Calculadora
 * @param <P>
 */
public interface ADTCalculadora<P> {
	/**
	 * Metodo que permite leer l archivo .txt y lo que este contiene para el programa
	 * @param file
	 * @throws FileNotFoundException
	 * @throws Exception
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;
	/**
	 * Metodo que permite observar lo que habia dentro de la cadena operar los numeros y 
	 * determinar si es operable lo que contiene o no ademas de tener el resultado final 
	 * @return P
	 * @throws Exception
	 */
	public P calcular() throws Exception;
	
	
}
