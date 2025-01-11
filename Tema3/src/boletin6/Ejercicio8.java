package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variables
		
		//Almacena la frase que introducen por consola
		String frase=null;
		
		//Almacena la frase ordenada
		String[] fraseOrdenada;

		//Scanner
		Scanner sc = new Scanner(System.in);

		//Pregunta al ususario una frase
		System.out.println("Introduzca una frase: ");
		
		//Scanea y almacena la frase introducida 
		frase= sc.nextLine().toLowerCase();
		
		//Introduce la frase y la almacena por palabras
		fraseOrdenada= frase.split(" ");
		
		//Ordena las palabras
		Arrays.sort(fraseOrdenada);
		
		//Imprime la frase ordenada 
		for (String i: fraseOrdenada) {
			
			System.out.print(i + " ");
			
		}
		
		//cierre de scanner
		sc.close();

	}
	
	

}
