package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		String frase1;
		
		String frase2;
		
		int comparar;
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce dos frases:");
		
		frase1=sc.nextLine();
		
		frase2=sc.nextLine();
		
		
		if(frase1.length()==frase2.length()) {
			
			System.out.println("son iguales");
			
		}
		else if (frase1.length()<frase2.length()) {
			
			System.out.println("La primera frase es mas corta");
			
		}
		else if(frase1.length()>frase2.length()) {
			
			System.out.println("La segunda frase es mas corta");
			
		}
		
		sc.close();

	}

}
