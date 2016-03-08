package cursojava.exercicios_2;

import java.util.Scanner;

public class Triangulo {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro lado:");
		double ld1 = scan.nextDouble();
						
		System.out.println("Segundo lado:");
		double ld2 = scan.nextDouble();
		
		System.out.println("Terceiro lado:");
		double ld3 = scan.nextDouble();

		
		if ( ( (ld1 + ld2) > ld3 ) || ( (ld1 + ld3) > ld2 ) || ( (ld2 + ld3) > ld1 )){
			
			if (ld1 == ld2 && ld1 == ld3 && ld2 == ld3){
				System.out.println("Tri�ngulo Equil�tero.");
			}else if (ld1 != ld2 && ld1 != ld3 && ld3 != ld2){
				System.out.println("Tri�ngulo Escaleno.");
			}else if (ld1 == ld2 || ld1 == ld3 || ld2 == ld3){
				System.out.println("Tri�ngulo Is�sceles.");
			}
		
		}else{
			System.out.println("N�o � um tri�ngulo.");
		}

	}

}
