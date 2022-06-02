package Atividades_Extras.MultiploDe5;

import java.util.Scanner;

public class MultiploDe5 {

	public static void main(String[] args) {

		// Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os números do usuário
		System.out.print("Digite o primeiro número: ");
		int numero = scan.nextInt();
		
		// Verificando se o número é múltiplo de 5
		if (numero % 5 == 0) {
			System.out.println("O número '" + numero + "' é multiplo de 5");
		}
		else {
			System.out.println("O número '" + numero + "' não é multiplo de 5");
		}
		
		scan.close();


	}

}
