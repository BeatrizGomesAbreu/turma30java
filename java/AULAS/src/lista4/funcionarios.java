package lista4;

public class funcionarios {
	
	public String nome;
	public int matricula;
	public int anoInicio;
	
	public void tempoEmpresa(int anoAtual) {
		System.out.println("Tempo de contribui��o do funcionario � de: "+(anoAtual - anoInicio)+" Anos");
	}
	
}
