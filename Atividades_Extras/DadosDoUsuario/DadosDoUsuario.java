package Atividades_Extras.DadosDoUsuario;

import java.util.Scanner;

public class DadosDoUsuario {

	public static void main(String[] args) {

		// Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostra os dados digitados em uma única linha.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Informe seu endereço completo: ");
		String endereco = scan.nextLine();
		
		System.out.print("Qual o seu ddd? ");
		int ddd = scan.nextInt();
		
		System.out.print("E o seu telefone?: ");
		String telefone = scan.next();
		
		scan.close();
		
		// Escrevendo em uma única linha
		System.out.println("\nUsuário: " + nome + " | Endereço: " + endereco + " | Telefone: (" + ddd + ") " + telefone);

	}

}
