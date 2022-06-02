package Atividades_Extras.TrocaValorEntreVariaveisXeY;

import java.util.Scanner;

public class TrocaValorEntreVariaveisXeY {

	public static void main(String[] args) {

		// Crie um algoritmo que leia as variáveis inteiras x e y e
		// troque o valor destas variáveis. Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x.
		// Mostre os valores depois da troca.
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o número do usuário
		System.out.print("Informe um número: ");
		double x = scan.nextInt();
		
		System.out.print("Informe outro número: ");
		double y = scan.nextInt();
		
		System.out.println("\nO valor original de 'X' era " + x + " e o valor de 'Y' era " + y);
		
		double aux = x;
		x = y;
		y = aux;
		
		System.out.println("\nApós a inversão temos 'X' = " + x + " e 'Y' é = " + y);
		
		scan.close();

	}

}
