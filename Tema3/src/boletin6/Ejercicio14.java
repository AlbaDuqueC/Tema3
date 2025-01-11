package boletin6;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Variable
		String frase;

		char letra;

		int[] contadorLetras = new int[26];

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una frase:");

		frase = sc.nextLine();

		// Recorrer la frase y contar las letras
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);

			/*
			 * Verificar si el carácter es una letra (ignorar números, espacios y otros
			 * caracteres)
			 */
			if (Character.isLetter(letra)) {
				// Convertir la letra a minúscula
				letra = Character.toLowerCase(letra);

				/*
				 * Calcular el índice correspondiente a la letra (0 para 'a', 1 para 'b', ...,
				 * 25 para 'z')
				 */
				int indice = letra - 'a';

				// Incrementar el contador para esa letra
				contadorLetras[indice]++;

			}

		}
		
		//Imprime el nuemro de letras

		System.out.println("letras:");
		
		for (int i = 0; i < 26; i++) {
			
			if (contadorLetras[i] > 0) {
				
				letra = (char) (i + 'a');
				
				System.out.println(letra + ": " + contadorLetras[i]);
			}
		}

	}

}
