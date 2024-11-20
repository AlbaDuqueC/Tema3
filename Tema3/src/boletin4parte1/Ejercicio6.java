package boletin4parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables
		
		int t[]= {10, 1, 5, 8, 9, 2};
		int numElementos;
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Introduzca cuantos elementos quieres que se sumen:");
		
		numElementos= sc.nextInt();
		
		int respuesta[]= new int [t.length - numElementos +1];
		respuesta = suma(t, numElementos);
		
		System.out.println(Arrays.toString(respuesta));
		
		sc.close();

	}

	static int[] suma(int t[], int numElementos) {
		
		int tabla[]= new int[t.length-numElementos+1];
		
		int suma=0;
		
		for(int fin = numElementos - 1; fin < t.length; fin++, suma=0) {
			
			for (int inicio = fin - numElementos + 1; inicio <= fin ; inicio++) {
				
				suma += t[inicio];
				
			}
			
			tabla[fin - numElementos + 1]=suma;
			
		}
		return tabla;
		
	}
}
