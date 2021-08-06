package programas;

public class Aluno {
	
	//isso é uma class e não um programa
	//atributos, construtores, encapsulamento(segurança), metodos.Todos podem ter sobrecarga-mais do mesmo
	
	//atributo-variavel
	public String nome;
	public String matricula;
	public boolean status;
	public int nota;
	public int anoNasc;
	
	//metodo
	
	public void mostraIdade(int anoAtual) {
		System.out.println("a idade é "+(anoAtual-anoNasc));
	}
	
}
