package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables

		int primitiva[] = new int[6];

		int resultado[] = {3, 8, 12, 34, 43, 48};
		int busqueda;
		int i=0;
		int num;
		int numAciertos=0;
		// Crea un numero random el cual se añadira a la tabla
		Random rand = new Random();
		
		while ( i < 6 ) {

			num = rand.nextInt(1, 50);
			
			Arrays.sort(primitiva);
			busqueda= Arrays.binarySearch(primitiva, num);
			if(busqueda<0) {
				primitiva[0]=num;
				i++;
			}
			
			
		}
		
		
		for(int valor: primitiva) {
			busqueda= Arrays.binarySearch(resultado, valor);
			if(busqueda>=0) {
			numAciertos++;
			}
		}
		System.out.println("Numero de aciertos: " + numAciertos);
		
		System.out.println("Primitiva: "+Arrays.toString(primitiva));
		System.out.println("Resultado: "+ Arrays.toString(resultado));

	}

}
