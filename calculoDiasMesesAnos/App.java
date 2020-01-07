package com.generation.calculoDiasMesesAnos;

import java.util.Scanner;

/**
 * Calculo de quanto tempo você viveu!
 *
 */
public class App {
	public static void main(String[] args) {
		String nome;
		int dia, mes, ano, total;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu Nome: ");
		nome = ler.nextLine();

		System.out.println("Quantos anos você tem: ");
		ano = ler.nextInt();

		System.out.println("Digite os meses ");
		mes = ler.nextInt();

		System.out.println("Digite os dias: ");
		dia = ler.nextInt();

		total = (ano*365)+(mes*30)+(dia);
		
		
		System.out.printf(nome + ", você tem vivido " + total +" dias !");
		
		}
}