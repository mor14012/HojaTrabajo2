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


public class Calculadora<P> implements ADTCalculadora<P>{
	private String lineWspace;
	private P value;
	private Double a,b,c;
	private int counter;
	private boolean first;
	
	Stack<Double> nstack = new Stack<Double>(10);
	public void readFile(String file) throws FileNotFoundException, Exception{
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       lineWspace = line.replaceAll(" ", "");
		       System.out.println("Resultado: "+calcular());
		       //System.out.println(lineWspace);
		    }
		}
		System.out.println("readFile");
				
	}
	public P calcular() throws Exception{
		first = true;
		
		for (int i = 0;i < lineWspace.length(); i++){
	    	//System.out.println(lineWspace.charAt(i));
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
