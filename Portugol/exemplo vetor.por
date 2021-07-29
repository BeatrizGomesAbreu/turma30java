programa
{
	
	funcao inicio()
	{
		cadeia alunes [4]
		inteiro media [4]
	para (inteiro x = 0; x < 4; x++){
		escreva("Qual seu nome? ")
		leia (alunes[x])
		escreva ("Qual sua média? ")
		leia (media[x])
		limpa()
	}
	para (inteiro x=0; x < 4; x++){
	escreva (alunes[x], ", sua média foi de ", media[x], "\n")
	se (media[x] <= 5){
		escreva(alunes[x],",sua media foi de: ",media[x]," ainda não, continue estudando!\n")	
		
	}
	senao{
	escreva(alunes[x],",sua media foi de: ",media[x]," parabens, continue assim!\n")	
	}
	}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */