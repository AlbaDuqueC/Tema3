package boletin7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio4 {

	/*
	 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
	 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
	 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
	 * mostrará la colección resultante por pantalla.
	 */

	public static void main(String[] args) {
		
		List <Integer> Numeros = new ArrayList<>();
		
		Random rand= new Random();
		
		int num;
		
		
		int tam=0;
		
		while(tam<20) {
			while(Numeros.lastIndexOf(num)==num) {
			num= rand.nextInt(0, 101);
			
			}
			
			Numeros.add(num);
			
			tam++;
		}
		

	}

}
