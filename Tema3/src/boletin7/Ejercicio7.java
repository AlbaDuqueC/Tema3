package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio7 {

	/*
	 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
	 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
	 * para almacenar las parejas de palabras. El programa mostrará un menú con dos
	 * opciones: 
	 * 
	 * Inserta palabra. Debe solicitar una palabra en español y su
	 * traducción al inglés. 
	 * 
	 * Busca palabra. Pregunta por una palabra en español y
	 * devuelve su traducción en inglés. Salir. 
	 * 
	 * Termina el programa.
	 */

	public static void main(String[] args) {
		
        TreeMap<String, String> diccionario = new TreeMap<>();
        
        Scanner sc = new Scanner(System.in);
        
        int menu;
        
        String palabraEspanol;
        String palabraIngles;
        String buscarPalabra;
        String traduccion;

        // Ponemos todas las traducciones
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("gracias", "thank you");
        diccionario.put("por favor", "please");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("escuela", "school");
        diccionario.put("libro", "book");
        diccionario.put("manzana", "apple");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("feliz", "happy");
        diccionario.put("triste", "sad");
        diccionario.put("coche", "car");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("camino", "path");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");

        do {
            System.out.println("Menú del Diccionario:");
            
            System.out.println("1. Inserta palabra");
            
            System.out.println("2. Busca palabra");
            
            System.out.println("3. Salir");
            
            System.out.print("Elige una opción: ");

            menu = sc.nextInt();           

            switch (menu) {
            
            case 1 -> {
            	
                System.out.println("Ingresa la palabra en español: ");
                
                 palabraEspanol = sc.next().toLowerCase();
                
                System.out.println("Ingresa su traducción en inglés: ");
                
                 palabraIngles = sc.next().toLowerCase();
                
                diccionario.put(palabraEspanol, palabraIngles);
                
                System.out.println("Palabra añadida");
                
            }
            
            case 2 -> {
            	
                System.out.print("Ingresa la palabra en español que quieres buscar: ");
                
                buscarPalabra = sc.next().toLowerCase();
                
                traduccion = diccionario.get(buscarPalabra);
                
                if (traduccion != null) {
                	
                    System.out.println("La traducción al inglés es: " + traduccion);
                    
                } else {
                	
                    System.out.println("La palabra no se encuentra en el diccionario.");
                    
                }
            }
            
            case 3 -> System.out.println("Salir");
            
            default -> System.out.println("Opción no válida. Elige una opción del menú.");
            
        }
            
        } while (menu != 3);

        sc.close();
    }

}
