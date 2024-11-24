package boletin4parte2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variables

		// Tabla bidimensional de 3x3
		int tabla[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Imprime la tabla dada la vuelta
		System.out.println(Arrays.deepToString(transposicion(tabla)));

	}

	// Le da la vuelta a la tabla
	static int[][] transposicion(int tabla[][]) {

		int[][] tablaRes = new int[tabla.length][tabla[0].length];

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				tablaRes[j][i] = tabla[i][j];
			}
		}
		return tablaRes;
	}

}
