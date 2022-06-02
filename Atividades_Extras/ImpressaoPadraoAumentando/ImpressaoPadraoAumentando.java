package Atividades_Extras.ImpressaoPadraoAumentando;
import java.util.Scanner;

public class ImpressaoPadraoAumentando {

	public static void main(String[] args) {

		// Crie um algoritmo que leia um n�mero n do usu�rio e imprima o padr�o abaixo na tela. Ex: para n = 5.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int numero = scan.nextInt();
		
		int aux = 0;
		
		for (int i = 0; i < numero; i++) {
			
			aux = i + 1;
			
			for (int j = 0; j < aux; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}
