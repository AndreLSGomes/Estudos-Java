package Atividades_Extras.Imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {

		/*
		 Escreva um algoritmo que calcule o índice de massa corporal (IMC) de várias pessoas. O IMC é calculado pela
		 fórmula: IMC = peso / (altura *altura). Seu programa deve encerrar apenas se um valor menor ou igual a 0 for
		 digitado para peso ou para altura.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		double altura = 999;
		double peso = 999;
		
		while (altura != 0 || peso != 0) {
			
			System.out.print("Informe sua altura: ");
			altura = scan.nextDouble();
			
			System.out.print("Informe seu peso: ");
			peso = scan.nextDouble();
			
			
			double imc = peso / (altura * altura);
			System.out.println("\nIMC = " + imc);
			
			System.out.println("\n*** ------------------------- ***\n");
			
		}

	}

}
