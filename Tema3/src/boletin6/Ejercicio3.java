package boletin6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable
		
		String frase;
		
		int cont=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		
		frase=sc.nextLine();
		
		for(int i = 0; i<frase.length(); i++) {
			
			if(frase.charAt(i)==' ') {
				cont++;
			}
			
		}
		
		System.out.println("Hay "+cont+" espacios en la frase");
		
		sc.close();

	}

}
