package cursojava.exercicios_3;

import java.util.Scanner;

public class MediaIdade {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de pessoas entrevistadas.");
		int pessoas = scan.nextInt();
		
		double soma = 0;
		double media = 0;
		double idade = 0;
		
		for(int x = 1; x <= pessoas; x++){
			System.out.println("Entre com a " + x + "� idade.");
			idade = scan.nextDouble();
			
			soma += idade;
		}
		
		media = soma / pessoas;
		
		System.out.println("N�mero de pesssoas entrevistadas:" + pessoas);
		System.out.println("Soma das idades: " + soma);
		System.out.println("M�dia de idade das pessoas: " + media);
		if (media >= 0 && media < 26){
			System.out.println("Classifica��o: Jovens.");
		}else if (media >= 26 && media < 61){
			System.out.println("Classifica��o: Adultos.");
			}else if (media >= 61){
				System.out.println("Classifica��o: Idosos.");
			}

		
		
	}

}
