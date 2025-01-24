package boletin7;


import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	/*
	 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
	 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
	 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
	 * mostrará la colección resultante por pantalla.
	 */

	public static void main(String[] args) {

		TreeSet<Integer> Numeros = new TreeSet<Integer>();

		Random rand = new Random();

		int num = 0;

		do {
			num = rand.nextInt(0, 101);

			Numeros.add(num);

		} while (Numeros.size() < 20);

		System.out.println(Numeros);

	}

}
