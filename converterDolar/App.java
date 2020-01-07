package com.generation.converterDolar;

import java.util.Scanner;

/**
 * Converte valor em Real para Dolar
 *
 */
public class App {
	public static void main(String[] args) {
		float cotacaodolar, dolar, convertido;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a cotação do Dolar: ");
		cotacaodolar = ler.nextFloat();

		System.out.println("Digite o Valor em Dolar: ");
		dolar = ler.nextFloat();

		convertido = (cotacaodolar * dolar);
		System.out.printf("Você precisará de " + convertido +" reais !");
		
		}
}

