package lista5;

public class Preguiça extends Animal {
	
private boolean anda;
	
	public Preguiça(String nome, int idade, boolean som, boolean anda) {
		super(nome);
		this.anda = anda;
	}
	
	public void anda() {
		if (anda) {
			System.out.printf("\nEssa preguiça anda!");
		}
		else {
			System.out.printf("\nEssa preguiça anda!");
		}
	}
	
	
	@Override
	public void emiteSom() {
		System.out.println("\nhuumm huumm");
	}
}
