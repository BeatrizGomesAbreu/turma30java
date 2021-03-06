package Programa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import entities.Produto;

public class JoiasCodePOO {

	public static void main(String[] args) {

		// FUNÇÕES
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		// VARIAVEIS
		String auxCod;
		int pos, auxQntd, x, pagamento;
		char op = ' ', op2;
		double contador = 0.0;

		// LISTAS E OBJETO
		Produto notaFiscal = new Produto();
		ArrayList<Produto> itens = new ArrayList<>();
		ArrayList<Produto> carrinho = new ArrayList<>();
		ArrayList<Produto> estoque = new ArrayList<>();

		itens.add(new Produto("G7-01", "PULSEIRA ICY", 70.99, 10));
		itens.add(new Produto("G7-02", "ANEL TOPÁZIO", 50.99, 10));
		itens.add(new Produto("G7-03", "COlAR SAFIRA", 39.99, 10));
		itens.add(new Produto("G7-04", "PULSEIRA LIZ", 59.99, 10));
		itens.add(new Produto("G7-05", "ANEL CRISTAL", 65.59, 10));
		itens.add(new Produto("G7-06", "BRINCO JASPE", 85.99, 10));
		itens.add(new Produto("G7-07", "PINGENTE LUA", 45.59, 10));
		itens.add(new Produto("G7-08", "COLAR AMÉLIA", 40.59, 10));
		itens.add(new Produto("G7-09", "ANEL CRISTAL", 99.59, 10));
		itens.add(new Produto("G7-10", "BRINCO ÁGATA", 59.79, 10));

		int auxQntd2[] = new int[itens.size()];

		// TABELA RELAÇÃO PRODUTOS + NOME/SLOGAN
		linha();
		System.out.print("\n\t\t    \n");
		nome();
		for (Produto lista : itens) {
			System.out.print("\n" + lista.getCodigo() + "\t" + lista.getNome() + "\t  " + df.format(lista.getValor())
					+ "\t       " + lista.getEstoque());
		}

		// VALIDAÇÃO DE COMPRA
		linha();
		System.out.print("DESEJA FAZER COMPRAS? ");
		System.out.print("\n(DIGITE 'S' PARA SIM E 'N' PARA NÃO): ");
		op = leia.next().toUpperCase().charAt(0);
		linha();

		if (op == 'S') {

			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS
			do {
				leia.nextLine();
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.nextLine().toUpperCase();

				// LAÇO DA VALIDAÇÃO DO CÓDIGO DO PRODUTO
				for (x = 0; x < itens.size(); x++) {

					// LAÇO CONDICIONAL DE VALIDAÇÃO DO CÓDIGO INSERIDO
					if (itens.get(x).getCodigo().equals(auxCod)) {
						pos = x;
						System.out.print("\nCÓDIGO\tPRODUTO \tPREÇO \tESTOQUE");
						System.out.print("\n" + itens.get(pos).getCodigo() + "\t" + itens.get(pos).getNome() + "\t"
								+ itens.get(pos).getValor() + "\t  " + itens.get(pos).getEstoque() + "\n");
						System.out.print("\nINFORME A QUANTIDADE QUE DESEJA: ");
						auxQntd = leia.nextInt();

						// LAÇO CONDICIONAL DE VALIDAÇÃO DA QUANTIDADE NO ESTOQUE
						if (auxQntd > itens.get(pos).getEstoque()) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.println("O ESTOQUE É DE: " + itens.get(pos).getEstoque() + "\n");
							linha();

						} else if (auxQntd < 0) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.print("O ESTOQUE É DE: " + itens.get(pos).getEstoque() + "\n");
							linha();

						} else if (auxQntd == 0) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.print("O ESTOQUE É DE: " + itens.get(pos).getEstoque() + "\n");
							linha();

						} else {
							carrinho.add(new Produto(itens.get(pos).getCodigo(), itens.get(pos).getNome(),
									itens.get(pos).getValor(), auxQntd));
							itens.get(pos).retirarEstoque(auxQntd);
							estoque.add(new Produto(0));
							estoque.get(pos).adicionarEstoque(auxQntd);
							leia.nextLine();

							auxQntd2[pos] = auxQntd;

							// EXIBIÇÃO DE CARRINHO
							linha();
							System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
							for (Produto lista2 : carrinho) {
								System.out.print("\n" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t  "
										+ lista2.getValor() + " \t" + lista2.getEstoque());
							}
							linha();
						}
					}
				}

