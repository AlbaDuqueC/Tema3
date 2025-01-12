package boletin6;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Variables

		String frase;

		String fraseF;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase:");

		frase = sc.nextLine();

		fraseF = convertirFrase(frase);
		System.out.println(fraseF);

	}

	static String convertirFrase(String frase) {

		 // Separamos la frase en palabras
        String[] palabras = frase.split(" ");
        
        // Empezamos con la primera palabra en minúsculas
        String fraseA = palabras[0].toLowerCase();
        
        // Recorrer las palabras a partir de la segunda
        for (int i = 1; i < palabras.length; i++) {
        	
            // Convertir la primera letra a mayúscula y el resto a minúscula
        	fraseA += Character.toUpperCase(palabras[i].charAt(0)) + palabras[i].substring(1).toLowerCase();
        	
        }
        
        // Devolvemos el resultado
        return fraseA;

	}

}
