package Atividades_Extras.ParOuImpar;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args){
    	
		// Crie um algoritmo que leia um número do usuário e informe se e o número é par ou ímpar.
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo o número do usuário
		System.out.print("Digite o número a ser verificado: ");
		int numero1 = scan.nextInt();
		
		// Verificando se o número é par ou impar
		if (numero1 % 2 == 0) {
			System.out.println("O número informado é (" + numero1 + ") par.");
		}
		else {
			System.out.println("O número informado é (" + numero1 + ") impar.");
		}
		
		scan.close();
    }

}
