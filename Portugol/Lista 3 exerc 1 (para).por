programa
{
	//x = habitantes
	funcao inicio()
	{
	inteiro x, filhos, filhosTotal=0 
	real salario, mediaSalario, mediaFilhos, salarioTotal =0
	real maiorSalario=0, porcentagemSalario=0, salarioPercentual =0, numeroVez=5
	para (x =1; x <=numeroVez; x++){
		escreva("digite seu salario: ")
		leia (salario)
		salarioTotal = salarioTotal + salario
		se(salario > maiorSalario){
			maiorSalario = salario
		}
		se(salario <=100){
			salarioPercentual = salarioPercentual +1
		 
			
		}

	escreva("Digite o numero de filhos: ")
	leia (filhos)
	filhosTotal = filhosTotal + filhos
		
	}
	mediaSalario = salarioTotal / numeroVez
	mediaFilhos = filhosTotal / numeroVez

	porcentagemSalario = (salarioPercentual/numeroVez)*100
	
	escreva("Salario total: ",salarioTotal)
	escreva("\nMédia salarial: ",mediaSalario)
	escreva("\nTotal de filhos: ",filhosTotal)
	escreva("\nMédia de filhos: ",mediaFilhos)
	escreva("\nMaior salario: ",maiorSalario)
	escreva("\nPorcentagem habitantes que recebem até 100 é: ",porcentagemSalario,"%")
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */