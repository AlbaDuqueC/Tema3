package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variable
		int tamaño = 0;
		int valor = 0;

		Scanner sc = new Scanner(System.in);

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

		int tabla[] = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {
			tabla[i] = valor;
		}
		System.out.println(Arrays.toString(tabla));

		sc.close();

	}

}
