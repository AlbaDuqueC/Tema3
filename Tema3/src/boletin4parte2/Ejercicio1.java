package boletin4parte2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables

		// Tabla bidimensionar de 6x10
		int tabla[][] = new int[6][10];

		Random rand = new Random();

		// Inserta en la tabla numeros aleatorios
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				tabla[i][j] = rand.nextInt(0, 1001);

			}
		}

		// Imprime la tabla
		System.out.println(Arrays.deepToString(tabla));

		// Imprime el minimo
		System.out.println("minimo: " + min(tabla));

		// Imprime el max
		System.out.println("maximo: " + max(tabla));

	}

	// Calcula el maximo
	static int max(int tabla[][]) {

		int max = 0;

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] > max) {

					max = tabla[i][j];

				}

			}
		}
		return max;

	}

	// Calcula el minimo
	static int min(int tabla[][]) {

		int min = 1001;

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] < min) {

					min = tabla[i][j];

				}

			}
		}

		return min;

	}
}
