programa
{
	
	funcao inicio()
	{
		
		inteiro valorBase, valorAltura, area
		
		escreva("Qual o valor de base: ")
		leia (valorBase)
		escreva("Qual o valor de altura: ")
		leia (valorAltura)
	area = (valorBase*valorAltura)/2

		
	se ((valorBase<0)ou(valorAltura<0)){
		escreva("\nValor negativo ")
	}
	senao {
		escreva("A area do triangulo é: ",area)
	}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */