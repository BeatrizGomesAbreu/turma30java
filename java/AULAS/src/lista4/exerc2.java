package lista4;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		avi�o avi�o1 = new avi�o();
		
		System.out.println("Digite o ano de fabrica��o da aeronave: ");
		avi�o1.anoFabricacao = leia.nextInt();
		
		System.out.println("Qual o modelo da aeronave: ");
		avi�o1.modelo = leia.next();
		
		System.out.println("Modelo da aeronave: "+avi�o1.modelo+"\nCapacidade de passageiros: "+avi�o1.capacidadePassageiros+" Pesooas"+"\nVelocidade maxima: "+avi�o1.velocidadeMax+"Km");
		avi�o1.tempoDeFabricacao(2021);
		
	}

}
