package lista4;

public class avião {
	
	/*
	 * Crie uma classe avião e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto avião, defina as instancias deste
	 * objeto e apresente as informações deste objeto no console.
	 */
	public String modelo;
	public int anoFabricacao;
	public int capacidadePassageiros = 132;
	public int velocidadeMax = 913;
	
	public avião() {
	
}
	public void tempoDeFabricacao(int anoAtual) {
		System.out.println("tempo De Fabricação da aeronave é de "+ (anoAtual - anoFabricacao )+" Anos");

	}
}
	 