				// RELAÇÃO DE PRODUTOS NOVAMENTE ANTES DE FINALIZAR A COMPRA
				System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
				linha();
				System.out.print("CÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
				for (Produto lista : itens) {
					System.out.print("\n" + lista.getCodigo() + "\t" + lista.getNome() + "\t  "
							+ df.format(lista.getValor()) + "\t       " + lista.getEstoque());
				}

				// CONDICIONAL QUE SAI DO LAÇO DO..WHILE
				System.out.println("\n\nDESEJA CONTINUAR COMPRANDO?");
				System.out.print("DIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
				op2 = leia.next().toUpperCase().charAt(0);
				linha();

			} while (op2 == 'S');

			// EXIBIÇÃO DO CARRINHO FINAL
			if (contador != 0) {
				System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
				for (Produto lista2 : carrinho) {
					System.out.print("\n" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t  "
							+ df.format(lista2.getValor()) + " \t" + lista2.getEstoque());
				}
			}
			// FINALIZAÇÃO DAS COMPRAS
			linha();
			for (int i = 0; i < carrinho.size(); i++) {
				pos = i;
				contador += (carrinho.get(pos).getValor() * carrinho.get(pos).getEstoque());
			}
			System.out.print("\t   VALOR TOTAL DA COMPRA: R$" + df.format(contador));
			linha();
			System.out.print("\t\tFORMA DE PAGAMENTOS:\n\n");
			System.out.print(" OPÇÃO 1 - A VISTA COM 10% DESCONTO\n");
			System.out.print(" OPÇÃO 2 - NO CARTÃO COM ACRESCIMO DE 10%\n");
			System.out.print(" OPÇÃO 3 - EM 2X COM 15% TOTAL DE ACRESCIMENTO\n");
			linha();

			// FUNÇÃO FORMA DE PAGAMENTO
			do {
				System.out.print("INSIRA AQUI SUA FORMA DE PAGAMENTO: ");
				pagamento = leia.nextInt();

				switch (pagamento) {

				case 1:
					notaFiscal.pagamentos(pagamento, contador);
					carrinho.clear();
					break;

				case 2:
					notaFiscal.pagamentos(pagamento, contador);
					carrinho.clear();
					break;

				case 3:
					notaFiscal.pagamentos(pagamento, contador);
					carrinho.clear();
					break;

				default:
					System.out.printf("OPÇÃO INVÁLIDA, TENTE NOVAMENTE.\n");
					break;

				}

			} while (pagamento > 3);

			// RELAÇÃO DE PRODUTOS COM OS ESTOQUES RENOVADOS
			linha();
			System.out.print("\n\t\t    \n");
			nome();
			for (int i = 0; i < itens.size(); i++) {
				pos = i;
				itens.get(pos).adicionarEstoque(auxQntd2[pos]);
				System.out.print("\n" + itens.get(pos).getCodigo() + "\t" + itens.get(pos).getNome() + "\t  "
						+ df.format(itens.get(pos).getValor()) + "\t       " + itens.get(pos).getEstoque());
			}
			System.out.println();

			// CARRINHO DE COMPRAS FINAL E VAZIO
			linha();
			System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
			System.out.println("CÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
			System.out.println("CARRINHO VAZIO!");
			linha();

		}
	}

	// FUNÇÕES EXTRAS
	public static void nome() {
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n"); // GAMBIARRA!!!!!!!!!!!!!!
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n"); // NÃO MEXER!!!!!!!!!!!!!!!!
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.print("CÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
	}

	public static void nota() {
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n");
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n");
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
		linha();
	}

	public static void linha() {
		System.out.println("\n══════════════════════════════════════════════════════════");
	}

}
