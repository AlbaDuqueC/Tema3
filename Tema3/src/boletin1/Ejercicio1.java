package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables

		// Esta variables es una tabla de 10 valores a introducir
		int tabla[] = new int[10];

		// Creamos la utilidad random para general numero aleatorios
		Random rand = new Random();

		/*
		 * Creamos un for que cuente hasta 10 y vamos dando el valor aleatorio a cada
		 * parte de la tabla
		 */
		for (int i = 0; i < 10; i++) {

			// Añade numeros randoms a cada hueco de la tabla
			tabla[i] = rand.nextInt(0, 101);
		}

		// Imprim la tabla con los numero random
		System.out.println(Arrays.toString(tabla));

	}

}
