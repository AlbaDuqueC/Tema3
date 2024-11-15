package boletin3;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables

		//Esta tabla almacenara los datos que posteriormente si introduciran
		int tabla[][] = new int[4][5];

		//Creamos un rand para que introduzca posteriormente numero randoms a la tabla
		Random rand = new Random();

		//Esta variable sirve para poner el total de las filas
		int totalI = 0;
		
		//Esta variable sirve para almacenar el total de las columnas
		int totalJ = 0;
		
		//Esta variable es la suma total de todos los numeros aleatorios que se introduciran
		int total = 0;

		// Este bucle servira para introducir todos los valores que se introduciran en  
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
