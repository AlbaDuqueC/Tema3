package boletin6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable
		
		String contraseña;
		
		String intento;
		
		int alf;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce una contraseña: ");
		
		contraseña= sc.nextLine();
		
		System.out.println("Intenta adivinar la contraseña: ");
		
		intento= sc.nextLine();
		
		while(!contraseña.equals(intento)) {
			
			alf=intento.compareTo(contraseña);
			
			if(alf<0) {
				System.out.println("Es menor");		
			}
			else if(alf>0) {
				System.out.println("Es mayor");
			}
			
			System.out.println("Contraseña incorrecta, vuelve a introducir la contraseña:");
			
			intento= sc.nextLine();
			
			
			
		}
		System.out.println("Contraseña correcta, bienvenido");
		sc.close();

	}

}
