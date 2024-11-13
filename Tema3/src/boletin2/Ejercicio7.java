package boletin2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Variables
		
		//Esta variable es una tabla donde almacenaremos la informacion
		int tabla[];
		
		//Esta variable almacenara el tamaño que tenga que ocupar la tabla por cada numero
		int tamaño=0;
		
		//Calcula el tamaño
		for(int i=1 ; i<=10; i++) {
			tamaño+=i;
			
		}
		
		//Agrega el tamaño calculado a la tabla
		tabla=new int [tamaño];
		
		//Rellena la tabla [1,2,2,3,3,3,...]
		for (int i=1, j=0 ; i<=10; i++) {
			Arrays.fill(tabla, j, j+i, i);
			j+=i;
			
		}
		
		//Imprime por pantalla el resultado
		System.out.println(Arrays.toString(tabla));

	}

}
