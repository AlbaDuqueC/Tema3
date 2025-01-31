package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//ESTA MAL
		
		// Variables

		String frase;

		String palabra;
		
		int pos;
		
		int numpalabra=0;
		
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");

		frase = sc.nextLine();

		System.out.println("Introducir una palabra: ");

		palabra = sc.nextLine();

		pos=frase.indexOf(palabra);
		
		

		System.out.println(pos);
	}

}
