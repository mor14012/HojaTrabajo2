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

public class main{
	public static void main(String[] args) {
		Stack<Integer> nstack = new Stack<Integer>(10);
		 nstack.push(125);
		 try{
		 	System.out.println("I popped the element: "+nstack.pop());	
		 }
		 catch(Exception e){
		 	System.out.println("Ups...");
		 }
		 System.out.println("Lets try to pop again");
		 try{
		 	System.out.println("I popped the element: "+nstack.pop());	
		 }
		 catch(Exception e){
		 	System.out.println("What did you expect bro??? You're poping no shit (Stack is empty)");
		 }
	}
}