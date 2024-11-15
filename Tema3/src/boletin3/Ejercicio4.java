package boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		int tabla[][] = new int[11][11];

		for (int i = 1; i < tabla.length; i++) {

			for (int j = 1; j < tabla.length; j++) {

				tabla[i][j] = i * j;

				System.out.print(tabla[i][j] + "\t");

			}

			System.out.println();
		}

	}

}
