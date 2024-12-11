package boletin6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable

		String frase;

		int cont = 0;

		String frase2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase");

		frase = sc.nextLine();
		
		frase = frase.replace(" ", "");
		
		char resultado[] = new char[frase.length()];

		for (int i = frase.length() - 1; i >= 0; i--) {

			resultado[cont] = frase.charAt(i);

			cont++;

		}
		frase2 = String.valueOf(resultado);

		if (frase.equalsIgnoreCase(frase2)) {

			System.out.println("Es palíndroma");

		} else {
			System.out.println("No es palíndroma");
		}

	}

}
