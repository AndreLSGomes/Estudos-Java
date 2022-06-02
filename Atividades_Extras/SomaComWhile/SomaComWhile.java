package Atividades_Extras.SomaComWhile;

public class SomaComWhile {

	public static void main(String[] args) {

		// Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Enquanto (While).
		int i = 0;
		int soma = 0;
		
		while (i < 15) {
			soma = soma + (i+1);
			i++;
		}

		System.out.println("A soma dos números de 1 a 15 é: " + soma);

	}

}
