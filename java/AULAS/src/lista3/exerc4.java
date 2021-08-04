package lista3;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		char genero; //(1-fem /2-masc / 3- out
		char opcoes=' '; //(1- P calma/ 2- P nervosas / 3- P agressiva
		int contadorPessoas=0;
		char op='s';
		final int LIMITE_PESSOAS=3;
		
		int numeroPcalmas=0, numeroMnervosas=0, numeroHagressivos=0;
		int numeroOcalmos=0, numeroPnervosas40=0, numeroPcalmas18=0;
		
		while(contadorPessoas < LIMITE_PESSOAS && op=='s') {
			
			System.out.print("Disite sua idade: ");
			idade = leia.nextInt();
			System.out.print("Disite seu genero\n1-fem\n2-masc\n3- out\nQual opção desejada: ");
			genero = leia.next().charAt(0);
			System.out.print("Disite seu temeramento\n1- P/ calmo(a)\n2- P/ nervoso(a)\n3- P/ agressivo(a)\nQual opção desejada: ");
			opcoes = leia.next().charAt(0);
			contadorPessoas++;
			System.out.println("Continua s/n: ");
			op = leia.next().toUpperCase().charAt(0);
			
			if(opcoes == '1') {
				numeroPcalmas++;
			}
			if(genero == '2' && opcoes == '2') {
				numeroHagressivos++;
			}
			if(genero == '3' && opcoes == '1') {
				numeroOcalmos++;
			}
			if(opcoes == '2' && idade >40) {
				numeroPnervosas40++;
			}
			if(opcoes =='1' && idade < 18) {
				numeroPcalmas18++;
			}
		}
		System.out.println("Pessoas calmas "+numeroPcalmas);
		System.out.println("mulheres nervosas "+numeroMnervosas);
		System.out.println("Homens agressivos "+numeroHagressivos);
		System.out.println("Outros calmos"+numeroOcalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos "+numeroPnervosas40);	
	    System.out.println("Pessoas calmas com menos de 18 anos "+numeroPcalmas18);
	}

}
