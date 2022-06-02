package Atividades_Extras.EleicaoLiderTurma;

import java.util.Scanner;

public class EleicaoLiderDaTurma {

	public static void main(String[] args) throws InterruptedException {

		/*
		 Receba os nomes dos 5 candidatos a líder de turma, em seguida receba os votos dos alunos existentes na sala.
		 Ao final mostre o total de VOTOS de cada candidato e ainda o candidato VENCEDOR da eleição.
		*/
		
		Scanner scan = new Scanner(System.in);
		Candidatos[] candidatos = new Candidatos[5];

		System.out.println("\n\n\n\n\n\n\nELEIÇÃO A LÍDER DA TURMA");
		Thread.sleep(5000);
		limpaTela();
		
		System.out.print("Informe a quantidade de eleitores: ");
		int eleitores = scan.nextInt();
		
		System.out.print("\n\nAGUARDE ENQUANTO ARMAZENAMOS ESTES DADOS! ");
		Thread.sleep(5000);
		limpaTela();

		// ARMAZENANDO OS CANDIDATOS A LÍDER DA TURMA
		for (int i = 0; i < candidatos.length; i++) {
			
			System.out.print("Informe o nome do " + (i+1) + "º candidato: ");
			
			Candidatos candidato = new Candidatos(scan.next().trim().toUpperCase());
			
			candidatos[i] = candidato;
			
		}
		
		System.out.print("\n\nAGUARDE ENQUANTO ARMAZENAMOS ESTES DADOS! ");
		Thread.sleep(5000);
		limpaTela();
		
		votacao(scan, candidatos, eleitores);
		
		Thread.sleep(5000);
		limpaTela();
		
		
		exibeCandidatos(candidatos);
		
		scan.close();
		
		System.out.println("\nTemos um total de " + eleitores + " eleitores!");

	}
	
	// Exibe os candidatos a líder da turma
	public static void exibeCandidatos(Candidatos[] candidatos) {
		
		for (Candidatos candidato: candidatos) {
			System.out.println("O candidato " + candidato.getNome() + " recebeu " + candidato.getVotos() + " voto(s).");
		}
		
	}

	// VOTAÇÃO A LÍDER DA TURMA
	private static void votacao(Scanner scan, Candidatos[] candidatos, int eleitores) {
		for (int i = 0; i < eleitores; i++) {
			
			System.out.print("Informe o nome do seu candidato para votar: ");
			
			// Recebendo o voto de cada eleitor
			String votacaoCandidato = scan.next().trim().toUpperCase();
			
			// Buscando o candidato votado e computando seu voto
			for (int j = 0; j < candidatos.length; j++) {
				
				if (votacaoCandidato.equals(candidatos[j].getNome())) {
					candidatos[j].setVotos();
					break;
				}
			}
			
		}
	}

	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
	
}
