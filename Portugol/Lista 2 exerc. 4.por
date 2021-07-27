programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
//número é par ou ímpar, e se é positivo ou negativo.
		
		
	
		inteiro numero
		
		
		escreva("Digite um número inteiro: ")
		leia (numero)

		se (numero<0){
			escreva("numero negativo")
		se (numero>0){
			escreva("numero positivo")
		}
		senao se (numero == 0){
			escreva("Zero é neutro")
			
		}
		senao se ((numero%2)==0){
			escreva("Número é par ")
			
		}
		senao se ((numero%2) == 1){
			escreva("Número é impar")
		}
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */