package boletin2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables

		int tabla[] = new int[1000];

		int valor = 0;

		// Crea un numero random el cual se añadira a la tabla
		Random rand = new Random();

		Scanner sc = new Scanner(System.in);

		for (Boolean error = true; error != false;) {

			error = false;

			try {
				System.out.println("Introduzca un valor de la tabla:");
				valor = sc.nextInt();

				assert valor <= 99 && valor >= 0 : "";

			} catch (InputMismatchException e) {

				System.err.println("Valor invalido, introduzca otra vez el valor numerico");
				sc.next();
				error = true;

			} catch (AssertionError e) {

				System.err.println("Valor no valido, introduzcalo de nuevo");
				error = true;

			}
		}
		for (int i = 0; i < 1000; i++) {

			int num = rand.nextInt(0, 100);

			tabla[i] = num;

			if (num == valor) {
				System.out.println("En la posicion " + i + " se encuentra el valor " + valor + " que has asignado");

			}
		}
		sc.close();

	}

}
