import java.util.Scanner;

public class ExemploSalario {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in); //instan é criar
	String nome="";
	double salario=0;
	double maiorSalario=0;
	String nomeMaiorSalario="";
	
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o salario: ");
		salario = leia.nextDouble();
	
	while(salario>0) {
		if (salario > maiorSalario) {
			maiorSalario = salario;
			nomeMaiorSalario = nome;
		}
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o salario: ");
		salario = leia.nextDouble();
	}
	 System.out.println();
	 System.out.printf("O maior salario é %.2f da(o) %s ",maiorSalario,nomeMaiorSalario);
	

	}

}
