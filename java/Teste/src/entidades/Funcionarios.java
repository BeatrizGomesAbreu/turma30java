package entidades;

public class Funcionarios {
	
	//atributos
	private String matricula;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	//construtor
	public Funcionarios(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	//encapsulamento
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	//metodoSalario
	public double calculoSalario() {
		return valorPorHora * horasTrabalhadas;
	}
	
	
}
