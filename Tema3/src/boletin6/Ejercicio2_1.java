package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_1 {

	public static void main(String[] args) {
		// Variables
		String contraseña;

		String intento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una contraseña: ");

		contraseña = sc.nextLine();

		char resultado[] = new char[contraseña.length()];

		System.out.println("Intenta adivinar la contraseña: ");

		intento = sc.nextLine();

		Arrays.fill(resultado, '*');

		while (!contraseña.equals(intento)) {

			for (int i = 0; i < intento.length(); i++) {

				if (contraseña.charAt(i) == intento.charAt(i)) {

					resultado[i] = intento.charAt(i);

				}

			}

			System.out.println(String.valueOf(resultado));

			System.out.println("Contraseña incorrecta, vuelve a introducir la contraseña:");

			intento = sc.nextLine();

		}
		System.out.println("Contraseña correcta, bienvenido");
		sc.close();

	}

}
