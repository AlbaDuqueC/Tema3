package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variable
		
		// Esta variables es una tabla de 5 valores a introducir
		double tabla[]= new double[5];
		
		// Es una variable que almacena lo introducido a traves del scanner
		double respuesta;
		
		//Abrimos el scanner 
		Scanner sc= new Scanner(System.in);
		
		// Creamos un bucle que pregunta al usuario el numero a introducir
		for (int i=0; i<tabla.length; i++) {
			
			// Te pide un numero
			System.out.println("Introduzca un numero:");
			
			// Scannea el numero introducido
			respuesta= sc.nextDouble();
			
			//Introduce el valor anteriormente introducido 
			tabla[i]= respuesta;
			
		}
		
		// Creamos un bucle para que imprima la tabla
		for(double num : tabla) {
			System.out.print(num + " ");
		}
		
		//Cierre del scanner
		sc.close();
		
		

	}

}
