package boletin4parte2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables

		int tabla[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		if (esMagica(tabla) == true) {

			System.out.println("Es magica");

		} else if (esMagica(tabla) == false) {

			System.out.println("No es magica");
		}

	}

	static boolean esMagica(int tabla[][]) {

		boolean magia = true;

		int suma1 = 0;

		int suma2 = 0;

		int num = 0;

		for (int i = 0; i < tabla.length && magia; i++) {

			suma2 = 0;

			suma1 = 0;

			for (int j = 0; j < tabla.length ; j++) {
				
				
				

				suma1 +=tabla[i][j];

				suma2 +=tabla[j][i];
				
				if (i==0) {
					
					num +=tabla[0][j];
				}
				
				magia= verificar(suma1, suma2, num);
				
				

			}
			
			

		}


		return magia;

	}

	static boolean verificar(int suma1, int suma2, int num) {
		
		boolean verificar=true;
		
		
		
		
		
		if(num!=suma1 || num !=suma2) {
			verificar= false;
		}
				
		return verificar;
	}
}
