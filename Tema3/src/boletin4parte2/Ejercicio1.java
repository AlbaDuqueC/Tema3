package boletin4parte2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables

		int tabla[][] = new int[6][10];

		Random rand = new Random();

		int respuestamax = max(tabla);

		int respuestamin = min(tabla);

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				tabla[i][j] = rand.nextInt(0, 1001);

			}
		}

		System.out.println(Arrays.deepToString(tabla));

		System.out.println("minimo: " + respuestamin);
		System.out.println("maximo: " + respuestamax);

	}

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

	static int min(int tabla[][]) {

		int min = 0;

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] < min) {

					min = tabla[i][j];

				}

			}
		
		return min;

	}

}
