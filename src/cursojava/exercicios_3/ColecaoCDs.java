package cursojava.exercicios_3;

import java.util.Scanner;

public class ColecaoCDs {

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		double preco = 0;
		double total = 0;
		
		System.out.println("Entre com o n�mero de cds.");
		int cds = scan.nextInt();
		
		for (int i = 1; i <= cds; i++){
			System.out.println("Entre com o pre�o do cd " + i);
			preco = scan.nextDouble();
			
			total += preco;
			
		}
		
		double media = total / cds;
		System.out.println("Valor total da cole��o: R$ " + total);
		System.out.println("Valor m�dio para cada cd: R$ " + media);

	}
	
}
