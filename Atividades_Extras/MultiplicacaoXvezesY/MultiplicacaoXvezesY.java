package Atividades_Extras.MultiplicacaoXvezesY;

import java.util.Scanner;

public class MultiplicacaoXvezesY {

	public static void main(String[] args) {

		// Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da multiplicação de x por y.
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		
		// Recebendo o número do usuário
		System.out.print("Informe o primeiro número: ");
		numero1 = scan.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nA multiplicação dos números informados (" + numero1 + " e " + numero2 + ") é: " + (numero1 * numero2));

	}

}
