package boletin7;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Implementa el control de acceso al área restringida de un programa. Los
	 * nombres de usuario con sus correspondientes contraseñas deben estar
	 * almacenados en una estructura de la clase HashMap. El programa mostrará un
	 * menú con dos opciones:
	 * 
	 * Registro. Debe pedir un nombre de usuario y una contraseña. A continuación,
	 * se almacenarán en el mapa.
	 * 
	 * Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario
	 * introduce los datos correctamente, el programa dirá “Ha accedido al área
	 * restringida”.
	 * 
	 * El usuario tendrá un máximo de 3 oportunidades. Si se agotan las
	 * oportunidades el programa dirá “Lo siento, no tiene acceso al área
	 * restringida”. Salir. Termina el programa.
	 */

	public static void main(String[] args) {

		HashMap<String, String> usuarios = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		String nuevoUsuario;
		String nuevaContrasena;
		String usuario;
		String contrasena;
		int intentos;
		int menu;

		while (true) {

			System.out.println("Menú: ");

			System.out.println("1. Registro");

			System.out.println("2. Login");

			System.out.println("3. Salir");

			System.out.print("Elija una opción: ");

			menu = sc.nextInt();

			switch (menu) {

			case 1 -> {

				System.out.print("Introduzca un nombre de usuario: ");

				nuevoUsuario = sc.next();

				if (usuarios.containsKey(nuevoUsuario)) {

					System.out.println("El nombre de usuario ya existe. Por favor, elija otro.");

				} else {

					System.out.print("Introduzca una contraseña: ");

					nuevaContrasena = sc.next();

					usuarios.put(nuevoUsuario, nuevaContrasena);

					System.out.println("Usuario registrado exitosamente.");
				}
			}

			case 2 -> {

				System.out.print("Introduzca su nombre de usuario: ");

				usuario = sc.next();

				if (usuarios.containsKey(usuario)) {

					intentos = 3;

					while (intentos > 0) {

						System.out.print("Introduzca su contraseña: ");

						contrasena = sc.next();

						if (usuarios.get(usuario).equals(contrasena)) {

							System.out.println("Has accedido.");

							intentos = 0;

						} else {

							intentos--;

							System.out.println("Contraseña incorrecta. Le quedan " + intentos + " intentos");
						}

						if (intentos == 0 && !usuarios.get(usuario).equals(contrasena)) {

							System.out.println("Lo siento, no tiene acceso.");
						}
					}

				} else {

					System.out.println("El usuario no existe. Por favor, regístrese primero.");
				}
			}

			case 3 -> {

				System.out.println("Saliendo del programa.");

				sc.close();

			}
			default -> System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

}
