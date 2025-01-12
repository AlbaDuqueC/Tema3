package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Variables

		String palabra1;
		String palabra2;

		boolean anagrama;

		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que ingrese las dos palabras
		System.out.println("Ingrese la primera palabra:");
		palabra1 = sc.nextLine();

		System.out.println("Ingrese la segunda palabra:");
		palabra2 = sc.nextLine();

		// Dice si las palabras son anagramas o no
		if (sonAnagramas(palabra1, palabra2)) {

			System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");

		} else {

			System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");

		}

		// Cerrar el scanner
		sc.close();

	}

	public static boolean sonAnagramas(String palabra1, String palabra2) {

		char[] array1;
		char[] array2;

		// Elimina los espacios y convierte las palabras a minúsculas
		palabra1 = palabra1.replaceAll(" ", "").toLowerCase();

		palabra2 = palabra2.replaceAll(" ", "").toLowerCase();

		// comprueba si la logitud es lamisma o no
		if (palabra1.length() != palabra2.length()) {

			return false;
		}

		// Convierte las palabras a arrays
		array1 = palabra1.toCharArray();

		array2 = palabra2.toCharArray();

		// Ordenar los arrays de caracteres
		Arrays.sort(array1);

		Arrays.sort(array2);

		// Comparar los arrays ordenados
		return Arrays.equals(array1, array2);
	}

}
