package boletin3;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables

		int tabla[][] = new int[4][5];

		Random rand = new Random();

		int totalI = 0;
		int totalJ = 0;
		int total = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				int num = rand.nextInt(100, 1000);

				tabla[i][j] = num;

				System.out.print(tabla[i][j] + "\t");

				totalI = totalI + num;

			}

			System.out.print(totalI);

			System.out.println();

			totalI = 0;
		}

		for (int j = 0; j < tabla[0].length; j++) {

			for (int i = 0; i < tabla.length; i++) {
				totalJ = totalJ + tabla[i][j];

			}
			total = total + totalJ;
			System.out.print(totalJ + "\t");

			totalJ = 0;
		}
		System.out.println(total);

	}

}
