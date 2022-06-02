package Capitulo_11.Laboratorios;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Informe o ano de seu nascimento: ");
			int anoNascimento = Integer.parseInt(scan.nextLine());
			scan.close();
			
			System.out.println("A sua idade é: " + (2022 - anoNascimento) + " anos");
		}
		catch (NumberFormatException e) {
			System.out.println("Valor digitado inválido!");
		}


	}

}
