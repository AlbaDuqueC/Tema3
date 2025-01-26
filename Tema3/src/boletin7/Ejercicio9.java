package boletin7;

import java.util.Scanner;

import java.util.TreeMap;

public class Ejercicio9 {

	/*
	 * Implementa una aplicación donde ir registrando el número de veces que ha
	 * salido cada número del euromillón.
	 * 
	 * Para ello tendrás que usar dos colecciones, una para los números y otra para
	 * las estrellas.
	 * 
	 * Al usuario se le debe pedir que introduzca primero los 5 números y a
	 * continuación las 2 estrellas del último sorteo.
	 * 
	 * El programa comprobará si ya se encuentra el número correspondiente en la
	 * colección, si no está, lo añadirá y le pondrá el valor 1. Si ya está,
	 * incrementará en 1 su valor.
	 * 
	 * Las colecciones no pueden tener repetidos y deben estar ordenadas.
	 */

	static TreeMap<Integer, Integer> registroNum = new TreeMap<>();

	static TreeMap<Integer, Integer> registroEstrellas = new TreeMap<>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String continuar = "s";
		int num = 0;
		int estrella = 0;

		System.out.println("Registro de resultados del Euromillón.");

		while ("s".equals(continuar)) {

			System.out.println("Introduce los 5 números del último sorteo (entre 1 y 50):");

			for (int i = 1; i <= 5; i++) {
				num = leerNumero("Número " + i + ": ", 1, 50, registroNum);
				registroNum.put(num, registroNum.getOrDefault(num, 0) + 1);
			}

			System.out.println("Introduce las 2 estrellas del último sorteo (entre 1 y 12):");

			for (int i = 1; i <= 2; i++) {
				estrella = leerNumero("Estrella " + i + ": ", 1, 12, registroEstrellas);
				registroEstrellas.put(estrella, registroEstrellas.getOrDefault(estrella, 0) + 1);
			}

			Registro();

			System.out.print("¿Quieres registrar otro sorteo? (s/n): ");
			continuar = sc.next().trim().toLowerCase();
		}

		System.out.println("Salir");
	}

	private static int leerNumero(String mensaje, int min, int max, TreeMap<Integer, Integer> registro) {

		int num = 0;

		boolean correcto = false;

		while (!correcto) {

			System.out.print(mensaje);

			num = sc.nextInt();

			if (num >= min && num <= max && !registro.containsKey(num)) {

				correcto = true;

			} else {

				System.out.println("Número inválido o repetido. Intenta de nuevo.");

			}
		}

		return num;
	}

	private static void Registro() {

		System.out.println("Números registrados y sus frecuencias:");

		for (Integer num : registroNum.keySet()) {

			int frecuencia = registroNum.get(num);

			System.out.println("Número " + num + ": " + frecuencia + " veces");
		}

		System.out.println("Estrellas registradas y sus frecuencias:");

		for (Integer estrella : registroEstrellas.keySet()) {

			int frecuencia = registroEstrellas.get(estrella);

			System.out.println("Estrella " + estrella + ": " + frecuencia + " veces");
		}
	}

}
