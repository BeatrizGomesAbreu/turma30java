programa
{
	
	funcao inicio()
	{
	//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos

	inteiro idade

	escreva("Digite sua idade: ")
	leia (idade)

	se (idade<5){
		escreva("Você não atende as classificações desejadas")
		
	}
	senao se (idade<=7){
		escreva("Você pertence ao infantil A")
	}
	 senao se (idade<=11){
		escreva("Você pertence ao infantil B")
		
	}
	senao se (idade<=13){
		escreva("Você pertence ao juvenil A")
	}
	senao se (idade<=17){
		escreva("Você pertence ao juvenil B")
		
	}
	senao {
		escreva("Você pertence a categoria adulto")
	}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */