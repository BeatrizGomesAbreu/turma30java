package lista5;

public class Cavalo extends Animal {

private boolean correr;
	
	public Cavalo(String nome, int idade, boolean som, boolean correr) {
		super(nome);
		this.correr = correr;
	}
	
	public void corre() {
		if (correr) {
			System.out.printf("\nEsse cavalo corre!");
		}
		else {
			System.out.printf("\nEsse cavalo n�o corre!");
		}
	}
	
	
	@Override
	public void emiteSom() {
		System.out.println("\nIh Ih Ih Ih");
	}


}
