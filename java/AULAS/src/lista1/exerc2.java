package lista1;

import java.util.Scanner;

public class exerc2 {
	
	public static void main (String [] args)
	{
	

		int anos;
		int meses;
		int dias;
		int totalMeses;
		int totalDias;

		Scanner leia = new Scanner (System.in);

		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();

		anos = dias / 365;
		meses = dias % 365;
		totalMeses = meses / 30;
		dias = meses % 30;

		System.out.println("Sua idade Em Anos: " + anos);
		System.out.println("Sua idade Em Meses: " + totalMeses);
		System.out.println("Sua idade em Dias: " + dias);
	}

}
