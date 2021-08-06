package lista4;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe cliente e apresente os atributos e métodos referentes
		 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
		 * objeto e apresente as informações deste objeto no console.
		 */
	
	Scanner leia = new Scanner(System.in);	
	cliente cliente1 = new cliente();
	
	System.out.println("Digite o nome do cliente: ");
	cliente1.nome = leia.next();
	
	System.out.println("Digite o codigo do cliente: ");
	cliente1.codigo = leia.nextInt();
	
	System.out.println("Digite o ano de nascimento do cliente: ");
	cliente1.anoNasc = leia.nextInt();
	
	System.out.println("Nome: "+ cliente1.nome + "\nCódigo do cliente: "+ cliente1.codigo);
	cliente1.idade (2021);
	
	
	

	}

}
