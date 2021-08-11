package entidades;

public class Produto {
	
	//Atributos -é,tem ou estar
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	//Construtor
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque<0) {
			this.estoque = 0;
		}else {
			
		}
		
	}
	//Encapsulamento - metodo
	//get- chama/ set - muda
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	/* public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	*/
	
	//metodos
	public void incluiEstoque(int quantidade) {
		if(quantidade<=0) {
			System.out.println("Quantide incorreta");
		}else {
			this.estoque = this.estoque + quantidade;
		}

	}
	
	public void retiraEstoque(int quantidade) {
		if(quantidade > estoque) {
			System.out.println("Quantidade indisponivel");
		}else{
			this.estoque = this.estoque - quantidade;
		}
		
	}
	
	

}
