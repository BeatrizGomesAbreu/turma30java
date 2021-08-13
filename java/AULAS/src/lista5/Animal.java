package lista5;

public class Animal {

	private String nome;
	private int idade;
	private boolean som;
	
	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void emiteSom() {
		System.out.println("Emitindo som...");
	}

	
}
