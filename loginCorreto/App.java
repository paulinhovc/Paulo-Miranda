package com.generation.loginCorreto;

import java.util.Scanner;

/**
 * Solicita usuário e senha e confere se esta correto!
 *
 */
public class App {
	public static void main(String[] args) {
		String usuarioG, senhaG, usuarioL, senhaL;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Crie um usuário: ");
		usuarioG = leitor.nextLine();

		System.out.println("Crie uma senha: ");
		senhaG = leitor.nextLine();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		boolean correto = false;

		do {
			System.out.println("Digite o usuário: ");
			usuarioL = leitor.nextLine();

			System.out.println("Digite a senha: ");
			senhaL = leitor.nextLine();

			if (usuarioL.equals(usuarioG) && senhaL.equals(senhaG)) {
				correto = true;

			} else {
				System.out.println("Usuário ou senha incorretos!");
			}
		} while (correto == false);

		System.out.println("Login feito com sucesso!!");
	}
}
