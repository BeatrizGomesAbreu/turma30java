package lista4;

public class avi�o {
	
	/*
	 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
	 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	 * objeto e apresente as informa��es deste objeto no console.
	 */
	public String modelo;
	public int anoFabricacao;
	public int capacidadePassageiros = 132;
	public int velocidadeMax = 913;
	
	public avi�o() {
	
}
	public void tempoDeFabricacao(int anoAtual) {
		System.out.println("tempo De Fabrica��o da aeronave � de "+ (anoAtual - anoFabricacao )+" Anos");

	}
}
	 