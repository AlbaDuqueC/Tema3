package boletin4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables

		int tabla[] = { 5, 19, 1, 4, 9, 17 };

		int max = maxTabla(tabla);

		System.out.println(max);

	}

	static int maxTabla(int tabla[]) {
		
		int max=0;
		
		for(int i=0; i<tabla.length; i++) {
			
			int num= tabla[i];
			
			if(num>max) {
				
				max=num;		
			}
			
			num=0;
		}
		
		return (max);	
	}

}
