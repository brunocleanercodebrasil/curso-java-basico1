package cursojava.exercicios_2;

import java.util.Scanner;

public class InvestigaCrime {

	public static void main(String[] args) {
		
		/*
		 * "Telefonou para a v�tima?"
a. "Esteve no local do crime?"
b. "Mora perto da v�tima?"
c. "Devia para a v�tima?"
d. "J� trabalhou com a v�tima?" O programa deve no final emitir
uma classifica��o sobre a participa��o da pessoa no crime. Se
a pessoa responder positivamente a 2 quest�es ela deve ser
classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5
como "Assassino". Caso contr�rio, ele ser� classificado como
"Inocente".
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int resp = 0;
		
		
			
		System.out.println("Telefonou para a v�tima? s/n ");
		String r1 = scan.next();		
		if (r1.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Esteve no local do crime? s/n ");
		String r2 = scan.next();
		if (r2.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Mora perto da v�tima? ");
		String r3 = scan.next();
		if (r3.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("Devia para a v�tima? ");
		String r4 = scan.next();
		if (r4.equalsIgnoreCase("s") ){
			resp++;
		}
		
		System.out.println("J� trabalhou com a v�tima? ");
		String r5 = scan.next();
		if (r5.equalsIgnoreCase("s") ){
			resp++;
		}
		
		//System.out.println( resp );
		
		switch ( resp ){
		case 2: System.out.println("Suspeito"); break;
		case 3: 
		case 4: System.out.println("C�mplice"); break;
		case 5: System.out.println("Assassino"); break;
		default: System.out.println("Inocente"); break;
		}

	}

}
