package lista1;

import java.util.Scanner;

public class exerc3 {
	
	public static void main (String [] args)
	{
		

		int segundos;
		int minutos;
		int horas;

		Scanner leia = new Scanner (System.in);

		System.out.println("Digite a duração do evento em segundos: ");
		segundos = leia.nextInt();

		minutos = segundos / 60;
		horas = minutos / 60;
		segundos = minutos % 60;

		System.out.println("O total de duração é: ");
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

	
}

}
