package boletin1;


import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		int tabla[] = new int[10];
		
		//creamos la utilidad random para general numero aleatorios
		Random rand = new Random();
		
		for( int i=0 ; i<10; i++) {
			tabla[i]= rand.nextInt(0, 101);
			
		}
		System.out.println(Arrays.toString(tabla));

	}

}
