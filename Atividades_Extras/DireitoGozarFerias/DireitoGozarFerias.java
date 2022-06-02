package Atividades_Extras.DireitoGozarFerias;

import java.util.Scanner;

public class DireitoGozarFerias {
	
	// Classe Funcionário extend Pessoa

	public static void main(String[] args) throws InterruptedException {

		/*
		  Escreva um algoritmo que leia a quantidade de funcionários em uma empresa e, para cada funcionário leia
		  seu nome e seu tempo de serviço (em meses). Se o funcionário possuir mais de 12 meses na empresa, escreva a
		  mensagem “<NOME> tem direito a férias”. Caso contrário, escreva a mensagem “<NOME> não tem direito a
		  férias”. Ao final, exiba quantos funcionários possuem direito a férias e quantos não possuem. 
		*/
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de usuários: ");
		int qtdFuncionarios = scan.nextInt();
		
		// Populando o array de funcionários
		for (int i = 0; i < qtdFuncionarios; i++) {
			
			String nome;
			int tempoServico = 0;
			
			System.out.print("Digite o nome do " + (i+1) + "º funcionário: ");
			nome = scan.next();
			
			System.out.print("Idade do usuário " + nome + ": ");
			tempoServico = scan.nextInt();
	        
	        if (tempoServico > 12) {
	        	System.out.println("O(a) funcionário(a) " + nome + " tem direito a férias.");
	        }
	        else {
	        	System.out.println("O(a) funcionário(a) " + nome + " não tem direito a férias.");
	        }
			
			System.out.println("\n-------------------\n");
			
		}
		
		scan.close();

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}

}
