package boletin7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio6 {

	/*
	 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
	 * el orden alfabético.
	 */

	public static void main(String[] args) {

		TreeSet<String> Palabras = new TreeSet<String>();

		Scanner sc = new Scanner(System.in);

		String palabra;

		do {
			System.out.println("Introduce una palabra: ");

			palabra = sc.nextLine();

			if (!palabra.equalsIgnoreCase("fin")) {
				Palabras.add(palabra);
				}

		} while (!palabra.equalsIgnoreCase("fin"));

		System.out.println(Palabras);

	}

}
