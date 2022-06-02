package Atividades_Extras.SomaComDoWhile;

public class SomaComDoWhile {

	public static void main(String[] args) {

		// Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Enquanto (Do While).
		int i = 0;
		int soma = 0;
		
		do {
			soma = soma + (i+1);
			i++;
		} while (i < 15);

		System.out.println("A soma dos números de 1 a 15 é: " + soma);

	}

}
