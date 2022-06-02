package Atividades_Extras.SalarioMinino;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {

		/*
		 Construa um algoritmo que leia do usuário o salário e exiba uma mensagem de acordo com as seguintes
		condições: se o salário for até R$ 645, escreva a mensagem “Até 1 salário mínimo; se o salário for acima de R$
		645 e até R$ 1935, escreva a mensagem “Até 3 salários mínimos”; se for acima de R$ 1935 e abaixo de R$ 3225,
		escreva a mensagem “Até 5 salários mínimos”; se for acima de R$ 3225, escreva a mensagem “Acima de 5
		salários mínimos”. 
	   */
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o salário do usuário
		System.out.print("Informe seu salário: ");
		double salario = scan.nextDouble();
		
		// Verificando o salário
		if (salario <= 645) {
			System.out.println("Até 1 salário mínimo!");
		}
		else if (salario > 645  && salario <= 1935) {
			System.out.println("Até 3 salários mínimos!");
		}
		else if (salario > 1935 && salario <= 3255) {
			System.out.println("Até 5 salários mínimos!");
		}
		else {
				System.out.println("Acima de 5 salários mínimos!");
		}
		
		scan.close();

	}

}
