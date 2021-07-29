programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	inteiro dado[10], contador=0, maiorValor =0, x
	real media

	para (x = 0; x < 10; x++){
	dado[x] = u.sorteia(1,6)
	escreva("\n",dado[x])
	contador = contador + dado[x]

	se(dado[x] > maiorValor){
	  maiorValor = dado[x]
	 
	}
	  
	}
	media = contador / 10
	escreva("\nO maior valor: ",maiorValor)
	escreva("\nA média dos lançamentos: ",mat.arredondar(media,1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 8, 9, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */