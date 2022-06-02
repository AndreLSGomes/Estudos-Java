package Atividades_Extras.UmaPalavraEmCadaLinha;

import java.util.Scanner;

public class UmaPalavraEmCadaLinha {

	public static void main(String[] args) {

		// Crie um algoritmo que escreve o seu nome completo, colocando uma palavra em cada linha.
		
		System.out.print("Digite seu nome completo: ");
		Scanner scan = new Scanner(System.in);
		String nome = new String();
		
		// Recebendo o texto do usuário
		nome = scan.nextLine();
		
		// Escrevendo uma palavra por linha
		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) == ' ') {
				System.out.println();
			}
			else {
				System.out.print(nome.charAt(i));
			}
		}
		
		scan.close();

	}

}