package Atividades_Extras.MenuOperacoesMatematicas;

import java.util.Scanner;

public class MenuOperacoesMatematicas {

	/*
	 Escreva um algoritmo que leia dois números e apresente um menu com 4 opções: 
	 1) Somar os números; 2) Subtrair os números; 3) Multiplicar os números; 4) Dividir os números.
	 Leia a opção do usuário e execute a operação e apresente o resultado.
	 Caso a opção digitada seja inválida, apresente a mensagem de “Opção inválida” para o usuário.
	*/
	
	public static void main(String[] args) throws InterruptedException {
        
		Scanner scan = new Scanner(System.in);
		
        int opcao;

	        // Recebendo os números do usuário
	        System.out.print("Digite o 1º número: ");
	        double x = scan.nextDouble();
	        
	        System.out.print("Digite o 2º número: ");
	        double y = scan.nextDouble();
	        
	        Thread.sleep(2000);
	        limpaTela();

        do {
	        // Escreve menu
			System.out.println("*** Menu de opções ***");
			System.out.println("1-Somar  2-Subtrair  3-Multiplicar  4-Dividir  0-SAIR\n\n\n");

			opcao = scan.nextInt();
			
			switch (opcao) {
				case 0:
			        limpaTela();  
			        System.out.println("Fechando o sistema. \n\nAGUARDE.........\n\n\n\n\n\n\n\n");
		            Thread.sleep(2000);
		            limpaTela();
					break;
				case 1:	        
			        limpaTela();
			        System.out.println("O valor da soma dos números " + x + " e " + y + " = " + somar(x, y));
			        opcao = 0;
					break;
				case 2:        
			        limpaTela();
			        System.out.println("O valor da subtração dos números " + x + " e " + y + " = " + subtrair(x, y));
			        opcao = 0;
					break;
				case 3:        
			        limpaTela();
			        System.out.println("O valor da multiplicação dos números " + x + " e " + y + " = " + Multiplicar(x, y));
			        opcao = 0;
					break;
				case 4:        
			        limpaTela();
			        System.out.println("O valor da divisão dos números " + x + " e " + y + " = " + dividir(x, y));
			        opcao = 0;
					break;
				default:
					System.out.println("Opcao inválida!");
		            // pausa de 2 segundos	            
		            Thread.sleep(2000);
			        limpaTela();
			}
			
		} while (opcao != 0);  
		
        scan.close();

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
	
	public static double somar(double x, double y) {
		double aux = x + y;
		return aux;
	}
	
	public static double Multiplicar(double x, double y) {
		double aux = x - y;
		return aux;
	}
	
	public static double subtrair(double x, double y) {
		double aux = x * y;
		return aux;
	}
	
	public static double dividir(double x, double y) {
		double aux = x / y;
		return aux;
	}

}
