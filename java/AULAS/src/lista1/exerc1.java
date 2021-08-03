package lista1;

import java.util.Scanner;

public class exerc1 {
	
	public static void main (String [] args)
	{
		int anos;
		int meses;
		int dias;
		int total;

		Scanner leia = new Scanner (System.in);

		System.out.println("DIGITE SUA IDADE EM ANOS: ");
		anos = leia.nextInt();
		anos = anos * 365;

		System.out.println("DIGITE SUA IDADE EM MESES: ");
		meses = leia.nextInt();
		meses = meses * 30;

		System.out.println("DIGITE SUA IDADE EM DIAS: ");
		dias = leia.nextInt();

		total = dias + meses + anos;

		System.out.println("SUA IDADE EM DIAS É: " + total);

}}

