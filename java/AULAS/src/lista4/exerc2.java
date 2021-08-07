package lista4;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		avião avião1 = new avião();
		
		System.out.println("Digite o ano de fabricação da aeronave: ");
		avião1.anoFabricacao = leia.nextInt();
		
		System.out.println("Qual o modelo da aeronave: ");
		avião1.modelo = leia.next();
		
		System.out.println("Modelo da aeronave: "+avião1.modelo+"\nCapacidade de passageiros: "+avião1.capacidadePassageiros+" Pesooas"+"\nVelocidade maxima: "+avião1.velocidadeMax+"Km");
		avião1.tempoDeFabricacao(2021);
		
	}

}
