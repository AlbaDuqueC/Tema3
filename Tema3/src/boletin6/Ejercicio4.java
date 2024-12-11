package boletin6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables

		String frase;

		int cont=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase");

		frase = sc.nextLine();

		char resultado[] = new char[frase.length()];

		for (int i = frase.length() - 1; i >= 0; i--) {
						
				resultado[cont] = frase.charAt(i);
				
				cont++;
				
		}

		System.out.println(String.valueOf(resultado));

		sc.close();

	}

}
