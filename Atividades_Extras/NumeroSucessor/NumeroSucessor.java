package Atividades_Extras.NumeroSucessor;

import java.util.Scanner;

public class NumeroSucessor {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um número inteiro e mostre seu sucessor
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		// Recebendo o número do usuário
		System.out.print("Informe um número: ");
		numero = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nO sucessor do número informado (" + numero + ") é: " + (numero+1));

	}

}
