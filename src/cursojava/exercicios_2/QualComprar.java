package cursojava.exercicios_2;

import java.util.Scanner;

public class QualComprar {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do primeiro produto");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do segundo produto");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do terceiro produto");
		double n3 = scan.nextDouble();
		
		if (n1 < n2 && n1 < n3 ){
			System.out.println("Voc� deve comprar o primeiro produto.");
		}else if (n2 < n1 && n2 < n3){
		System.out.println("Voc� deve comprar o segundo produto.");
		}else {
			System.out.println("Voc� deve comprar o terceiro produto.");
		}
	}

}
