package Atividades_Extras.QuantidadeDePares;

import java.util.Arrays;
import java.util.Scanner;

public class QuantidadeDePares {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares.
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		// Populando o array de números
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i+1) + "º número: ");
			numeros[i] = scan.nextInt();
		}
		
		scan.close();
		
		// Ordenando o array de forma crescente
		Arrays.sort(numeros);
		
		System.out.print("Foram encontrados os seguinte números pares -> ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] % 2 == 0) {
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
