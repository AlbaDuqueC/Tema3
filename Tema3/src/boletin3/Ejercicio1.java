package boletin3;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variables
		int tabla [][]= new int [3][6];
		
		
		tabla[0][0]= 0;
		tabla[0][1]= 30;
		tabla[0][2]= 2;
		tabla[0][5]= 5;
		
		tabla[1][0]= 75;
		tabla[1][4]= 0;
		
		tabla[2][2]= -2;
		tabla[2][3]= 9;
		tabla[2][5]= 11;
		
		for(int filas=0; filas<3; filas++) {
			for(int columna=0; columna<6; columna++) {
				System.out.print(tabla[filas][columna]+ " ");
			}
			System.out.println();
		}

	}

}
