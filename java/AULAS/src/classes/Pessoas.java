package classes;

public class Pessoas {

	public String nome;
	public int anoNascimento;
	public String cpf;
	public char pronome; //O,A,E
	public boolean ativo;
	
	//tudo é metodo ()
	public void mostrarIdade() {
		System.out.println(2021-anoNascimento);
	}
	
	//outra forma de calcular idade
	public int calcIdade(int anoAtual) {
		
		return anoAtual - anoNascimento;
	}
	//construtor vazio ou padrão
	
	public Pessoas() {
		
	}
	
	//construtor com nome
	
	public Pessoas(String nome) {
		this.nome = nome;
	}
}
