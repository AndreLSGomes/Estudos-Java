package Atividades_Extras.XeYSaoIguais;

import java.util.Scanner;

public class XeYsaoIguais {

	public static void main(String[] args) {

		// Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os números do usuário
		System.out.print("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		// Verificando se os números são iguais
		if (numero1 == numero2) {
			System.out.println("Os números informados são iguais (" + numero1 + " = " + numero2 + ")");
		}
		else {
			System.out.println("Os números informados são diferentes (" + numero1 + " # " + numero2 + ")");
		}
		
		scan.close();

	}

}
