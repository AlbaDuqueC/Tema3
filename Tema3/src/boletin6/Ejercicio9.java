package boletin6;

import java.util.Scanner;

public class Ejercicio9 {
	
	//Esta mal, tengo que arreglarlo :)

	public static void main(String[] args) {
		// Variables

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");

		// Scanea y almacena la frase introducida
		frase = sc.nextLine().toLowerCase();
		
		
		if(( frase.endsWith("javalén, len, len"))) {
			
			System.out.println("Es de javalandia");
			
		}else if (frase.startsWith("Javalín, javalón")){
			
			System.out.println("Es de javalandia");
					
			
		}else {
			
			System.out.println("No es de javalandia");
			
		}

	}

}
