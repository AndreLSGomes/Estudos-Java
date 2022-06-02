package Atividades_Extras.PositivoOuNegativo;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = scan.nextDouble();
		
		scan.close();
		
		// Escrevendo em uma única linha
		System.out.print("\nO número " + numero + " é ");
		if (numero >= 0) {
			System.out.println("positivo!");
		}
		else {
			System.out.println("negativo!");
		}

	}

}
