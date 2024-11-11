package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Variable

		int puntuaciones[] = new int[8];
		int puntos=0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {

			for (boolean error = true; error != false;) {

				try {
					System.out.println("Introduzca un valor de la tabla:");
					puntuaciones[i] = sc.nextInt();
					
					assert puntuaciones[i]<=2800 && puntuaciones[i]>=1000 : "Error";
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

	

		}
		Arrays.sort(puntuaciones);
		for(int j = 7; j>=0; j--) {
		System.out.println(puntuaciones[j]);
		}
		
		sc.close();

	}

}
