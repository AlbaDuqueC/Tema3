package boletin1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	private static boolean error;

	public static void main(String[] args) {
		//Variables
		
		// Esta Variable sirve para creal una tabla 
		int tabla[] = new int[100];
		
		// Crea un numero random el cual se añadira a la tabla
		Random rand= new Random();
		
		//Es el numero que pedimos compronbar si hay alguno dentro de la tabla
		int numPedido = 0;
		
		// Abrir scanner
		Scanner sc= new Scanner(System.in);
		
		/* Si no es un numero entre el 1 y el 10, volvera 
		 * a repetirse la pregunta hasta que no de error*/
		for(boolean error=true; error!=false ;) {
		
		try {
		System.out.println("Introduzca un numero entre 1 y 10");
		
		numPedido = sc.nextInt();
		
		
		assert numPedido<=10 && numPedido>0 : "No puede ser un numero mayor a 10";
		error=false;
		
		}catch (InputMismatchException e) {
			
			System.err.println("Error: Escribe un numero");
			sc.next();
			error=true;
			
		}catch (AssertionError e) {
			
			System.err.println("No puedes introducir un numero que no sea entre 1 y 10");
			error=true;
			
		}finally {
			
			System.out.println("");
			
		}
	}
		
		/* Pone en cada posición un numero aleatorio del 1 al 10
		 * y imprime por pantalla la posicion de un numero que 
		 * anteriormente hemos introducido*/
		for(int i=0; i<100 ; i++) {
			
			int num= rand.nextInt(1,11);
			
			tabla[i]=num;
			
			if (numPedido==num) {
				System.out.println("En la posición "+i+" aparece "+numPedido);
			}
		}
		
		// Cierre del escaner
		sc.close();
	}

}
