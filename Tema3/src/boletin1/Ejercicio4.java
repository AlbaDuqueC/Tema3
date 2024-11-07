package boletin1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable

		int tabla[] = new int[12];
		
		tabla[0]=39;
		
		tabla[1]=-2;
		tabla[4]=0;
		tabla[6]=14;
		tabla[8]=5;
		tabla[9]=120;

		
		// Creamos un bucle para que imprima la tabla
		for (int num : tabla) {
			System.out.print(num + "  ");
		}


	}

}
