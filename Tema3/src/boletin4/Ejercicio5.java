package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables
		int t[] = { 1, 2, 3, 4, 5, 6, 7, 3, 2, 2, 2, 3 };

		int valor;

		Scanner sc = new Scanner(System.in);

		System.out.println("Que valor quieres buscar?");

		valor = sc.nextInt();

		int resultado[] = buscarTodos(t, valor);

		System.out.println("Estan en la posición: " + Arrays.toString(resultado));

		sc.close();

	}

	static int[] buscarTodos(int t[], int valor) {
		int tamaño = numVeces(t, valor);
		int[] tabla = new int[tamaño];
		int cont = 0;

		for (int i = 0; i < t.length; i++) {

			if (t[i] == valor) {

				tabla[cont] = i;

				cont++;
			}
		}

		return tabla;
	}

	static int numVeces(int t[], int valor) {
		int cont = 0;
		for (int contenido : t) {
			if (contenido == valor) {
				cont++;
			}
		}

		return cont;
	}

}
