import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor;
		int valores[] = new int [4]; //0-3
		/*
		 * try{
		 * }catch (erro){
		 * tratar de alguma forma esse erro
		 * }
		 */
	
		
		System.out.println("Digite a posi��o dentro do vetor de 0 � 3:");
		valor = leia.nextInt();
		System.out.println("Digite um valor inteiro: ");
		valores[valor] = leia.nextInt();
		
		System.out.printf("O valor digitado na posi��o %d foi: %d ",valor,valores[valor]);
		System.out.println("\nValor da divis�o teste: "+valores[valor]/valor);
		System.out.println("\nFim de programa!");
		
	}

}
