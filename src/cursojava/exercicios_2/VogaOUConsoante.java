package cursojava.exercicios_2;

import java.util.Scanner;

public class VogaOUConsoante {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		if (letra.length() > 1){
			System.out.println("N�o � uma letra v�lida.");
		}
		else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
			System.out.println("A letra " + letra + " � uma vogal.");
		}else {
			System.out.println("A letra " + letra + " � uma consoante.");
		}
	}

}
