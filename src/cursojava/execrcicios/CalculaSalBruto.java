package cursojava.execrcicios;

import java.util.Scanner;

public class CalculaSalBruto {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		double horTrab = scan.nextDouble();
		
		double salario = ganhoHora * horTrab;
		
		System.out.println("Seu sal�rio � de " + salario);
		
		
	}

}
