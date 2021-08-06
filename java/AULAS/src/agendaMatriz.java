import java.util.Scanner;

public class agendaMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String agenda[][] = new String [24][31];
		int auxDia, auxHora;
		char op;
		
		do {
		System.out.println("Digite o dia do evento: ");
		auxDia = leia.nextInt()-1;
		System.out.println("Digite a hora do evento: ");
		auxHora = leia.nextInt();
		leia.nextLine(); //limpa o baffer
		System.out.println("Qual o evento: ");
		agenda[auxHora][auxDia] = leia.nextLine();
		System.out.print("Continua S/N: ");
		op = leia.next().toUpperCase().charAt(0);
		}
		while(op=='S');
		System.out.println("Mostrando agenda");
		for(int dia=0; dia<31; dia++) {
			for(int hora=0; hora<24; hora++) {
				if(agenda[hora][dia] != null) {
					System.out.printf("Dia %d - hora %d: %s\n",dia+1, hora, agenda[hora][dia]);	
				}
				
			}
			
		}
	}

}
