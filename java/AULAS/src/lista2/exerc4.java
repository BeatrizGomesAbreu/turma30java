package lista2;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);	
	double numero;
     System.out.print("Digite um numero: ");
	 numero = leia.nextDouble();
	  
	 if(numero<0) {
		 System.out.println("Numero negativo, tente um numero positivo");
	 }
	 else if (numero==0) {
		 System.out.println("Zero � neutro");
	 }
	 else if ((numero%2)==0) {
		System.out.println("O numero � par ");
		System.out.printf("A raiz quadrada de %.2f � %.2f ",numero,(Math.sqrt(numero)));
	}else if ((numero%2)==1){
		System.out.println("O numero � impar");
		System.out.printf("O numero %.2f ao quadrado � %.2f ",numero,Math.pow(numero,2));
	}
		
	}

}
