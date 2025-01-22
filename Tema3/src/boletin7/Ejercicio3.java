package boletin7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {

	/*
	 * Realiza un programa que genere 30 números enteros aleatorios, con valores
	 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
	 * ordenada. Pinta la colección por consola una vez rellena.
	 */

	public static void main(String[] args) {
		
		List<Integer> Numeros = new ArrayList<>();
		
		Random rand= new Random ();
		
		int num;
		
		int tam=0;
		
		while(tam<30) {
			
			num=rand.nextInt(1, 11);
			
			Numeros.add(num);
			
			tam++;
		}
		
		Collections.sort(Numeros);
		
		System.out.println(Numeros);

	}

}
