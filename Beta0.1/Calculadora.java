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

public class Calculadora<P> implements ADTCalculadora<P>{
	private P value;
	public void readFile(String file) throws FileNotFoundException{
		System.out.println("readFile");
	}
	public P calcular(){
		System.out.println("calcular");
		return value;
	}
	
}
