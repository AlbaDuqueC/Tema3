package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//ESTA MAL
		
		// Variables

		String frase;

		String palabra;
		
		int cont=0;
		
		int numpalabra=0;
		
		int k;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");

		frase = sc.nextLine();

		System.out.println("Introducir una palabra: ");

		palabra = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			
			k=i;

			if (frase.charAt(i) == palabra.charAt(0)) {

				for (int j = 0; j < palabra.length(); j++) {
					
					

					if(frase.charAt(i) == palabra.charAt(j)) {
						cont++;
						
						i++;
					}
					if(cont==palabra.length()) {
						
						numpalabra++;
						
						
					}
					
					
				}				
				
			}
			
			i=k;

		}

		System.out.println(numpalabra);
	}

}
