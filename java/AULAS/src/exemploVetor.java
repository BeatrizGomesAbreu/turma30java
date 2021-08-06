import java.util.Scanner;

public class exemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Array[] = vetor //Array [][] = matriz
		String codTime[]= new String[4];
		String nomesTimes[] = {"SANTOS","SPFC","PALMEIRAS","CORINTHIAS"};//quando nao sei as informaçoes
		int pontosTimes[] = {0,0,0,0}; //quando ja sei as informaçoes
		char op;
		String auxCod;
		
		
		for (int x=0; x<nomesTimes.length; x++) {
			if (x==9) {
				codTime[x] = "CPF-0"+(x+1);
			}
			else {
				codTime[x] = "CPF-0"+(x+1);
			}
		
		}
		System.out.println("INICIO DA TABELA");
		System.out.println("COD\tTIME\tPONTOS");
		for(int x=0; x<codTime.length; x++) {
			System.out.printf("%s\t%s\t%s\t%d\n",codTime[x],nomesTimes[x],pontosTimes[x]);
		}
		System.out.println();
		//laço que roda o numero de rodadas
		for(int x=0; x<3; x++) {
			System.out.println("RODADA"+(x+1));
			//laço que roda todos os times
			for(int y=0;codTime.length; y++) {
				System.out.print(nomesTimes[y]+"G-ganhou, P-perdeu, E-empatou");
				op = leia.next().toUpperCase().charAt(0);
				if(op =='G') {
					pontosTimes[y] = pontosTimes[y]+3;
				}
				else if (op == 'E') {
					pontosTimes[y] +=1; //pontoTimes[y] = pontoTimes[y]+1
				}
				else if (op == 'P') {
					pontosTimes[y] +=0; //pontoTimes[y] = pontoTimes[y]+1
				}
				else {
					System.out.println("Você não escolheu o código correto");
				}
				
			}
				
		}
	}

}
