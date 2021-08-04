import java.util.Scanner;

public class copinha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String time1="SANTOS", time2="SPFC", time3="PALMENIRAS", time4="CORINTHIANS";
		int ponto1=0, ponto2=0, ponto3=0, ponto4=0;
		char op= 'X'; //G GANHOU 3, P - PERDEU -0, E - EMPATOU -1
		
		for(int x=1; x<=4; x++) {
			System.out.println("RODADA "+x);
			System.out.print(time1+" G-ganhou, P-perdeu ou E-empatou: ");
			op = leia.next().toUpperCase().charAt(0);
		    if (op == 'G') {
		    	ponto1 += 3;
		    }
		    else if (op== 'E') {
		    	ponto1 += 1;
		    }
		    else if (op=='P') {
		        ponto1 += 0;
		    }
		    else {
		    	System.out.println("Digitou errado, vai ficar com 0!");
		    }
		  System.out.println();
		  System.out.println("TABELA");
		  System.out.printf("Time: %s pontos atuais: %d ponto(s) !!\n",time1,ponto1);
		  System.out.printf("Time: %s pontos atuais: %d ponto(s) !!\n",time2,ponto2);  
		  System.out.printf("Time: %s pontos atuais: %d ponto(s) !!\n",time3,ponto3);  
		}
		
	}

}
