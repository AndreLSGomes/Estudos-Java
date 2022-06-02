package Atividades_Extras.NumeroAntecessor;

import java.util.Scanner;

public class NumeroAntecessor {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um número inteiro e mostre seu antecessor
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		// Recebendo o número do usuário
		System.out.print("Informe um número: ");
		numero = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nO antecessor do número informado (" + numero + ") é: " + (numero-1));

	}

}
