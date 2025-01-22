package boletin7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Crear una lista de números enteros positivos introducidos por consola hasta
	 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
	 * por pantalla los índices de los elementos de valor par.
	 */

	public static void main(String[] args) {

		List<Integer> NumerosPositivos = new ArrayList<>();
		
		int num;
		
		Scanner sc= new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce un numero: ");
		
		num= sc.nextInt();
		
		if(num>=0 && num%2==0) {
		NumerosPositivos.add(num);
		}
		
		}while(num>=0);
		
		System.out.println(NumerosPositivos);
	}
	
	
		
		
		
	


}
