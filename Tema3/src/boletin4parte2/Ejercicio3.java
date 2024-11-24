package boletin4parte2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Variables

		//tabla bidimensional de 3x3
		int tabla[][] = { { 1, 2, 3 }, { 2, 3, 2 }, { 3, 2, 1 } };

		//Imprime si es simetrico o no
		if (simetrico(tabla)==true) {
			
			System.out.println("La tabla es simetrica");
		}else
			System.out.println("La tabla no es simetrica");
		
		
	}

	//Da si es simetrico o no
	static boolean simetrico(int tabla[][]) {
		
		boolean simetrico=true;
		
		for(int i=0; i<tabla.length; i++ ) {
			
			for(int j=0; j<tabla[i].length; j++) {
				
				if(tabla[i][j]!= tabla[j][i]) {
					simetrico=false;
				}
				
			}
		}
		
		return simetrico;
	}

}

