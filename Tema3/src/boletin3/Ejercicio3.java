package boletin3;


import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables

		// 
		int tabla[][];
		
		int filas;
		
		int columnas;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce numero de filas: ");

		filas = sc.nextInt();

		System.out.println("Introduce numero de columnas: ");

		columnas = sc.nextInt();

		tabla = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				tabla[i][j] = 10 * i + j;
				System.out.print(tabla[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();

	}

}
