package Capitulo_06;

import java.util.Scanner;

public class ExemploUsoDeMetodosEAtributoStatic {
	
	// Criação de constantes
	public static final double PI = 3.1415926;
	
	// Criação de rotinas (métodos) de utilidade geral
	public static String inverterString(String valor) {
		
		char[] letras = valor.toCharArray();
		char[] letrasInversas = new char[letras.length];
		
		System.out.println("\n\nA frase digitada foi \'" + valor + "\'. Portanto o tamanho do array de char tem "+ letras.length + " posições, iniciando do 0 até " + (letras.length -1) + ".");
		System.out.printf("\n----------------------------------------\n");
		System.out.print("\n\nENTROU NO FOR\n\n");
		for (int i = 0; i < letras.length; i++) {
			System.out.println((i + 1) + "ª iteração.");
			System.out.print("i = " + i + "; letras.lenght = " + letras.length + "; i = " + i);
			letrasInversas[letras.length -i -1] = letras[i];
			System.out.println("\nletrasInversas[letras.length -i -1] = " + "letrasInversas[" + (letras.length -i -1) + "] e RECEBE letras[" + i + "] ou seja '" + letras[i] + "\'.\n");
		}
		System.out.print("\nSAIU DO FOR\n");
		
		return new String(letrasInversas);
		
	}
	
	public static void main(String args[]) {
		
		// Utilizando a constante criada
		double raio = 2.5;
		double perimetro = 2 * raio * PI;
		System.out.printf("O valor do perímetro é %.2f", perimetro);
		System.out.printf("\n\n----------------------------------------\n\n");
		
		// Utilizando o método criado
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = s.nextLine();
	    s.close();
        
        // chamando o método inverterString
        String inverso = inverterString(frase);

		System.out.printf("\n");
        System.out.print("\nApós a inversão, teremos: \'" + inverso + "\'");
	}
}
