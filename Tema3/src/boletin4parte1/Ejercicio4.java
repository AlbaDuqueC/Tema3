package boletin4parte1;


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		int t[] = { 1, 2, 3, 4, 5, 6, 7, 3, 2, 2, 2, 3 };

		int clave;

		Scanner sc = new Scanner(System.in);

		System.out.println("Que valor quieres buscar?");

		clave = sc.nextInt();

		int resultado = buscarTodos(t, clave);

		System.out.println("Estan en la posición: " + (resultado));

		sc.close();

	}

	static int buscarTodos(int t[], int clave) {

		int buscar = 0;

		while (buscar < t.length && clave != t[buscar]) {
			buscar++;
		}

		if (buscar >= t.length) {
			buscar = -1;
		}

		return buscar;
	}

}
