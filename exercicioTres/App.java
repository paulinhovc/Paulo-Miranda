package com.generation.exercicioTres;

import java.util.Scanner;

/**
 * Pede que digite um número, se positivo armazena em A se negativo em B, e apresenta o resultado final.
 *
 */
public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num, A = 0,B = 0;
		boolean correto = false;

		do {
			System.out.println("Digite a quantidade de números que deseja verificar: ");
			num = sc.nextInt();
			
			
			if (num != 0) {
				correto = true;

			} else {
				System.out.println("Não é possível verificar nenhum número, por favor ");
			}
		} while (correto == false);
		
		
		int[] vect = new int[num];
		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + " numero: ");
			vect[i] = sc.nextInt();

		}

		for (int i = 0; i < vect.length; i++) {

			
				if (vect[i] >= 0) {
					A = vect[i];
					}
				else {
					B = vect[i];
				}
			
				

		}
		
		
		System.out.println("O Número positivo digitado por último é o "+A+" e o negativo foi o "+B);

		sc.close();

	}
}