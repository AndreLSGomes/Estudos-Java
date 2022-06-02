package Atividades_Extras.DivisaoXdivididoY;

import java.util.Scanner;

public class DivisaoXdivididoY {

	public static void main(String[] args) {

		// Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da divisão de x por y.
		
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		
		// Recebendo o número do usuário
		System.out.print("Informe o primeiro número: ");
		numero1 = scan.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = scan.nextInt();
		
		scan.close();
		
		System.out.println("\nA dvisão dos números informados (" + numero1 + " e " + numero2 + ") é: " + (numero1 / numero2));

	}

}
