package boletin6;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Variables

		String palabra;

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una palabra");
		palabra = sc.nextLine();

		System.out.println("Introduce el numero en cuanto quiere dividirla");
		n = sc.nextInt();

		// Dividimos la palabra en secuencias
		String[] resultado = dividirEnSecuencias(palabra, n);

		// Imprime la solución 
		for (String secuencia : resultado) {
			System.out.println(secuencia);
		}

	}

	public static String[] dividirEnSecuencias(String palabra, int n) {
		
		// Calculamos el número de secuencias necesarias
		int cantSec = palabra.length() / n;
		
		if (palabra.length() % n != 0) {
			cantSec++;
		}

		// Creamos el arreglo para almacenar las secuencias
		String[] secuencias = new String[cantSec];

		// Generamos las secuencias
		for (int i = 0; i < cantSec; i++) {
			int inicio = i * n;
			int fin = (inicio + n <= palabra.length()) ? inicio + n : palabra.length();
			secuencias[i] = palabra.substring(inicio, fin);
		}

		return secuencias;
	}

}
