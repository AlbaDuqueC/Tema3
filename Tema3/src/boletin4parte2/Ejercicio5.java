package boletin4parte2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable

		int tabla1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int tabla2[][] = gira90(tabla1);

		for (int i = 0; i < tabla1.length; i++) {

			for (int j = 0; j < tabla1.length; j++) {

				System.out.print(tabla1[i][j] + "\t");
			}
			System.out.println();

		}
		
		System.out.println();
		
		for (int i = 0; i < tabla2.length; i++) {

			for (int j = 0; j < tabla2.length; j++) {

				System.out.print(tabla2[i][j] + "\t");
			}
			System.out.println();

		}
		

	}
	static int[][] gira90(int tabla1[][]){
		
		int tabla[][]= new int[tabla1.length][tabla1[0].length];
		int numi=0;
		int numj=0;
		
		for(int i=0; i<tabla1.length; i++) {
			
			for(int j=0; j<tabla1[i].length; j++) {
			

				numj=(tabla1.length-1-i);
				
				 tabla[j][numj]=tabla1[i][j];
				
		}
		}
		return tabla;
	}

}
