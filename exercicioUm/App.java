package com.generation.exercicioUm;

import java.util.Scanner;

/**
 * Compara os números do array e coloca em ordem decrescente!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int tam;
		System.out.println("Digite a quantidade de números que deseja comparar: ");
		tam = sc.nextInt();
		
		int[] vect = new int[tam];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o " + (i + 1) + " numero: ");
			vect[i] = sc.nextInt();

		}

		for (int i = 1; i < vect.length; i++) {

			for (int j = 0; j < vect.length; j++) {
				if (vect[i] > vect[j]) {

					int aux = vect[i];
					vect[i] = vect[j];
					vect[j] = aux;
				}
			}

		}
		System.out.println("Os numero na ordem descrescente são");
		for (int x : vect) {
			System.out.println(x);
		}

		sc.close();

	}
}