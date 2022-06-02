package Atividades_Extras.DiaDaSemana;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {

		// Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe o nome do dia correspondente.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o número
		System.out.print("Informe um número entre '1' e '7': ");
		int numero = scan.nextInt();
		
		scan.close();
		
		// Verificando o dia da semana
		switch(numero) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			default:
				System.out.println("Sábado-feira");
		}

	}

}
