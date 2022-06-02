package Atividades_Extras.SomaAteUsuarioDigitarNumeroNegativo;

import java.util.Scanner;

public class SomaAteUsuarioDigitarNumeroNegativo {

	public static void main(String[] args) {
		
		/*
		  Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
		  Encerre a execução quando um número negativo for digitado. 
		*/
		
		System.out.println("PARA ENCERRAR ESTA OPERAÇÃO INFORME UM NÚMERO NEGATIVO");

		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		int soma = 0;
		
		// Recebendo os números do usuário
		
		do {
			
			System.out.print("Digite o " + (x+1) + "º número: ");
			x = scan.nextInt();
			
			// Efetuando a soma
			if ( x > 0) {
				soma = soma + x;
			}

		} while (x > 0);
		
		System.out.println("A soma dos números informados = " + soma + ".");
		
		scan.close();

	}

}
