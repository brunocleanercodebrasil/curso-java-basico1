package cursojava.execrcicios;

import java.util.Scanner;

public class CalculaArea {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado");
		double lado = scan.nextDouble();
		
		//area = lado * lado;
		double area = Math.pow(lado, 2);
		System.out.println("A �rea do quadrado � igual a " + area);
		
		System.out.println("O dobro da �rea do quadrado � igual a " + (area * 2 ));
		
	}

}
