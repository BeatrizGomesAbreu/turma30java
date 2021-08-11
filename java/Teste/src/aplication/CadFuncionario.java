package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;
import entidades.Terceiro;


public class CadFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);		
		List<Funcionarios> folha = new ArrayList<>();
		char op;
		do {
			System.out.println("funcionario F-funcionario ou T-terceiro: ");
			char tipo= leia.next().toUpperCase().charAt(0);
			System.out.println("Digite a matricula: ");
			String matricula= leia.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora: R$ ");
			double valorPorHora = leia.nextDouble();
			if(tipo == 'T') {
				System.out.println("Digite o valor adicional: R$ ");
				double adicional = leia.nextDouble();
				folha.add(new Terceiro(matricula,horasTrabalhadas,valorPorHora,adicional));
			}else if(tipo == 'F') {
				folha.add(new Funcionarios(matricula,horasTrabalhadas,valorPorHora));	
			}
			System.out.println("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
		}while(op=='S');
		
			for(Funcionarios fun : folha) {
				System.out.printf("Seu salario é: R$ %.2f\n",fun.getMatricula(),fun.salario());
		}
		
	}

}
