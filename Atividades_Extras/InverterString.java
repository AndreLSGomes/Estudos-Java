package Atividades_Extras;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {

		/*
		 Fazer um programa que receba uma string do usuário e mostre o conteúdo desta string de forma invertida.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite aqui o seu texto: ");
	    String texto = scan.nextLine();
		scan.close();
		
		System.out.println(" ");
		
		// INVERTENDO ATRAVÉS DO MÉTODO REVERSE
		//System.out.println(new StringBuilder(texto).reverse().toString());
		
		
		String textoInvertido = "";
	
		
		for (int i = texto.length() - 1;  0 <= i; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		System.out.println("O texto invertido será: " + textoInvertido);

	}

}
