package com.generation.exercicioQuatro;

import java.util.Scanner;

/**
 * Calculadora!
 *
 */

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int conta;
		double primeiroNumero, segundoNumero, resultado;

		System.out.println("----Calculadora----");

		System.out.print(
				"Digite uma das operações a seguir:\n\t1 - Adição\n\t2 - Subtração\n\t3 - Multiplicação\n\t4 - Divisão\n");
		conta = in.nextInt();

		System.out.print("Digite o primeiro numero:");
		primeiroNumero = in.nextDouble();

		System.out.print("Digite o segundo numero:");
		segundoNumero = in.nextDouble();

		System.out.println("----Resultado----");

		switch (conta) {
		case 1:
			resultado = primeiroNumero + segundoNumero;
			System.out.println(resultado);
			break;
		case 2:
			resultado = primeiroNumero - segundoNumero;
			System.out.println(resultado);
			break;
		case 3:
			resultado = primeiroNumero * segundoNumero;
			System.out.println(resultado);
			break;
		case 4:
			resultado = primeiroNumero / segundoNumero;
			System.out.println(resultado);
			break;
		default:
			System.out.print("Opção inválida!");
		}

	}
}