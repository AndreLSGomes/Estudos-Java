package Atividades_Extras.ImpressaoDigitacaoUsuario;

import java.util.Scanner;

public class ImpressaoDigitacaoUsuario {

	public static void main(String[] args) {

		// Crie um algoritmo que leia uma frase do usuário e escreva na tela exatamente o que o usuário digitar.
		
		System.out.print("Digite uma frase: ");
		Scanner scan = new Scanner(System.in);
		String frase = new String();
		
		// Recebendo o texto do usuário
		frase = scan.nextLine();
		
		scan.close();
		
		// Escrevendo uma palavra por linha
		System.out.println("\n" + frase);

	}

}
