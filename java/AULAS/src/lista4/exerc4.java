package lista4;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		funcionarios funcionario1 = new funcionarios();
		System.out.println("Digite o nome do(a) funcionario(a): ");
		funcionario1.nome = leia.next();
		
		System.out.println("Digite a matricula do(a) funcionario(a): ");
		funcionario1.matricula = leia.nextInt();
		
		System.out.println("Digite o ano que iniciou na empresa: ");
		funcionario1.anoInicio = leia.nextInt();
		
		System.out.println("Funcionario(a): "+funcionario1.nome+"\nMatricula do funcionario(a): "+funcionario1.matricula);
		funcionario1.tempoEmpresa(2021);
	}

}
