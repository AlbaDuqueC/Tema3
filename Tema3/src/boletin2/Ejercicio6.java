package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables

		int tabla1[] = new int[6];

		int tabla2[] = {3, 8, 12, 34, 43, 48};
		int busqueda;
		int i=0;
		int num;
		int numAciertos=0;
		// Crea un numero random el cual se añadira a la tabla
		Random rand = new Random();
		
		while ( i < 6 ) {

			num = rand.nextInt(1, 50);
			

			tabla1[i] = num;
			Arrays.sort(tabla1);
			busqueda= Arrays.binarySearch(tabla1, num);
			if(busqueda<0) {
				tabla1[0]=num;
				i++;
			}
			
			
		}
		System.out.println(Arrays.toString(tabla1));
		
		for(int valor: tabla1) {
			busqueda= Arrays.binarySearch(tabla2, valor);
			numAciertos++;
		}
		System.out.println("Numero de aciertos: " + numAciertos);
		
		

	}

}
