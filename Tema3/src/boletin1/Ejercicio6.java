package boletin1;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable

		// Esta variables es una tabla de 5 valores a introducir
		int tabla[] = new int[10];

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que pregunta al usuario el numero a introducir
		for (int i = 0; i < tabla.length; i++) {

			// Te pide un numero
			System.out.println("Introduzca un numero:");

			// Scannea el numero introducido
			tabla[i] = sc.nextInt();

		}

		for (int num : tabla) {

			if (num % 2 == 0) {
				System.out.print(num + " par");
			} else {

				System.out.print(num + " impar");
			}
		}
		
		sc.close();
	}

}
