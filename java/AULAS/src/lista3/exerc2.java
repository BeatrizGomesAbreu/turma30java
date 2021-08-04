package lista3;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, par=0, impar=0;
	
		
		for(int x =1; x<=10; x++) {
			
			System.out.println("digite um numero: ");
			numero = leia.nextInt();
			if(numero %2 ==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Quantidade de numeros pares são: "+ par);
		System.out.println("\nQuantidade de numeros imapres são: "+ impar);
		
	}

}
