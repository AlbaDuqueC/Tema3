package boletin7parte2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	/*
	 * Implementa una aplicación que genere 10 números enteros aleatorios distintos
	 * en el rango del 1 al 20 y los guarde en una implementación que no permita que
	 * se dupliquen números en el caso de que se repitan y que garantice un orden
	 * basado en inserción. Luego, muestra los números únicos generados por
	 * pantalla.
	 */

	public static void main(String[] args) {
		LinkedHashSet<Integer> lista = new LinkedHashSet<Integer>();
		
		Random rand= new Random();
		
		int num;
		
		for (int i=0; i<10; i++) {
			num=rand.nextInt(1, 21);
			
			lista.add(num);
		}
		
		System.out.println(lista);

	}

}
