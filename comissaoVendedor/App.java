package com.generation.comissaoVendedor;

import java.util.Scanner;

/**
 * Comissão do Vendedor 5%!
 *
 */
public class App {
	public static void main(String[] args) {
		String vendedor;
		float codigo, preco, vendido;
		double comissao;
		Scanner ler = new Scanner(System.in);

		System.out.println("Vendedor: ");
		vendedor = ler.nextLine();

		System.out.println("ID da peça: ");
		codigo = ler.nextFloat();

		System.out.println("Valor unitário da peça: ");
		preco = ler.nextFloat();

		System.out.println("Quantidade vendida: ");
		vendido = ler.nextFloat();

	
		comissao = ((vendido * preco)*0.05);
		System.out.printf("Parabéns pela venda, você receberá R$ " + comissao +" de comissão !");
		
		}
}