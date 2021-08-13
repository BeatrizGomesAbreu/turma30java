package lista5;

public class Pregui�a extends Animal {
	
private boolean anda;
	
	public Pregui�a(String nome, int idade, boolean som, boolean anda) {
		super(nome);
		this.anda = anda;
	}
	
	public void anda() {
		if (anda) {
			System.out.printf("\nEssa pregui�a anda!");
		}
		else {
			System.out.printf("\nEssa pregui�a anda!");
		}
	}
	
	
	@Override
	public void emiteSom() {
		System.out.println("\nhuumm huumm");
	}
}
