package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Variables

		String palabra1;
		
		String palabra2;
		
		String palabraMezclada;

		boolean anagrama;

		Scanner sc = new Scanner(System.in);

		// J1 tiene que introducir una palabra
		System.out.println("Ingrese una palabra:");
		palabra1 = sc.nextLine();
		
		// mezcla la palabra inrroducida 
		palabraMezclada= mezclarPalabra(palabra1);
		
		// Imprime la palabra mezclada
		System.out.println(palabraMezclada);
		
		//Pide que el J2 adivine la palabra
		System.out.println("Ingrese la palabra que crea que sea:");
		
		palabra2 = sc.nextLine();

		// Dice si las palabras son iguales o no
		if (sonIguales(palabra1, palabra2)) {

			System.out.println("Acertaste");

		} else {

			System.out.println("Fallastes");

		}

		// Cerrar el scanner
		sc.close();

	}

	static boolean sonIguales(String palabra1, String palabra2) {

		boolean iguales;
		
		if (palabra1.equals(palabra2)) {
			
			iguales=true;
			
		}else {
			iguales=false;
		}
		
		return iguales;
		
	}
	
	static String mezclarPalabra(String palabra1) {
		
		char[] letras = palabra1.toCharArray();
		
		String palabra = "";
		
        Random rand = new Random();
        
        int letraRand;
        
        char ayuda;
        
        // Mezclar 
        for (int i = 0; i < letras.length; i++) {
        	
            letraRand = rand.nextInt(letras.length);
            
            ayuda = letras[i];
            
            letras[i] = letras[letraRand];
            
            letras[letraRand] = ayuda;
        }
        
        for(int i=0; i<letras.length; i++) {
        	
        	palabra= palabra + letras[i];
        	
        }

        return palabra;
		
	}

}
