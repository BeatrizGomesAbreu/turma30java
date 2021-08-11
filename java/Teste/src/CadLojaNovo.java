import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {

	public static void main(String[] args) {
		
		//exemplo time
		Scanner leia = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();
		int x=0;
		String auxNome;
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTOS");
		
		System.out.println("Tamanho da lista: "+cadastro.size());
		
		cadastro.add(1,"GUARANI");
		
		System.out.println(cadastro.get(4));
		
		for(String time: cadastro) {
			System.out.println(x+" - "+time);
			x++;
		}
		System.out.println("Digite o time que deseja apagar: ");
		auxNome = leia.next().toUpperCase();
		x=cadastro.indexOf(auxNome);
		System.out.println("Você escolheu o time: "+cadastro.get(x)+" este time foi retirado da lista!");
		cadastro.remove(x);
		
		System.out.println("Nova lista: ");
		x=0;
		
		for(String time: cadastro) {
			System.out.println(x+" - "+time);
			x++;
		}
		
		/*for(String time: cadastro) {
			System.out.println(time);
		}
		
		System.out.println("Tamanho da lista atualizado: "+cadastro.size());
		*/
	}

}
