package boletin6;

import java.util.Scanner;

public class Ejercicio9 {
	
	//Esta mal, tengo que arreglarlo :)

	public static void main(String[] args) {
		// Variables

		String frase;

		String[] fraseT;
		
		String fraseCom="";

		boolean javalandia;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");

		// Scanea y almacena la frase introducida
		frase = sc.nextLine().toLowerCase();

		// Introduce la frase y la almacena por palabras
		fraseT = frase.split(" ");
		
		for (String i: fraseT) {
			
			fraseCom=fraseCom+i+" ";
			
			if(fraseCom== "Javalín, javalón") {
				
				javalandia=true;
			
				fraseCom="";
			}
			else if (i=="javalén") {
				
				fraseCom="javalén";
				
			}
			else if(fraseCom== "javalén, len, len") {
				
				javalandia=true;
				
			}
			
			
		}
		
		if(javalandia=true) {
			
			System.out.println("Es de javalandia");
			System.out.println(fraseCom);
			
		}else {
			
			System.out.println("No es de javalandia");
			System.out.println(fraseCom);
			
		}

	}

}
