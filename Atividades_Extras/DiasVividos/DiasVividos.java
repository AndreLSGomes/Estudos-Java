package Atividades_Extras.DiasVividos;

import java.util.Scanner;

public class DiasVividos {

	public static void main(String[] args) {

		// Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		int anos = scan.nextInt();
		scan.close();
		
		System.out.println("Você está vivo a " + (anos * 365) + " dias.");
	}

}
