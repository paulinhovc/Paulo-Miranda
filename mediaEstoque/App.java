package com.generation.mediaEstoque;

import java.util.Scanner;

/**
 * Calcula a média do estoque
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float estoqueMin, estoqueMax, media;
		
		System.out.println("Digite o mínimo do estoque: ");
		estoqueMin = ler.nextInt();

		System.out.println("Digite o máximo do estoque: ");
		estoqueMax = ler.nextInt();

		media = (estoqueMin + estoqueMax) / 2;

		System.out.printf("O estoque médio é de " + media + " caixas !");

		
	}
}
