programa
{
	
	funcao inicio()
	{
		real valor =0.0, soma =0.0, media
		inteiro contador = 0

	     escreva("Digite um valor: ")
	     leia (valor)
		
		enquanto (valor>= 0){
		soma = soma + valor
		contador = contador + 1
		escreva("Digite um valor: ")	
		leia (valor)
		
		}

		media = soma/contador
		
		escreva("Valor total: ",soma)
		escreva("\nA media dos valores: ",media)
		escreva("\nTotal de valores lidos: ",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */