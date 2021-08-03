import java.util.Scanner;

public class TemperaturaCtoF {

	public static void main (String[] arg) {
		
	double TemperaturaC=0.00;
	double TemperaturaF=0.00;
	String nome;
	Scanner leia = new Scanner(System.in);
	 System.out.print("Digite seu nome: ");
	 nome = leia.next();
	 System.out.print("Digite a temperatura em celsius: ");
	 TemperaturaC = leia.nextDouble();
	 
	 TemperaturaF = (TemperaturaC*1.8) + 32;
	 
	 System.out.print("Olá, "+nome+" A temperatura é "+TemperaturaF+" F");
	 
		
	}
	
	
}
