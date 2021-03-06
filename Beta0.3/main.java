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
 * Clase main que permite la interaccion usuario-programa
 * @author Julio Gonzalez, Diego Morales, Diego Sosa
 */
public class main{
     /**
	 * Clase main que permite la interaccion usuario-programa
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora<Double> nCalculadora = new Calculadora<Double>();
		try {
			nCalculadora.readFile("datos.txt");
		} 	catch(FileNotFoundException e){
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}
		
	}
}
