programa
{
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
            a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
               das matrizes N1 e N2;
            b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
              posição das matrizes N1 e N2.
		 */
	      const inteiro L = 2
	      const inteiro C = 2
		 inteiro matrizN1[L][C], l, matrizM1[L][C]
		 inteiro matrizN2 [L][C], c, matrizM2 [L][C]

		 para(l = 0; l<L; l++){
		 para (c = 0; c<C; c++){
		 		escreva("Digite o valor da matrizN1 [",l,"][",c,"] :\n")
		 		leia (matrizN1[L][C])
		 		matrizM1 [L][C] = matrizN1[L][C] + matrizN2 [L][C]
		 	}
		 }
		 para(l = 0; l<L; l++){
		 para(c = 0; c<C; c++){
		 		escreva("Digite o valor da matrizN2 [",l,"][",c,"] :\n")
		 		leia (matrizN2[L][C])
		 		matrizM2 [L][C] = matrizN1[L][C] - matrizN2 [L][C]
		 	}
		 }
		 escreva("MatrizM1\n")
		 para(l = 0; l<L; l++){
		 para(c = 0; c<C; c++){
		      escreva(matrizM1[l][c])		 
		 }
		 }
		 escreva("MatrizM2\n")
		 para(l = 0; l<L; l++){
		 para(l = 0; c<C; c++){
		 	escreva(matrizM2[l][c]
		 }
		 }
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */