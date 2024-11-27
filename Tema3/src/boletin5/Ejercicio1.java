package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Variables
		
		/*Tabla que almacena numeros random que se introduce junto
		 *  a sus dimensiones medianete el static dimeniones*/
		int tabla[][] = dimensiones();

		/*Variable introducido en el static valor*/
		int num = valor();

		/*Variable que muestra si el numero esta o no en la tambla*/
		boolean estar = false;

		/**/
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				System.out.print(tabla[i][j] + "\t");
				
				if (tabla[i][j]== num) {
					
					estar=true;
				}
			}
			System.out.println();
		}

		System.out.println();

		if (estar) {

			System.out.println("Esta en la tabla");

		} else if (!estar) {

			System.out.println("No esta en la tabla");

		}

	}

	static int[][] dimensiones() {
		int tabla1[][];
		int colum;
		int fila;

		Random rand = new Random();

		System.out.println("introduce el numero de columnas");
		colum = sc.nextInt();

		System.out.println("Introduce las filas");
		fila = sc.nextInt();

		tabla1 = new int[fila][colum];

		for (int i = 0; i < fila; i++) {

			for (int j = 0; j < colum; j++) {

				tabla1[i][j] = rand.nextInt(0, 10);
			}
		}

		return tabla1;
	}

	static int valor() {
		int valor;

		System.out.println("Introduce el valor que quiera buscar en la tabla:");
		valor = sc.nextInt();

		return valor;

	}

}
