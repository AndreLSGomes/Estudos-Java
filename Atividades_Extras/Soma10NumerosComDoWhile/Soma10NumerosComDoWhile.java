package Atividades_Extras.Soma10NumerosComDoWhile;

import java.util.Scanner;

public class Soma10NumerosComDoWhile {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de repetição Enquanto (Do While).
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int soma = 0;
		
		// Recebendo os números do usuário
		do {

			System.out.print("Digite o " + (i+1) + "º número: ");
			soma = soma + scan.nextInt();
			i++;
			
		} while (i < 10);
		
		System.out.print("A soma de todos os números informados = " + soma);
		
		scan.close();

	}

}
