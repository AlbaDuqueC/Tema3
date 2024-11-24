package boletin4parte2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables

		int tabla[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		if (esMagica(tabla) == true) {

			System.out.println("Es magica");

		} else if (esMagica(tabla) == false) {

			System.out.println("No es magica");
		}

	}

	static boolean esMagica(int tabla[][]) {

		boolean magia = true;

		int suma1 = 0;

		int suma2 = 0;

		int suma3 = 0;

		for (int i = 0; i < tabla.length; i++) {

			suma2 = 0;

			suma1 = 0;

			for (int j = 0; j < tabla.length; j++) {

				suma1 = suma1 + tabla[0][j];

				suma2 = suma2 + tabla[i][j];

			}

		}

		for (int i = 0; i < tabla.length; i++) {

			suma3 = 0;

			for (i = 0; i < tabla.length; i++) {

				suma3 = suma3 + tabla[j][i];

			}

		}

		if (suma1 != suma2) {

			magia = false;
		}
		
		if (suma1 != suma3) {
			magia = false;
		}

		return magia;

	}
}
