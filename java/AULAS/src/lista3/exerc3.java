package lista3;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			if(idade <21) {
				menor21++;
			}
			else if (idade >50) {
				maior50++;
			}
			else {
				
			}
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.print("A quantidade de menores que 21 é: "+menor21);
		System.out.print("\nA quantidade de maiores que 50 é: "+maior50);
	}

}
