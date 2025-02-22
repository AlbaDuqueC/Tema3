package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables

		// Tabla que almacenas todas las notas
		double tabla[][] = new double[4][5];

		// Esta variable almacena la nota total
		double notaTotal = 0;

		// Esta variable almacena la nota media
		double notaMedia = 0;

		// Esta variable almacena la nota minima
		double notaMin = 10;

		// Esta variable almacena la nota maxima
		double notaMax = 0;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Te pide que introduzcas las notas de cada alumno
		System.out.println("Introduzca las notas");

		// Este for sirve para introducir las notas de cada alumno
		for (int i = 0; i < 4; i++) {

			// Te pide todas las notas de cada alumno
			System.out.println("Introduce la nota del alumno " + (i + 1) + ":");

			// Este for sirve para escanear todas las notas de un alumno
			for (int j = 0; j < 5; j++) {
				tabla[i][j] = sc.nextDouble();

			}

		}

		// Imprime por pantalla todas las notas
		for (int i = 0; i < 4; i++) {
			System.out.print("Alumno " + (i + 1) + ":");
			System.out.print("\t Notas: ");
			for (int j = 0; j < 5; j++) {

				// Imprime la tabla
				System.out.print(tabla[i][j] + "  ");

				if (notaMin > tabla[i][j]) {
					notaMin = tabla[i][j];
				}

				if (notaMax < tabla[i][j]) {
					notaMax = tabla[i][j];
				}
				notaTotal = notaTotal + tabla[i][j];
			}

			// Imprime la notaMin
			System.out.print("\t Nota Min: " + notaMin);

			// Imprime la notaMax
			System.out.print("\t Nota Max: " + notaMax);

			// Calcula la nota media
			notaMedia = notaTotal / 5;

			// Imprime la nota media
			System.out.print("\t Nota Media: " + notaMedia);
			System.out.println();

			// Borra los datos anteriores
			notaTotal = 0;
			notaMin = 10;
			notaMax = 0;
		}

		// Cierre de la consola
		sc.close();

	}

}
