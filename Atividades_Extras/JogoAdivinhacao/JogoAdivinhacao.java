package Atividades_Extras.JogoAdivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) throws InterruptedException {

		/*
		  Escreva um algoritmo que simule um jogo de adivinhação com a pergunta “O que é, o que é? Quanto mais se
		  tira, mais a gente tem?”. O seu algoritmo deve encerrar apenas quando o usuário informar a resposta correta. 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("O que é, o que é? Quanto mais se tira, mais a gente tem? ");
		String resposta = scan.nextLine();
		
		while (resposta.equals("fotografia") != true){
			
			System.out.println("\nVocê errou... tente novamente: ");
			System.out.print("\n\nO que é, o que é? Quanto mais se tira, mais a gente tem? ");
			resposta = scan.nextLine();
			
		}
		
		scan.close();
		
		System.out.println("\n\nParabéns, você acertou! Até a próxima");

	}
}
