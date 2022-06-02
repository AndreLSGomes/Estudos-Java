package Atividades_Extras.LinhaDoTempo;

import java.util.Scanner;

public class LinhaDoTempo {

	public static void main(String[] args) {

		/*
		  Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo,
		  mostrando cada ano de vida da pessoa e quantos anos ela tinha em cada ano até o ano atual. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ano em que nasceu (yyyy): ");
		
		int ano = scan.nextInt();
		int j = 0;
		
		scan.close();
		
		System.out.println("\n*** Sua linha do tempo ***\n");
		
		for (int i = ano; i <= 2022; i++) {
			System.out.println("Em " + i + " você tinha " + (j) + " anos.");
			j++;
		}

	}

}
