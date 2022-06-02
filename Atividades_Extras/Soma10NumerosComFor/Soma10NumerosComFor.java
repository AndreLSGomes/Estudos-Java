package Atividades_Extras.Soma10NumerosComFor;

import java.util.Scanner;

public class Soma10NumerosComFor {

	public static void main(String[] args) {
	
		// Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de repetição Enquanto (FOR).
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		
		// Recebendo os números do usuário
		for (int i = 0; i < 10; i++) {
		
			System.out.print("Digite o " + i + "º número: ");
			soma = soma + scan.nextInt();
		}
		
		System.out.print("A soma de todos os números informados = " + soma);
			
			scan.close();
	
	}

}
