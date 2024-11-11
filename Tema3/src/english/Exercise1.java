package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Variables
		
		int numbers[]= new int [10];
		String answer;
		int position;
		int value;
		
		Scanner sc= new Scanner(System.in);
		
		do {
			
		System.out.println("A_Show values.");
		System.out.println("B_Introduce a value.");
		System.out.println("C_Exit.");
		
		answer= sc.nextLine();
		
		switch(answer.toLowerCase()){
		case equalsIgnoreCase("A")->
		System.out.println(Arrays.toString(numbers));
		
		case equalsIgnoreCase("B") ->{
		
			System.out.println("");
			value= sc.nextInt();
			System.out.println("");
			position= sc.nextInt();
		}
		}
		
		
		
			
			
		 
			
			
			System.out.println();
		
		
		
		
		}while(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b"));

	}

}
