package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables

		String[][] tablero = new String[8][8];

		int posFila;

		int posColumna;

		char pieza;
		
		boolean salir = true;

		Scanner sc = new Scanner(System.in);
		
		do {

		System.out.println("¿Que pieza es?");

		pieza = sc.next().toUpperCase().charAt(0);

		System.out.println("¿En que fila esta?");

		posFila = sc.nextInt();

		System.out.println("¿En que columna hay?");

		posColumna = sc.nextInt();

		
		
		}while(!salir);

		switch (pieza) {

		case 'T' -> {
			
			

			tablero = Torre(tablero, posFila, posColumna);
			
			tablero= Nulos(tablero, posFila, posColumna);

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {

					System.out.print(tablero[i][j]);

				}
				System.out.println();
				System.out.println();
			}

		}
		case 'A' -> {

			tablero = Alfil(tablero, posFila, posColumna);
			
			tablero= Nulos(tablero, posFila, posColumna);

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {

					System.out.print(tablero[i][j]);

				}
				System.out.println();
				System.out.println();
			}

		}
		case 'D' -> {

			tablero = Dama(tablero, posFila, posColumna);
			
			tablero= Nulos(tablero, posFila, posColumna);

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {

					System.out.print(tablero[i][j]);

				}
				System.out.println();
				System.out.println();
			}

		}
		case 'C' -> {

			tablero = Caballo(tablero, posFila, posColumna);
			
			tablero= Nulos(tablero, posFila, posColumna);

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {

					System.out.print(tablero[i][j]);

				}
				System.out.println();
				System.out.println();
			}

		}
		default -> {
			System.out.println("NADA");
		}

		}

		sc.close();

	}

	//Torre
	static String[][] Torre(String tablero[][], int posFila, int posColumna) {
		String[][] tableroT = new String[8][8];

		tableroT[posFila][posColumna] = "  T  ,";

		for (int j = 0; j < tableroT.length; j++) {

			if (j != posColumna) {

				tableroT[posFila][j] = "  X  ,";
			}
		}

		for (int i = 0; i < tableroT.length; i++) {
			if (i != posFila) {
				tableroT[i][posColumna] = "  X  ,";
			}
		}

		

		return tableroT;
	}

	//Alfil
	static String[][] Alfil(String tablero[][], int posFila, int posColumna) {

		String[][] tableroA = new String[8][8];

		tableroA[posFila][posColumna] = "  A  ,";

		int cont = 0;

		int colum = posColumna;

		int fila = posFila;

		for (int i = fila; i >= 0; i--) {

			cont = 0;

			for (int j = colum; j >= 0; j--) {

				if (i != fila && j != posColumna) {

					if (cont == 0) {

						tableroA[i][j] = "  X  ,";

						cont++;
					}

				}

			}
			colum--;
		}

		colum = posColumna;

		for (int i = fila; i >= 0; i--) {

			cont = 0;

			for (int j = colum; j < tableroA[i].length; j++) {

				if (i != fila && j != posColumna) {

					if (cont == 0) {

						tableroA[i][j] = "  X  ,";

						cont++;
					}

				}

			}
			colum++;

		}
		colum = posColumna;

		for (int i = fila; i < tableroA.length; i++) {

			cont = 0;

			for (int j = colum; j >= 0; j--) {
				if (i != fila && j != posColumna) {

					if (cont == 0) {

						tableroA[i][j] = "  X  ,";

						cont++;
					}

				}

			}
			colum--;

		}

		colum = posColumna;

		for (int i = fila; i < tableroA.length; i++) {

			cont = 0;

			for (int j = colum; j < tableroA[i].length; j++) {

				if (i != fila && j != posColumna) {

					if (cont == 0) {

						tableroA[i][j] = "  X  ,";

						cont++;
					}

				}

			}
			colum++;

		}


		return tableroA;
	}

	//Dama
	static String[][] Dama(String tablero[][], int posFila, int posColumna) {

		String[][] tableroD = new String[8][8];
		
		tableroD = Alfil(tablero, posFila, posColumna);

		tableroD[posFila][posColumna] = "  D  ,";

		for (int j = 0; j < tableroD.length; j++) {

			if (j != posColumna) {

				tableroD[posFila][j] = "  X  ,";
			}
		}

		for (int i = 0; i < tableroD.length; i++) {
			if (i != posFila) {
				tableroD[i][posColumna] = "  X  ,";
			}
		}

		return tableroD;
	}

	//Caballo
	static String[][] Caballo(String tablero[][], int posFila, int posColumna) {
		String[][] tableroC = new String[8][8];

		tableroC[posFila][posColumna] = "  C  ,";

		String movimiento = "  X  ,";

		
		if( posFila - 1 >= 0 && posColumna - 2 >= 0 ) {
			
			tableroC[posFila - 1][posColumna - 2] = movimiento;
			
		}
		
		if(posFila - 2 >= 0 && posColumna - 1 >= 0 ) {
			
			tableroC[posFila - 2][posColumna - 1] = movimiento;
			
		}
		
		if(posFila - 1 >= 0 && posColumna + 2 < tablero.length) {
			
			tableroC[posFila - 1][posColumna + 2] = movimiento;
		}
		
		if(posFila - 2 >= 0 && posColumna + 1 < tablero.length ) {
			
			tableroC[posFila - 2][posColumna + 1] = movimiento;

		}
		
		if(posFila + 1 < tablero.length && posColumna - 2 >= 0 ) {
			
			tableroC[posFila + 1][posColumna - 2] = movimiento;
		}
		
		if(posFila + 2 < tablero.length && posColumna - 1 >= 0) {
			
			tableroC[posFila + 2][posColumna - 1] = movimiento;
		}
		
		if(posFila + 1 < tablero.length && posColumna + 2 < tablero.length) {
			
			tableroC[posFila + 1][posColumna + 2] = movimiento;

		}
		
		if(posFila + 2 < tablero.length && posColumna + 1 < tablero.length) {
			
			tableroC[posFila + 2][posColumna + 1] = movimiento;
		}

		return tableroC;

	}
	
	//reina
	static String[][] Nulos(String tablero[][], int posFila, int posColumna) {
		String[][] tableroN = new String[8][8];
		
		tableroN=tablero;
		
		for (int i = 0; i < tableroN.length; i++) {

			for (int j = 0; j < tableroN[i].length; j++) {

				if (tableroN[i][j] == null) {
					tableroN[i][j] = "     ,";

				}
			}

		}
		
		return tableroN;
	}

}
