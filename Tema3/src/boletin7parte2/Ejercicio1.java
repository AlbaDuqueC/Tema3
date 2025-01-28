package boletin7parte2;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y
	 * luego la mezcle de forma aleatoria. Finalmente, muestra la lista original y
	 * la lista mezclada por pantalla.
	 */

	public static void main(String[] args) {

		ArrayList<Integer> listaNum = new ArrayList<Integer>();

		Random rand = new Random();

		Scanner sc = new Scanner(System.in);

		int num;

		int cont;

		System.out.println("¿Cuantos numeros quieres que se introduzca?");

		cont = sc.nextInt();

		for (int i = 0; i < cont; i++) {

			num = rand.nextInt(1, 11);
			listaNum.add(num);

		}

		System.out.println(listaNum);

		Collections.sort(listaNum);

		System.out.println(listaNum);

	}

}
