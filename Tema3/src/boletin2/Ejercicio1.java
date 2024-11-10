package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variable

		/*
		 * Esta variable sirve para almacenar el valor que proximamente introducira, la
		 * cual es el tamaño de la tabla
		 */
		int tamaño = 0;

		/*
		 * Esta variable sirve para almacenar el valor que proximamente introducira, la
		 * cual es el numero que va dentro de la tabla
		 */
		int valor = 0;

		/*
		 * Esta variable es donde posteriormente se introducira el tamaño de la tabla y
		 * dentro en cada longitud se pondra el valor introducido
		 */
		int tabla[] = new int[tamaño];

		// Abrir scanner
		Scanner sc = new Scanner(System.in);

		/*
		 * Este bucle sirve para que no puedas introducir un valor no correspondiente a
		 * lo que te esta preguntado
		 */
		for (boolean error = true; error != false;) {

			try {
				System.out.println("Introduzca el tamaño de la tabla:");
				tamaño = sc.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.err.println("Valor invalido, introduzca otra vez el valor numerico");
				sc.next();
				error = true;
			}

		}

		/*
		 * Este bucle sirve para que no puedas introducir un valor no correspondiente a
		 * lo que te esta preguntado
		 */
		for (boolean error = true; error != false;) {

			try {
				System.out.println("Introduzca el valor que quiera que tenga la tabla:");
				valor = sc.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.err.println("Valor invalido, introduzca otra vez el valor numerico");
				sc.next();
				error = true;
			}

		}
		
		/*
		 * Este bucle va introduciendo los valores a cada hueco de la tabla
		 */
		for (int i = 0; i < tamaño; i++) {
			tabla[i] = valor;
		}

		// Imprime por pantalla la tabla
		System.out.println(Arrays.toString(tabla));

		// Cierre del escaner
		sc.close();

	}

}
