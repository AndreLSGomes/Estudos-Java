package Atividades_Extras.Media15NumerosComFor;

import java.util.Scanner;

public class Media15NumreosComFor {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a média dos 15 números. Utilize o comando de repetição Para (For).
		
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		
		// Recebendo os números do usuário
		for (int i = 0; i < 15; i++) {
		
			System.out.print("Digite o " + i + "º número: ");
			soma = soma + scan.nextDouble();
		}
		
		System.out.print("A média de todos os números informados = " + (soma / 10));
			
			scan.close();

	}

}
