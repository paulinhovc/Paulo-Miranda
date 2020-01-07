package com.generation.exercicioCinco;

import java.util.Scanner;

/**
 * Lê dois números inteiros e apresente as opções para usuário escolher o que
 * deseja realizar:!
 *
 */
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double resultado,primeiroNumero, segundoNumero,  med = 0;
		int opcoes;
		
		System.out.println("Escreva o primeiro numero:");
		primeiroNumero = in.nextDouble();

		System.out.println("Escreva o segundo numero:");
		segundoNumero = in.nextDouble();

		
		System.out.print(
				"Digite uma das operações a seguir:\n\t1 - Verificar se um dos números lidos é ou não múltiplo do outro \n\t2 - Verificar se os dois números lidos são pares \n\t3 - Verificar se a média dos dois números é maior ou igual a 7. \n\t4 - Sair\n");
		opcoes = in.nextInt();

		switch (opcoes) {
		case 1:
			resultado = primeiroNumero % segundoNumero;
			if(resultado == 0) {
				System.out.println("Sim são multiplos");
				
			} else if(resultado != 0) {
				System.out.println("Não são multiplos");
			}
			
			break;

		case 2:
			if (primeiroNumero % 2 == 0.0 && segundoNumero % 2 == 0.0) {
				System.out.println("Os dois numeros são pares");
			} else if (primeiroNumero % 2 != 0.0 || segundoNumero % 2 != 0.0) {
				System.out.println("Não");
			}
			break;
		case 3:
					med = (primeiroNumero + segundoNumero)/2;
			if (med > 7) {
				System.out.println("A média  (" + med + ") é maior que 7");
			} else if (med == 7) {
				System.out.println("A média  (" + med + ") é igual a 7");
			} else if (med < 7) {
				System.out.println("A média  (" + med + " não é nem maior nem igual a 7");
			}
			
			break;
		case 4:
			if (opcoes == 4) {
				System.out.println("O programa foi Finalizado com sucesso!!!");
				System.exit(0);
			}
			break;
		}
	}
}
