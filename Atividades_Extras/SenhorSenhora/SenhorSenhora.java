package Atividades_Extras.SenhorSenhora;

import java.util.Scanner;

public class SenhorSenhora {

	public static void main(String[] args) {

		/*
		 Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para	feminino).
		 Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”, se for feminino, mostra a mensagem “Seja bem-vinda, Senhora!”.
		*/
		
		System.out.print("Informe seu sexo - (M) Masculino | (F) Feminino: ");
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o texto do usuário
		char sexo = scan.next().charAt(0);
		
		scan.close();
		
		// Escrevendo uma palavra por linha
		if (sexo == 'M' || sexo == 'm') {
			System.out.println("Seja bem-vindo, Senhor!");
		}
		else {
			System.out.println("Seja bem-vinda, Senhora!");
		}

	}

}
