programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1
		real x2
		real y1
		real y2
		real d
		real p1
		real p2

		escreva("Qual o valor de X1: ")
		leia (x1)
		escreva("Qual o valor de X2: ")
		leia (x2)
		escreva("Qual o valor de y1: ")
		leia (y1)
		escreva("Qual o valor de y2: ")
		leia (y2)

		p1 = Matematica.potencia((x1-x2), 2)
		p2 = Matematica.potencia((y1-y2), 2)
		d = Matematica.raiz((p1+p2), 2)

		escreva("A distancia é:"+d)
		
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */