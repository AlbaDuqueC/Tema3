package boletin2;

import java.util.Arrays;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables

		// Esta Variable sirve para creal una tabla
		int tabla[] = new int[30];

		// Crea un numero random el cual se añadira a la tabla
		Random rand = new Random();

		/*
		 * Pone en cada posición un numero aleatorio del 0 al 9 y introduce en la tabla
		 */
		for (int i = 0; i < 30; i++) {

			int num = rand.nextInt(0, 10);

			tabla[i] = num;

		}

		System.out.println("Tabla normal:");

		System.out.println(Arrays.toString(tabla));

		Arrays.sort(tabla);

		System.out.println("Tabla ordenada:");

		System.out.println(Arrays.toString(tabla));

	}

}
