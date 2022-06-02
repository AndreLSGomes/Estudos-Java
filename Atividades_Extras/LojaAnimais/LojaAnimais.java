package Atividades_Extras.LojaAnimais;

import java.util.Scanner;

public class LojaAnimais {

	public static void main(String[] args) {

		/*
		 Uma loja de animais vende gatos e cachorros. Escreva um algoritmo que leia a quantidade de animais da loja
		 e, para cada animal, leia a informação do tipo do animal (se é gato ou cachorro). Ao final, exiba a
		 quantidade de animais que são gatos e a quantidade de animais que são cachorros existentes na loja.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade total de animais na loja: ");
		int totalAnimais = scan.nextInt();
		
		int totalG = 0;
		int totalC = 0;
		char tipoAnimal;
		
		for (int i = 0; i < totalAnimais; i++) {
			
			System.out.print("Informe o tipo de animal - (G) Gato | (C) Cachorro: ");
			tipoAnimal = scan.next().charAt(0);
			
			if (tipoAnimal ==  'c' || tipoAnimal ==  'C') {
				totalC++;
			}
			else if (tipoAnimal ==  'g' || tipoAnimal ==  'G') {
				totalG++;
			}
			else {
				System.out.println("Este tipo de animal não existe na loja!");
			}
		}
		
		scan.close();
		
		System.out.println("\n\nA loja possui " + totalC + " cachorro(s) e " + totalG + " gato(s).");

	}
}
