package boletin7;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class Ejercicio5 {

	/*
	 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
	 * que se insertarán en una colección, de forma que se conserve el orden de
	 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
	 * pantalla.
	 */

	public static void main(String[] args) {
		
		LinkedHashSet<String> Palabras= new LinkedHashSet <String>();
		
		Scanner sc= new Scanner (System.in);
		
		String palabra;
		
		do {
			System.out.println("Introduce una palabra: ");
			
			palabra=sc.nextLine();
			
			if (!palabra.equalsIgnoreCase("fin")) {
			Palabras.add(palabra);
			}
			
		}while (!palabra.equalsIgnoreCase("fin"));
		
		System.out.println(Palabras);

	}

}
