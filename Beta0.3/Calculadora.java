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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * @author Diego Morales, Diego Sosa, Julio Gonzalez
 * Clase en la cual se lee el .txt file y se hacen las operaciones que este incluye
 * @param <P>
 */
public class Calculadora<P> implements ADTCalculadora<P>{
	/**
	 *Atributo de tipo String que se encarga de realizar nueva cedena sin espacios 
	 */
	private String lineWspace;
	/**
	 *Atributo de tipo p  
	 */
	private P value;
	/**
	 *atributos de tipo double para realizar el push y pop con el stack  
	 */
	private Double a,b,c;
	/**
	 * contador del programa
	 */
	private int counter;
	/**
	 * Atributo de tipo booleano que se encarga de ver si condiciones se cumplen o no 
	 */
	private boolean first;
	/**
	 * contadores de tipo int para la programacion defensiva 
	 */
	private int counter1, counter2;
	
	Stack<Double> nstack = new Stack<Double>(10);
	/* (non-Javadoc)
	 * @see hoja.ADTCalculadora#readFile(java.lang.String)
	 */
	public void readFile(String file) throws FileNotFoundException, Exception{
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       lineWspace = line.replaceAll(" ", "");
			   counter1=0;
			   counter2=0;
			   for (int i = 0;i < lineWspace.length(); i++){
					if (lineWspace.charAt(i) == 42){
						counter1=counter1+1;
					}
					else if (lineWspace.charAt(i) == 43){
						counter1=counter1+1;
					}
					else if (lineWspace.charAt(i) == 45){
						counter1=counter1+1;
					}
					else if (lineWspace.charAt(i) == 47){
						counter1=counter1+1;
					}
					else{
						counter2=counter2+1;
					}
					
			   
			   }
				counter2=counter2-1;
				if (counter1 != counter2){
					throw new Exception("Error: No se ingreso bien los datos SWAG LOL");
				}else{
			   
				System.out.println(lineWspace);
			  
		       System.out.println("Resultado: "+calcular());
			 }
			   
			   }
		       //System.out.println(lineWspace);
		    }
		
		System.out.println("readFile");
		}		
	
	/* (non-Javadoc)
	 * @see hoja.ADTCalculadora#calcular()
	 */
	public P calcular() throws Exception{
		first = true;
		
		for (int i = 0;i < lineWspace.length(); i++){
		    if (lineWspace.charAt(0) == 42 || lineWspace.charAt(0) == 43 || lineWspace.charAt(0) == 45 || lineWspace.charAt(0) == 47){ 
			
	    	System.out.println(lineWspace.charAt(0));
			throw new Exception("Error: No puede iniciar el documento con un operador.");
			}else{
				if(Character.isDigit(lineWspace.charAt(0)) && Character.isDigit(lineWspace.charAt(1)) ) {
		    if (lineWspace.charAt(i) == 43){
		    	counter = 0;
				try {
					a = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				try {
					b = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				c = a+b;
		    	nstack.push(c);
		    	
		    	//System.out.println("Encontramos una suma en "+i);
		    } else if (lineWspace.charAt(i) == 42){
		    	counter = 0;
		    	try {
					a = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				try {
					b = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				c = a*b;
		    	nstack.push(c);
		    	
		    	//System.out.println("Encontramos una multiplicación en "+i);
		    } else if (lineWspace.charAt(i) == 45) {
		    	counter = 0;
		    	try {
					a = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				try {
					b = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				c = b-a;
		    	nstack.push(c);
		    	
		    	//System.out.println("Encontramos una resta en "+i);
		    } else if (lineWspace.charAt(i) == 47){
		    	try {
					a = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				try {
					b = nstack.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	
				c = b/a;
		    	nstack.push(c);
		    	
		    	//System.out.println("Encontramos una división en "+i);	
		    } else {
		    	if(!Character.isLetter(lineWspace.charAt(i)))
		    		nstack.push((double)Character.getNumericValue(lineWspace.charAt(i)));
		    	else{
		    		throw new Exception("Error: Se ha encontrado un caracter no válido. Por favor, revise su fichero.");
		    	}
		    }
			}else {
				System.out.println(lineWspace);
				throw new Exception("Error: No puede iniciar el documento uno de los primeros 2 no es digito.");
	         } 
			 }
		  }
		   
		
		try {
			value = (P) nstack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
	}
	
}
