package lista2;

import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade < 5) {
			System.out.println("Voc� n�o atende as classifica��es desejadas ");
			
		}
		else if(idade<=7) {
			System.out.println("Voc� pertence ao infantil A ");	
			
		}
		else if(idade<=11) {
			System.out.println("Voc� pertence ao infantil B ");
		}
		
		else if(idade<=13) {
			System.out.println("Voc� pertence ao juvenil A ");
		}
		
		else if(idade<=17) {
			System.out.println("Voc� pertence ao juvenil B ");
		}
		
		else {
			System.out.println("Voc� pertence a categoria adulto ");
		}
	}

}
