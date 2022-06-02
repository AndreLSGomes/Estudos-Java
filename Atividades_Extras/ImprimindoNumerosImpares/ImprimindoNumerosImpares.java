package Atividades_Extras.ImprimindoNumerosImpares;

import java.util.Scanner;

public class ImprimindoNumerosImpares {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre 1 e o número informado pelo usuário.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		scan.close();
		
		System.out.print("Os números ímpares menores do que " + numero + " são -> ");
		for (int i = 1; i < numero; i++) {
			
			if (i % 2 != 0) {
				System.out.print(i);

				if (i < numero-1) {
					System.out.print(", ");
				} 
				else {
					System.out.print(".");
				}
			}
		}

	}
}
