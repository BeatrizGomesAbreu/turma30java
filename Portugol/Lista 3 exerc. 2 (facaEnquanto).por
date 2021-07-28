programa
{
	
	funcao inicio()
	{
		inteiro numero =0
		inteiro totalNumeros =0
		inteiro contadorNumero =0

		escreva("Digite um numero positivo acima de 1: ")
		leia(numero)
		faca{
			contadorNumero++
			totalNumeros = totalNumeros + contadorNumero
			escreva(contadorNumero)
			se (contadorNumero==1){
				escreva(contadorNumero)
			}
			senao{
				escreva(" + ",contadorNumero,"\n")
			}
			
		}enquanto(contadorNumero < numero)
			
		escreva(" = ",totalNumeros)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */