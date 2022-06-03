package Atividades_Extras.AlunoAprovadoReprovadoMediaPontos;

import java.util.Scanner;

public class AlunoAprovadoReprovadoMediaPontos {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("\n\n\n\n\n\n\nCÁLCULO APROVAÇÃO, MÉDIA DAS NOTAS DOS ALUNOS E DA TURMA");
		Thread.sleep(5000);
		limpaTela();

		/*
		 Receba o nome dos alunos com suas notas
		 Calcular a m�dia do aluno
		 Exibir situa��o de Aprova��o do aluno (aprovado com m�dia >= 6).
		 Calcular e mostrar a m�dia geral da turma
		 Mostrar a maior m�dia da turma
		 Mostrar a menor m�dia da turma
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos na turma: ");
		int qtdAlunos = scan.nextInt();
		
		// Limpando o console ap�s 3 segundos
		System.out.println("\n\nAGUARDE ENQUANTO ARMAZENAMOS ESTES DADOS! ");
		Thread.sleep(3000);
		limpaTela();
		
		System.out.print("Informe a quantidade de mat�rias para esta turma: ");
		int qtdMaterias = scan.nextInt();
		
		// Limpando o console ap�s 3 segundos
		System.out.println("\n\nAGUARDE ENQUANTO ARMAZENAMOS ESTES DADOS! ");
		Thread.sleep(3000);
		limpaTela();
		
		String[] aluno = new String[50];
		float[] notas = new float[qtdMaterias * qtdAlunos];
		float[] mediaAluno = new float[qtdAlunos];
		float[] somaNotas = new float[qtdMaterias * qtdAlunos];
		float totalGeral = 0;
		
		for (int i = 0; i < qtdAlunos; i++) {
			
			// Recebendo os nomes dos alunos
			System.out.print("Informe o nome do " + (i+1) + "� Aluno: ");
			aluno[i] = scan.next();
			
			// Inicializando array somaNotas e mediaAluno
			mediaAluno[i] = 0;
			somaNotas[i] = 0;
			
			// Recebendo as notas dos alunos
			for (int j = 0; j < qtdMaterias; j++) {
				System.out.print("Informe a " + (j+1) + "� nota para o " + (i+1) + "� aluno (" + aluno[i] + "): ");
				notas[j] = scan.nextInt();
				somaNotas[i] += notas[j];
				totalGeral += notas[j];
			}
			
			mediaAluno[i] = somaNotas[i] / qtdMaterias;
			
			// Limpando o console ap�s 3 segundos
			System.out.println("\n\nAGUARDE ENQUANTO ARMAZENAMOS ESTES DADOS! ");
			Thread.sleep(3000);
			limpaTela();
			
		}
		
		scan.close();
		
		for (int i = 0; i < qtdAlunos; i++) {
			
			System.out.print("O(A) aluno(a) " + aluno [i] +  " totalizou " + somaNotas[i] + " pontos, com uma m�dia de " + mediaAluno[i] + " pontos, ");
			if (somaNotas[i] >= 60) {
				System.out.println("portanto, foi APROVADO(A)!");
			}
			else{
				System.out.println("portanto, foi REPROVADO(A)!");
			}
			
		}
		
		// M�dia geral da turma
		System.out.println("\nA m�dia geral de pontos desta turma foi de " + (totalGeral / (qtdMaterias * qtdAlunos)) + " pontos.");
		
		System.out.println("\ntotal geral de pontos foi de : " + totalGeral);
		
		
	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}

}
