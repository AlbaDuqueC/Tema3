package EjClase;

import java.util.Arrays;
import java.util.Random;

public class Minas2D {

	public static void main(String[] args) {

		char[][] tabla = new char[5][5];

		for (int i = 0; i < tabla.length; i++) {
			Arrays.fill(tabla[i], '-');
		}



		tabla=posicionNum(tabla);
		posicionarMinas(tabla, 5);

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {

				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void posicionarMinas(char[][] tablero, int numMinas) {
		Random rand = new Random();
		int posFila;
		int posColumna;
		int cont = 0;

		while (cont < numMinas) {
			posFila = rand.nextInt(0, tablero.length);
			posColumna = rand.nextInt(0, tablero[posFila].length);

			if (tablero[posFila][posColumna] != '*') {
				tablero[posFila][posColumna] = '*';
				cont++;
			}
		}
		
	}

	static char[][] posicionNum(char[][] tabla) {
		
		char [][] Num= tabla;
		
		posicionarMinas(Num, 5);

		char cont = 0;

		for (int lin = 0; lin < Num.length; lin++) {

			for (int colum = 0; colum < Num[lin].length; colum++) {
				
				cont=0;

				for (int i = -1; i <= 1; i++) {

					for (int j = -1; j <= 1; j++) {

						if (Num[lin][colum] != '*') {

							if (lin != 0 && lin != 4 && colum != 0 && colum != 4) {

								if (Num[lin + i][colum + j] == '*') {

									cont++;

								}

							} else if (lin == 0 || lin == 4 || colum == 0 || colum == 4){

								//Pico izquierda arriba
								if (lin == 0 && colum == 0 && i != -1 && j != -1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								}
								//Pico arriba derecha
								else if (lin == 0 && colum == 4 && i != -1 && j != 1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								} 
								

								//Pico izquierdo abajo
								else if (lin == 4 && colum == 0 && i != 1 && j != -1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								} 
								
								//Pico derecha abajo
								else if (lin == 4 && colum == 4 && i != 1 && j != 1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								} 
								
								
								//linea de arriba 
								else if (lin == 0 && colum!=0 && colum!=4 && i != -1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								}
								
								//linea de abajo
								else if (lin == 4 && colum!=0 && colum!=4  && i !=1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								}
								
								//lateral derecho
								else if (colum == 0 && lin!=0 &&lin!=4 && j != -1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								}
								//lateral izquierda
								else if (colum == 4 && lin!=0 &&lin!=4 && j != 1) {

									if (Num[lin + i][colum + j] == '*') {

										cont++;

									}
								}
							}
						}
						
						
						tabla[lin][colum] = (char) (cont + '0') ;
					}

				}
				
				

				

			}

		}
		return Num;

	}

}
