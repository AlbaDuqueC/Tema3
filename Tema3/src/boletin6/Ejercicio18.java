package boletin6;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Variables
		
		  String titulo;
		  
		  String parrafo;
		  
		  String html;
		  
		  Scanner sc= new Scanner (System.in);
		  
		  System.out.println("Introduzca el titulo de tu pagina web:");
		  
		  titulo = sc.nextLine();
		  
		  System.out.println("Introduzca el contenido que quiera que tenga su pagina web:");
		  
		  parrafo= sc.nextLine();
		  
		  html=generarHTML(titulo, parrafo);
		  
		  System.out.println(html);

	}

	static String generarHTML(String titulo, String parrafo) {
		
		String html; 
		
		// Agregamos el código HTML con las etiquetas
		html = "<!DOCTYPE html>\n";
		
		html += "<html>\n";
		
		html += "<head>\n";
		
		// Título de la página
		html += "<title>" + titulo + "</title>\n"; 
		
		html += "</head>\n";
		
		html += "<body>\n";
		
		// Encabezado 
		html += "<h1>" + titulo + "</h1>\n"; 
		
		 // párrafo
		html += "<p>" + parrafo + "</p>\n";
		
		html += "</body>\n";
		
		html += "</html>";

		return html;
	}

}
