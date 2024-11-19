package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Variables

		int longitud = leeEnterosPositivos("longitud");

		int fin = leeEnterosPositivos("fin");

		int resultado[] = rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(resultado));
		

	}

	static int leeEnterosPositivos(String dato) {

		int num = -1;

		Scanner sc = new Scanner(System.in);

		do {

			try {

				System.out.println("Introduzca " + dato);

				num = sc.nextInt();

			} catch (InputMismatchException e) {

				System.err.println("Debe ser un numero");

			} finally {
				sc.nextLine();

			}

		} while (num < 0);

		return (num);

	}

	static int[] rellenaPares(int longitud, int fin) {
		Random rand = new Random();

		int tabla[] = new int[longitud];

		for (int i = 0; i < tabla.length; i++) {

			do {

				tabla[i] = rand.nextInt(2, fin);

			} while (tabla[i] % 2 != 0);

		}

		Arrays.sort(tabla);

		return (tabla);

	}
}
