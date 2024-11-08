package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		int tabla[] = new int[12];

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que pregunta al usuario el numero a introducir
		for (int i = 0; i < tabla.length; i++) {

			// Te pide un numero
			System.out.println("Introduzca un numero:");

			// Scannea el numero introducido
			tabla[i] = sc.nextInt();

		}
		
		for(int num : tabla) {
			for(int j=0; j<num; j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
