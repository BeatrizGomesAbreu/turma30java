

public class ContaEstudantil extends Conta{
	
	/*
	 * ContaEstudantil
	 * real: limiteEstudantil
	 * (+) usarEstudantil (soma no saldo - tira do estudantil)
	 */
	private double limiteEstandantil;

	//construtor
	public ContaEstudantil(int numero, String nomeCliente, double limiteEstandantil) {
		super(numero, nomeCliente);
		this.limiteEstandantil = limiteEstandantil;
	}
	//metodo
	public double getLimiteEstandantil() {
		return limiteEstandantil;
	}

	public void setLimiteEstandantil(double limiteEstandantil) {
		this.limiteEstandantil = limiteEstandantil;
	}
	
	public void limiteEstudantil(double valor) {
		double auxValor=0;
		if(valor>super.getSaldo()+this.limiteEstandantil) {
			System.out.println("Impossivel realizar");
		}else if(valor>super.getSaldo()) {
			auxValor = valor - super.getSaldo();
			super.credito(auxValor);
			limiteEstandantil = limiteEstandantil - auxValor;
			System.out.println("Novo limite estudantil: "+limiteEstandantil);
		}
	}
	
}
