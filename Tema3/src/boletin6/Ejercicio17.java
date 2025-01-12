package boletin6;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Variables
		// código con comentarios
		String codigo;

		//Codigo sin
		String codigoSinComentarios;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el codigo C:");

		codigo = sc.nextLine();

		// eliminar los comentarios
		codigoSinComentarios = eliminarComentarios(codigo);

		// Imprimimos el código sin comentarios
		System.out.println("Código sin comentarios:");

		System.out.println(codigoSinComentarios);
	}

	// Función que elimina los comentarios
	public static String eliminarComentarios(String codigo) {
		
		// Elimina los comentarios de bloque /* ... */
		codigo = codigo.replaceAll("/\\*.*?\\*/", "");

		// Elimina los comentarios de una sola línea // ...
		codigo = codigo.replaceAll("//.*", "");

		return codigo;
	}

}
