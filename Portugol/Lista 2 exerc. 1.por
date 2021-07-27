programa
{
	
	funcao inicio()
	{
		inteiro P, M, E
		inteiro limite, peso

	escreva("Qual o peso de sua mercadoria: ")
	leia (peso)
	limite = 50
	E = (peso - 50)
	M = 4*E

	se (peso <= 50){
	escreva("Dentro do limite ")	
	}
	senao se (peso > 50){
		escreva("Excesso de peso: "+E)
		escreva("\nMulta de: "+M)
		
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */