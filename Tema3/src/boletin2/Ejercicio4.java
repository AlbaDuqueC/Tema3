package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//-Arreglar el catch-
		
		// Variable

		int puntuaciones[] = new int[8];
		int puntos=0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {

			for (boolean error = true; error != false;) {

				try {
					System.out.println("Introduzca un valor de la tabla:");
					puntos = sc.nextInt();
					
					assert puntos<=2800 && puntos>=1000 : "Error";
					error = false;

				} catch (InputMismatchException e) {
					System.err.println("Valor invalido, introduzca otra vez el valor numerico");
					sc.next();
					error = true;
				}catch (AssertionError e) {
					System.err.println("Puntuación no valida");
					error=true;
				}

			}

			puntuaciones[i] = puntos;

		}
		Arrays.sort(puntuaciones);
		System.out.println(Arrays.toString(puntuaciones));
		
		sc.close();

	}

}
