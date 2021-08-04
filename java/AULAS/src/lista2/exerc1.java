package lista2;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numero1;
		int numero2;
		int numero3;
		int maiorValor =0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o numero 1: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o numero 2: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o numero 3: ");
		numero3 = leia.nextInt();
		
		if(numero1 > maiorValor) {
			maiorValor = numero1;
		}
		
		if(numero2 > maiorValor) {
			maiorValor = numero2;
		}
		
		if(numero3 > maiorValor) {
			maiorValor = numero3;
		}
		
		System.out.println("O maior numero é: "+maiorValor);
	}

}
