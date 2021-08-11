

public class Conta {
	// - inteiro : numero
	// - cadeia : nomeCliente
	 //-  real: saldo
	
	private int numero;
	private String nomeCliente;
	private Double saldo;
	
	
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public Double getSaldo() {
		return saldo;
	}


	/*public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	*/
	//metodo
	public void credito(double valor) {
		if(valor<=0) {
			System.out.println("Limite indisponivel");
		}else {
			this.saldo = this.saldo + valor;
		}

	}
	
	public void débito(double valor) {
		if(valor<0) {
			System.out.println("Valor negativo impossivel realizar");
		}
		if(valor > saldo) {
			System.out.println("Saldo indisponivel");
		}else{
			this.saldo = this.saldo - valor;
		}
	
	}
}
