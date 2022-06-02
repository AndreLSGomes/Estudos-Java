package Atividades_Extras.Clima;

import java.util.Scanner;

public class Clima {

	public static void main(String[] args) {

		/*
		 Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o tipo do
		 clima, de acordo com as seguintes condições: se a temperatura estiver até 18 graus, o clima é frio; se a
		 temperatura estiver entre 19 e 23 graus, o clima é agradável; se a temperatura estiver entre 24 e 35 graus, o
		 clima é quente; se a temperatura estiver acima de 35 graus, o clima é muito quente. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os números do usuário
		System.out.print("Digite a temperatura em graus Celsius: ");
		int temperatura = scan.nextInt();
		
		// Verificando o clima
		if (temperatura <= 18) {
			System.out.println("Clima frio!");
		}
		else if (temperatura >= 19 && temperatura <= 23) {
			System.out.println("Clima agradável!");
		}
		else if (temperatura >= 24 && temperatura <= 35) {
			System.out.println("Clima quente!");
		}
		else {
				System.out.println("Muito quente!");
		}
		
		scan.close();

	}

}
