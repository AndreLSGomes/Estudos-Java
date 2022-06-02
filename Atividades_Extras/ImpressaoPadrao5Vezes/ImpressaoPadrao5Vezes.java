package Atividades_Extras.ImpressaoPadrao5Vezes;

import java.util.Scanner;

public class ImpressaoPadrao5Vezes {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um número n do usuário e imprima o padrão abaixo na tela. Ex: para n = 5
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = scan.nextInt();
		
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scan.close();

	}
}
