package cursojava.exercicios_2;

import java.util.Scanner;

public class FolhaDePagamento {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		double horTrab = scan.nextDouble();
		
		double bruto = ganhoHora * horTrab;
		double impRenda = 0;
		
		/*Desconto do IR:
		Sal�rio Bruto at� 900 (inclusive) - isento
		Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
		Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
		Sal�rio Bruto acima de 2500 - desconto de 20%
		*/
		
		if (bruto >= 0 &&  bruto <= 900){
			impRenda = 0;
		}else if (bruto > 900 && bruto <= 1500 ){
			impRenda = 5;
		}else if ( bruto > 1500 && bruto <= 2500 ){
			impRenda = 10;
		}else {
			impRenda = 20;
		}
		
		double iNSS = 10;
		double sindicato = 3;
		double fGTS = 11;
		
		double iRValor = ( bruto / 100 ) * impRenda;
		double descINSS = ( bruto / 100 ) * iNSS ;
		double descSind = ( bruto / 100 ) * sindicato;
		double descFGTS = ( bruto / 100 ) * fGTS;
		
		double descontos = (descINSS + descSind + iRValor);
		double liquido = bruto - descontos;
		
		System.out.println("Sal�rio Bruto: (" + ganhoHora + " * " + horTrab + ")\t: R$ " + bruto );
		System.out.println("IR (" + impRenda + "%)\t\t\t: R$ " + iRValor);
		System.out.println("INSS (" + iNSS + "%)\t\t\t: R$ " + descINSS);
		System.out.println("FGTS (" + fGTS + "%)\t\t\t: R$ " + descFGTS ); 
		System.out.println("Contribui��o sindical (" + sindicato + "%)\t: R$ " + descSind);
		System.out.println("Total de descontos\t\t: R$ " + descontos);
		System.out.println("Sal�rio l�quido\t\t\t: R$ " + liquido);
		
	}

}
