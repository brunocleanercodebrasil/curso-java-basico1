package cursojava.exercicios_3;

import java.util.Scanner;


public class EntreDoisNumeros {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numA;
		int numB;
		
		System.out.println("Entre com o primeiro N�mero.");
		numA = scan.nextInt();
		
		System.out.println("Entre com o segundoo N�mero.");
		numB = scan.nextInt(); 
		
		if ( numA > numB ){
			for(int x = numA - 1; x > numB; x--){
				System.out.print(x + " ");
			}
		}else if( numB > numA ){
				for(int x = numA + 1; x < numB; x++){
					System.out.print(x + " ");
			}
		}else {
			System.out.println("Os n�meros s�o iguais. N�o h� intervalo inteiro entre eles." );
		}

	}

}
