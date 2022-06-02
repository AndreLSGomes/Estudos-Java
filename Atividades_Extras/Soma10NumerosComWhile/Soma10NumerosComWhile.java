package Atividades_Extras.Soma10NumerosComWhile;

import java.util.Scanner;

public class Soma10NumerosComWhile {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de repetição Enquanto (While).
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int soma = 0;
		
		// Recebendo os números do usuário
		while (i < 10) {

			System.out.print("Digite o " + (i+1) + "º número: ");
			soma = soma + scan.nextInt();
			i++;
			
		}
		
		System.out.print("A soma de todos os números informados = " + soma);
		
		scan.close();

	}

}
