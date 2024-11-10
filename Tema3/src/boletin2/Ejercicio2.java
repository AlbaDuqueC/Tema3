package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables

		/*
		 * Esta variable sirve para almacenar el valor que proximamente introducira, la
		 * cual es el numero que va dentro de la tabla
		 */
		int valor = 0;

		int tabla1[] = new int[10];
		int tabla2[] = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			for (boolean error = true; error != false;) {

				try {
					System.out.println("Introduzca un valor de la tabla1:");
					valor = sc.nextInt();
					error = false;

				} catch (InputMismatchException e) {
					System.err.println("Valor invalido, introduzca otra vez el valor numerico");
					sc.next();
					error = true;
				}

			}

			tabla1[i] = valor;

		}

		for (int i = 0; i < 10; i++) {

			for (boolean error = true; error != false;) {

				try {
					System.out.println("Introduzca un valor de la tabla2:");
					valor = sc.nextInt();
					error = false;

				} catch (InputMismatchException e) {
					System.err.println("Valor invalido, introduzca otra vez el valor numerico");
					sc.next();
					error = true;
				}

			}

			tabla2[i] = valor;

		}

		// Imprime por pantalla la tabla1
		System.out.println(Arrays.toString(tabla1));

		// Imprime por pantalla la tabla2
		System.out.println(Arrays.toString(tabla2));

		//Imprime si son iguales o no
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

	}

}
