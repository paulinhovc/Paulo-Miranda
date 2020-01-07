package com.generation.exercicioDois;

import java.util.Scanner;

/**
 * Pede uma quantidade para comparar se os números digitados são positivos ou negativos!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int tam;
		boolean correto = false;

		do {
			System.out.println("Digite a quantidade de números que deseja verificar: ");
			tam = sc.nextInt();
			
			
			if (tam != 0) {
				correto = true;

			} else {
				System.out.println("Não é possível verificar nenhum número, por favor ");
			}
		} while (correto == false);
		
		
		int[] vect = new int[tam];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + " numero: ");
			vect[i] = sc.nextInt();

		}

		for (int i = 0; i < vect.length; i++) {

			
				if (vect[i] >= 0) {
					System.out.println("Número "+vect[i]+" é Positivo! ");
					
					}
				else {
					System.out.println("Número "+vect[i]+" é Negativo ");
					
				}
			

		}
		

		sc.close();

	}
}