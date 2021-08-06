package lista4;

public class cliente {
	public String nome;
	public int codigo;
	public int anoNasc;
	
	public void idade(int anoAtual) {
		System.out.println("Idade"+ (anoAtual - anoNasc));

	}
}