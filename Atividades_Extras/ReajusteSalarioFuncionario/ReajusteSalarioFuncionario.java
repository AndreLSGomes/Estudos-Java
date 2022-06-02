package Atividades_Extras.ReajusteSalarioFuncionario;

import java.util.Scanner;

public class ReajusteSalarioFuncionario {

	public static void main(String[] args) {

		// Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

		Scanner scan = new Scanner(System.in);
		
		// Recebendo o valor do salário do funcionário
		System.out.print("Informe o valor do salário a ser reajustado: ");
		double salario = scan.nextDouble();
		salario = salario + (salario * 0.07);
		
		scan.close();
		
		System.out.print("O valor do salário do funcionario reajustado em 7% é " + salario);
		
	}

}
