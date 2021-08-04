package lista2;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		int numero3;
		int primeiro;
		int segundo;
		int terceiro;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o numero 1: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o numero 2: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o numero 3: ");
		numero3 = leia.nextInt();
		
		//numero menor
		if (numero1 < numero2 && numero1 < numero3) {
			primeiro = numero1;	
		}
		else if (numero2 < numero1 && numero2 < numero3) {
			primeiro = numero2;
		}
		else {
			primeiro = numero3;
		
		}
		//numero maior
		if (numero1 > numero2 && numero1 > numero3) {
			terceiro = numero1;	
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			terceiro = numero2;
		}
		else {
			terceiro = numero3;
		
		}
		//numero do meio
		if (numero1 > primeiro && numero1 < terceiro) {
			segundo = numero1;	
		}
		else if (numero2 > primeiro && numero2 < terceiro) {
			segundo = numero2;
		}
		else {
			segundo = numero3;
		
		}
		
			System.out.printf("A ordem crescente é: %d, %d, %d ", primeiro, segundo, terceiro);	
	
		}
	}


