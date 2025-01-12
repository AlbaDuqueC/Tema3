package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Variable

		String palabra1;

		String palabra2;

		String palabraMezclada;

		boolean anagrama;
		
		String intento;
		
		int letrasCoinciden;

		Scanner sc = new Scanner(System.in);

		// J1 tiene que introducir una palabra
		System.out.println("Ingrese una palabra:");
		
		palabra1 = sc.nextLine();

		// mezcla la palabra inrroducida
		palabraMezclada = mezclarPalabra(palabra1);

		// Imprime la palabra mezclada
		System.out.println(palabraMezclada);

		

		do {
			System.out.println("Jugador 2, ingresa la palabra:");
			
			palabra2 = sc.nextLine();

			//cuántas letras coinciden
			letrasCoinciden = contarLetrasCoinciden(palabra1, palabra2);

			// Imprime cuántas letras coinciden
			System.out.println("Letras que coinciden: " + letrasCoinciden);

		} while (!sonIguales(palabra1, palabra2));

		System.out.println("Acertaste");

		// Cerrar el scanner
		sc.close();
	}

	
	static boolean sonIguales(String palabra1, String palabra2) {
		
		// compara las dos palabras
		return palabra1.equals(palabra2);
		
	}

	static String mezclarPalabra(String palabra1) {

		char[] letras = palabra1.toCharArray();

		String palabra = "";

		Random rand = new Random();

		int letraRand;

		char ayuda;

		// Mezclar
		for (int i = 0; i < letras.length; i++) {

			letraRand = rand.nextInt(letras.length);

			ayuda = letras[i];

			letras[i] = letras[letraRand];

			letras[letraRand] = ayuda;
		}

		for (int i = 0; i < letras.length; i++) {

			palabra = palabra + letras[i];

		}

		return palabra;

	}

	static int contarLetrasCoinciden(String palabra1, String palabra2) {

		int coincidencias = 0;

		// misma longitud
		int longitud = Math.min(palabra1.length(), palabra2.length());

		// Compara las letras de ambas palabras
		for (int i = 0; i < longitud; i++) {

			if (palabra1.charAt(i) == palabra2.charAt(i)) {

				coincidencias++;
			}
		}

		return coincidencias;
	}

}
