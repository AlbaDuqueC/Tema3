package boletin7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {

	/*
	 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
	 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
	 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
	 * entre 5 y 10 elementos ambos inclusive.
	 */

	public static void main(String[] args) {
		
		List<Integer> NumerosRandoms = new ArrayList<>();
		
		Random rand= new Random();
		
		int tamaño;
		
		int num;
		
		int suma=0;
		
		double media;
		
		int max;
		
		int min;
		
		tamaño= rand.nextInt(5, 11);
		
		for(int i=0; i<tamaño; i++) {
			
			num=rand.nextInt(0, 101);
			
			NumerosRandoms.add(num);
			
			suma+=num;
			
		}
		
		max=Collections.max(NumerosRandoms);
		min= Collections.min(NumerosRandoms);
		
		media=suma/tamaño;
		
		System.out.println(NumerosRandoms);
		System.out.println("Suma de todos los numeros: "+suma);
		System.out.println("Maximo: "+max);
		System.out.println("Minimo: "+min);
		System.out.println("Media: "+media);
		
		

	}

}
