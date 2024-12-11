package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables

		String frase = "";

		String palabra;

		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca una palabra");

		palabra = sc.nextLine();

		while (!(palabra.equalsIgnoreCase("fin"))) {

			frase += palabra + " ";

			System.out.println("introduzca una palabra");

			palabra = sc.nextLine();

		}

		System.out.println(frase);

		sc.close();

	}

}
