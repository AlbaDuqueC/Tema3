package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio10{
	
	/*
	 * Realiza una aplicación donde se registren nombres de productos y su precio. Lleva a cabo el siguiente menú:
	 * 
	 * PRODUCTOS
	 * 1. Alta de producto
	 * 2. Baja de producto
	 * 4. Listar existencias
	 * 0. Salir
	 * 
	 * El orden en el que se almacenan los productos no importa.
	 * */

    static TreeMap<String, Double> registroProductos = new TreeMap<>();
    
    static Scanner sc = new Scanner(System.in);
    
    static String continuar = "s";
    static int opcion = 0;
    static String nombre = "";
    static double precio = 0.0;

    public static void main(String[] args) {
    	
        System.out.println("Gestión de Productos.");

        while ("s".equals(continuar)) {
        	
            mostrarMenu();

            opcion = sc.nextInt();

            switch (opcion) {
            
                case 1->{
                	
                    altaProducto();
                }
                    
                case 2->{
                	
                    bajaProducto();
                }
                    
                case 3->{
                	
                    listarProductos();
                }
                    
                case 0->{
                	
                    System.out.println("Saliendo");
                    continuar = "n";
                }
                    
                default->{
                	
                    System.out.println("");
                }
            }

            if (!"n".equals(continuar)) {
            	
                System.out.print("¿Quieres realizar otra operación? (s/n): ");
                
                continuar = sc.next().toLowerCase();
            }
        }

        System.out.println("Salir");
        
    }

    private static void mostrarMenu() {
    	
        System.out.println("PRODUCTOS: ");
        
        System.out.println("1. Alta de producto");
        
        System.out.println("2. Baja de producto");
        
        System.out.println("3. Listar existencias");
        
        System.out.println("0. Salir");
        
        System.out.print("Selecciona una opción: ");
        
    }

    static void altaProducto() {
    	
        System.out.print("Introduce el nombre del producto: ");
        
        nombre = sc.next();

        if (registroProductos.containsKey(nombre)) {
        	
            System.out.println("El producto ya existe. Vuelve a poner el nombre.");
            
            return;
        }

        System.out.print("Introduce el precio del producto: ");
        
        precio = sc.nextDouble();

        registroProductos.put(nombre, precio);
        
        System.out.println("Producto añadido.");
        
    }

    static void bajaProducto() {
    	
        System.out.print("Introduce el producto que quieras eliminar: ");
        
        nombre = sc.next();

        if (registroProductos.remove(nombre) != null) {
        	
            System.out.println("Producto eliminado.");
            
        } else {
        	
            System.out.println("Producto no encontrado.");
        }
    }

     static void listarProductos() {
    	
        if (registroProductos.isEmpty()) {
        	
            System.out.println("No hay productos registrados.");
            
        } else {
        	
            System.out.println("Lista de Productos: ");
            
            for (String producto : registroProductos.keySet()) {
            	
                precio = registroProductos.get(producto);
                
                System.out.println("Producto: " + producto + ", Precio: " + precio + " €");
                
            }
        }
    }
}

