package cursojava.exercicios_2;

import java.util.Scanner;

public class QualMaiorDe3 {

	
	public static void main(String[] args) {
	
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero ");
		int n2 = scan.nextInt();
		
		System.out.println("Digite o terceiroo n�mero ");
		int n3 = scan.nextInt();
		
		if (n1 > n2 && n1 > n3){
			System.out.println("Maior n�mero: " + n1);
		}else if (n2 > n1 && n2 > n3){
		System.out.println("Maior n�mero: " + n2);
		}else {
			System.out.println("Maior n�mero: " + n3);
		}

	}

}
