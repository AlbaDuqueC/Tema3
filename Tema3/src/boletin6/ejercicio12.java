package boletin6;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// Variables

		String frase;

		String[] palabra;

		String palabraMasLarga = "";

		int longitudMax = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una frase:");
		frase = sc.nextLine();

		palabra = frase.split(" ");

		for (String i : palabra) {
			if (i.length() > longitudMax) {
				palabraMasLarga = i;
				longitudMax = i.length();
			}
		}
		
		System.out.println("La palabra más larga es: " + palabraMasLarga);
        System.out.println("Número de caracteres: " + longitudMax);

	}

}
