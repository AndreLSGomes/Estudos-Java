package Atividades_Extras.MaiorValor;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {

		// Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os números do usuário
		System.out.print("Digite o primeiro número: ");
		double x = scan.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double y = scan.nextDouble();
		
		// Verificando se os números são iguais
		if (x > y) {
			System.out.println("O primeiro número informado (" + x + ") é maior do que o segundo número informado (" + y + ")");
		}
		else {
			System.out.println("O segundo número informado (" + y + ") é maior do que o primeiro número informado (" + x + ")");
		}
		
		scan.close();

	}

}
