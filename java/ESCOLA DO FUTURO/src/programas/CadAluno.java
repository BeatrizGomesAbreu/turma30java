package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String alunes[] = {"Ana Beatriz Y. Espejo", "Ana Carolina G. Souza", "Ana Paula Souza Dias",
				"Anderson Coelho Costa", "Andrei Felipe C. Souza", "Ariel B. Pirangy Soares",
				"Beatriz S. Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"Cássia de A. N. Santos", "Emerson Silva Santana", "Enzo Fulaneto\t", "Ester G. N. Nascimento",
				"Fábio Campaner Suzuki", "Felipe Matos de Lima", "Felipe Souza da Silva", "Flávio Augusto da Costa",
				"Giovanna S. P. Penedos", "Gustavo M. Ferreira", "Henrique Uriel Lopes",
				"João Pedro Cruz Gomes", "José P. M. F. Neto", "Letícia Porto Martins", "Lucas S. N. Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius C. Rego", "Matheus Araujo Farina",
				"Matheus de Brito Milani", "Natália R. S. Rocha", "Pamela Paulino\t", "Renata S. Ferreira",
				"Rodrigo R. L. Costa", "Sabrina Alves de Paiva", "Sergio de Jesus Severo",
				"Stefani F. P. Tosi", "Talita g. m. g. Lima ", "Thiago da Silva Machado", "Vinícios L. Silva",
				"Vinicius C. Silva"};
		int notas[] = new int[alunes.length], auxNotas; // Mat - 0x
		String matriculas[] = new String[alunes.length];
		boolean ativo[] = new boolean[alunes.length]; // true
		String auxMat;
		char resposta;
		char status;
		// mostra todo mundo
		// laço e pede:
		// pedi pela matricula 1 aluno
		// informar a nota deste aluno
		// vai informar se o aluno ainda continua ativo ou não [o usuario não pode
		// digitar verdadeiro ou falso
		// tem que fazer o processo até que pergunta continuar sim ou não seja não
		// após mostrar todos os alunos com nota pela regra
		// até 5 - estude mais
		// acima de 5 - otimo, continue assim
		// aluno inativo ou aluno ativo no true ou falso de ativo
		// apenas dos alunos que tem nota
		for (int x = 0; x < alunes.length; x++) {
			ativo[x] = true;
			if (x > 9) {
				matriculas[x] = "MAT-" + (x + 1);
			} else {
				matriculas[x] = "MAT-0" + (x + 1);
			}
		}
		System.out.println("MATRICULA\tALUNES\t\t\tNOTAS\tSTATUS");
		for (int x = 0; x < alunes.length; x++) {
			if (ativo[x] == true) {
				System.out.println(matriculas[x] + "\t" + alunes[x] + "\t" + notas[x] + "\t" + "\tAtivo");
				//((ativo[x]==true)?"ATIVO":"INATIVO") operador tenario
			}
		}

		do {
			System.out.println("Digite a matricula do alune: ");
			auxMat = leia.next().toUpperCase();
			for (int x = 0; x < alunes.length; x++) {
				if (auxMat.equals(matriculas[x])) {
					System.out.println("MATRICULA\tALUNES\t\t\tNOTAS\tSTATUS");
					System.out.println(matriculas[x] + "\t" + alunes[x] + "\t" + notas[x] + "\t" + ativo[x]);
					System.out.println("Insira a nota: ");
					auxNotas = leia.nextInt();
					notas[x] = auxNotas;
					if (notas[x] <= 5) {
						System.out.println("Você pode melhorar estude mais");
					} else {
						System.out.println("Ótimo continue estudando");
					}
					System.out.println("Atualize o status do aluno A/I: ");
					status = leia.next().toUpperCase().charAt(0);
					if (status == 'A') {
						ativo[x] = true;
					} else if (status == 'I') {
						ativo[x] = false;
					} else {
						System.out.println("Escolha invalida status permanece o mesmo");
					}
				}
			}

			System.out.println("Deseja continuar S/N: ");
			resposta = leia.next().toUpperCase().charAt(0);

		} while (resposta == 'S');

		System.out.println("MATRICULA\tALUNES\t\t\tNOTAS\tSTATUS");
		for (int x = 0; x < alunes.length; x++) {
			if (ativo[x] == true) {
				System.out.println(matriculas[x] + "\t" + alunes[x] + "\t" + notas[x] + "\t" + ativo[x]);
			}
		}
	}
}
