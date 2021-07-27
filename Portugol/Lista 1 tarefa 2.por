programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias

		escreva("Qual sua iade em total de dias: ")
		leia (totalDias)
		

		anos = totalDias / 360
		meses = (totalDias % 360) / 30
		dias = (totalDias % 360) % 30

		escreva("\nAno(s) :" + anos)
		escreva("\nMes(es) :" + meses)
		escreva("\nDia(s) :" + dias)
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */