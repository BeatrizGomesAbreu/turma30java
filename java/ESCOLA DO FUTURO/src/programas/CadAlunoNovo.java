package programas;

public class CadAlunoNovo {

	public static void main(String[] args) {
		
		//instanciar um aluno
		
		Aluno exemplo1 = new Aluno();
		Aluno exemplo2 = new Aluno();
		exemplo1.nome ="EPAMINONDAS";
		exemplo1.matricula = "MAT-01";
		exemplo1.nota = 5;
		exemplo1.anoNasc = 2005;
		
		exemplo2.nome = "MARIA";
		exemplo2.matricula = "MAT-200";
		exemplo2.nota = 10;
		exemplo2.anoNasc = 1978;
		
		if (exemplo1.nota > exemplo2.nota) {
			System.out.println("A maior nota é de alune: "+exemplo1.nota);	
		}
		
		exemplo1.mostraIdade(2021);
	}

}
