package lista3;

import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	int numero, soma=0;
	
	do {
		System.out.printf("digite um numero: ");
		numero = leia.nextInt();
		soma = numero + soma;
	}
	while (numero !=0);
	System.out.printf("A soma é =%d",soma);
	}

}
