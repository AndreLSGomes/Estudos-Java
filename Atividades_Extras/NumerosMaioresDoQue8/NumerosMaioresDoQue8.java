package Atividades_Extras.NumerosMaioresDoQue8;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosMaioresDoQue8 {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[20];
		
		// Populando o array de números
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i+1) + " número: ");
			numeros[i] = scan.nextInt();
		}
		
		scan.close();
		
		// Ordenando o array de forma crescente
		Arrays.sort(numeros);
		
		System.out.print("Foram encontrados os seguinte números menores do que 8-> ");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 8) {
				System.out.print(numeros[i]);

				if (i < numeros.length-1) {
					System.out.print(", ");
				}
				else {
					System.out.print(".");
				}
			}
			
		}

	}
}
