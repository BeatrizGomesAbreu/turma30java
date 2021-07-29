programa
{
	
	funcao inicio()
	{
		const inteiro LINHA =3, COLUNA =3
		inteiro matriz[LINHA][COLUNA], somaDiagonal, somaTotal = 0, l, c

		para(l =0; l<3; l++){
		para(c =0; c<3; c++){
			escreva("Digite os valores: ")
			leia(matriz[l][c])

			somaTotal += matriz[l][c]
		}
		}
		escreva("A soma dos valores é: ",somaTotal)
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]
		escreva("\nA soma da diagonal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */