package lista5;

public class Cachorro extends Animal{
	
private boolean correr;
	
	public Cachorro(String nome, int idade, boolean som, boolean correr) {
		super(nome);
		this.correr = correr;
	}
	
	public void corre() {
		if (correr) {
			System.out.printf("\nEsse cachorro corre!");
		}
		else {
			System.out.printf("\nEsse cachorro não corre!");
		}
	}
	
	
	@Override
	public void emiteSom() {
		System.out.println("\nAU AU AU AU");
	}

}
