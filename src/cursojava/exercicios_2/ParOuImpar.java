package cursojava.exercicios_2;

import java.util.Scanner;

public class ParOuImpar {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
			
		System.out.println("Entre com um n�mero. ");
		int num = scan.nextInt();
		
		if (num % 2 == 0 ){
			System.out.println("N�mero par.");
		} else {
			System.out.println("Numero impar.");
		}

	}

}
