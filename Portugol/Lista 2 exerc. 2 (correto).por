programa
{
	
	funcao inicio()
	{
	cadeia codigo
	inteiro horasTrabalhadas=0
	inteiro excessoHoras=0
	real salarioTotal=0.00
	real salarioExcedente=0.00
	const real VALOR_HORA_NORMAL = 10.00
	const real VALOR_HORA_EXCEDENTE = 20.00
	const inteiro LIMITE_HORAS = 50

	escreva("Digite o codigo do funcionario: ")
	leia(codigo)
	escreva("Qual o número de horas trabalhadas: ")
	leia (horasTrabalhadas)
	
	se (horasTrabalhadas<=50){
		salarioTotal=horasTrabalhadas*10.00
		escreva("Salario total: R$ ",salarioTotal)
		
	}

	senao se (horasTrabalhadas> 50){
		excessoHoras = horasTrabalhadas -50
		salarioExcedente = excessoHoras*20.00
		salarioTotal = salarioExcedente + (50*10.00)
		escreva("Salario total: R$ ",salarioTotal)
		escreva("\nSalario excedente: R$ ",salarioExcedente)
		
	}
		



	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */