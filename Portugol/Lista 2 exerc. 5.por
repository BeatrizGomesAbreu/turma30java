programa
{
	
	funcao inicio()
	{
		real numero, indice

		escreva("Digite o indice de poluição: ")
		leia (indice)

		se (indice<=0.25){
			escreva("Indice dentro da média ")
			
		}
		senao se (indice==0.3){
			escreva("Atenção empresas do 1° grupo deverão suspender suas atividades! ")
			
		}
		senao se (indice==0.4){
			escreva("Atenção empresas do 1° e 2° grupos deverão suspender suas atividades! ")
		}
		senao se (indice>=0.5){
			escreva("ATENÇÃO todas os grupos devem suspender suas atividades! ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */