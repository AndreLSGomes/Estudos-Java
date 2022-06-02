package Atividades_Extras.ConversaoDolarReal;

import java.util.Scanner;

public class ConversaoDolarReal {

	public static void main(String[] args) {

		// Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 1,82.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o número do usuário
		System.out.print("Informe um valor em dólares: ");
		double dolar = scan.nextDouble();
		
		double real = dolar * 1.82;
		
		scan.close();
		
		System.out.println("Após a conversão do valor US$ " + dolar + " temos RS " + real + ".");

	}

}
