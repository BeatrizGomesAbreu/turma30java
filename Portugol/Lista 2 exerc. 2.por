programa
{
	
	funcao inicio()
	{
	cadeia codigo
	inteiro horasTrabalhadas=0
	inteiro horasExcedente=0
	real salarioTotal=0.00
	real salarioExcedente=0.00
	
	

		escreva("Digite o codigo do funcionario: ")
		leia(codigo)
		
		se (horasTrabalhadas<=50){
		salarioTotal=horasTrabalhadas*10.00	
		}
		senao {
			horasExcedente = horasTrabalhadas -50
			salarioExcedente = horasExcedente*20.00
			salarioTotal = salarioExcedente + (50*10.00)
		}
	escreva("Salario total: R$ ",salarioTotal)
	escreva("Salario excedente: R$ ",salarioExcedente) 
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */