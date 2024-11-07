package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable

		// Esta variables es una tabla de 5 valores a introducir
		int tabla[] = new int[10];

		int total = 0;
		int max =0 ;
		int min =0;

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle que pregunta al usuario el numero a introducir
		for (int i = 0; i < tabla.length; i++) {

			// Te pide un numero
			System.out.println("Introduzca un numero:");

			// Scannea el numero introducido
			tabla[i] = sc.nextInt();

			total = total + tabla[i];
			
			if (i ==0) {
				max=tabla[i];
				min=tabla[i];
			}

			if (max < tabla[i]) {
				max = tabla[i];
			}

			if (min > tabla[i]) {
				min = tabla[i];
			}

		}

		// Creamos un bucle para que imprima la tabla
		for (int num : tabla) {
			System.out.print(num + "  ");
		}
		System.out.println("");
		System.out.println("El maximo es: " + max);
		
		System.out.println("El minimo es: " + min);

		sc.close();

	}

}
