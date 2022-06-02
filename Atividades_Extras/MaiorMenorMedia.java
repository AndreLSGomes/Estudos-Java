package Atividades_Extras;

import java.util.Scanner;

public class MaiorMenorMedia {
	
	public static void main(String[] args) {
		
		/*
		 Escreva um algoritmo em Java que receba a entrada de dados do usuário informando o sexo, altura de um grupo de pessoas
		 Calcule:
		 a altura média do grupo
		 a altura média dos homens
		 a altura média das mulheres
		 a maior e menor altura do grupo
		 o número total de homens
		 o número total de mulheres
		*/
		
		// Limpa tela
        limpaTela();
		
		int opcao = 0;
		
		float altura;
		char sexo;
		int qtMulheres = 0;
		int qtHomens = 0;
		float maiorAltura = 0;
		float menorAltura = (float) 5.0;
		float somaAlturaHomens = 0;
		float somaAlturaMulheres = 0;
		float mediaGeral = 0;
		float mediaH = 0;
		float mediaM = 0;
		

        Scanner menu = new Scanner (System.in);

		do {
			// Montando menu
			System.out.println("\n *** ESCOLHA UMA OPÇÃO DE MENU *** \n");
	        System.out.println("Opção 1 - Novo Cadastro");
	        System.out.print("Opção 9 - Sair\n");
			System.out.println("\n-------------------------\n");;
	        
	        // Recebe digitação do usuário
	        System.out.print("Digite uma opção: ");
	        opcao = menu.nextInt();
	        
	        // Limpa tela
	        limpaTela();
	        
	        
	        if (opcao == 1) {

	        	// SEXO
		        System.out.print("\nEscolhao sexo: (M) Mulher || (H) Homem: ");
		        sexo = menu.next().charAt(0);
		        
		        if (sexo == 'M' || sexo == 'm') {
		        	qtMulheres++;
		        }
		        else if (sexo == 'H' || sexo == 'h') {
		        	qtHomens++;
		        }
		        else {
		        	limpaTela();
		        	System.out.println("ENTRADA INVÁLIDA! Utilize (M) para mulheres ou (H) para homens");
		        	continue;
		        }
		        
		        // ALTURA
		        System.out.print("Informe a altura (Exemplo: 1,60) ");
		        altura = menu.nextFloat();
		        
		        if(sexo == 'H' || sexo == 'h') {
		        	somaAlturaHomens = somaAlturaHomens + altura;
		        }
		        else {
		        	somaAlturaMulheres = somaAlturaMulheres + altura;
		        }
		        
		        if (altura > maiorAltura) {
		        	maiorAltura = altura;
		        }
		        if (altura < menorAltura) {
		        	menorAltura = altura;
		        }
		        else {
		        	limpaTela();
		        	System.out.println("ENTRADA INVÁLIDA! Utilize ',' (vírgula) para casas decimais.");
		        	continue;
		        }
		        
		        // Limpa tela
		        limpaTela();
	        }
	        else if (opcao != 1 && opcao != 9) {
	        	System.out.println("OPÇÃO NÃO RECONHECIDA. TENTE NOVAMENTE!\n\n\n");
	        	continue;
	        }
	        
		}while (opcao != 9);
		
		// Encerra Scanner
		menu.close();
		
		mediaGeral  = (somaAlturaHomens + somaAlturaMulheres) / (qtHomens + qtMulheres);
		
		if (qtHomens != 0) {
			mediaH = somaAlturaHomens / qtHomens;	
		}
		
		if (qtMulheres != 0) {
			mediaM = somaAlturaMulheres / qtMulheres;
		}

        System.out.println("A altura média do grupo é de: " + mediaGeral + ".");
        System.out.println("A maior altura do grupo é de " + maiorAltura + "m, e a menor é de " + menorAltura + "m.");
        System.out.println("A média de altura dos homens é: " + mediaH + "m.");
        System.out.println("A média de altura das mulheres é: " + mediaM + "m.");
        System.out.println("O número de homens é: " + qtHomens);
        System.out.println("O número de mulheres é: " + qtMulheres + ".");

	}

	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
	
}