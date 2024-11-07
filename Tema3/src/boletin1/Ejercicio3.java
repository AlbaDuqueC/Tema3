package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variable

		int tabla[] = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 9; i >=0; i--) {

			// Te pide un numero
			System.out.println("Introduzca un numero:");

			// Scannea el numero introducido
			tabla[i]  = sc.nextInt();		

		}

		// Creamos un bucle para que imprima la tabla
		for (int num : tabla) {
			System.out.print(num + " ");
		}
		
		sc.close();

	}

}
