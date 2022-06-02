package Atividades_Extras;

import java.util.Scanner;

public class ReflexoUsuario {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 Fazer um algoritmo em Java para medir os reflexos do usuário. O programa deve:
		 Mostrar a palavra “Agora!” após um tempo aleatório e um número, também aleatório
		 Contar o tempo até que o usuário digite o número pedido e mostrar esse tempo.
		 Dicas: usar o método getTimeInMillis da classe Calendar ou o método nanoTime da classe System.
		*/
		
		Scanner sc = new Scanner (System.in);

		char opcao = 'z';
		int numeroDigitado;
		int tentativas = 0;
        limpaTela();
        
		do {

			if (tentativas != 0 && opcao == 'n') {
				limpaTela();
				System.out.println("Vamos tentar novamente\n\n\n");
			}
			else {
		        System.out.println("IREMOS MEDIR SEUS REFLEXOS!\n\n\n");
		        System.out.println("Digite o número exibido na tela no menor tempo possível\n\n\n");
			}
	        System.out.print("Podemos começar? Pressione (S) para sim ou (N) para não: ");

	        // Recebendo a resposta do usuário a respeito do início do teste
	        opcao = sc.next().charAt(0);
	        
			if (opcao == 's' || opcao == 'S') {
				
	            // Gerando número randomico entre 0 até 1000
	            int max = 1000;
	            int min = 0;
	            int range = max - min + 1;
	            
	            int numRandomico = (int)(Math.random() * range) + min;
	            
	            limpaTela();
	            
	            System.out.println("\n\nDigite o número " +numRandomico + " assim que dermos o sinal. Fique atento!");
	            
	            // pausa de 2 segundos	            
	            Thread.sleep(2000);
	            System.out.println("AGORA!");

	            long start = System.currentTimeMillis();
	            
		        // Recebendo a digitação do usuário 
		        numeroDigitado = sc.nextInt();
		        
	            long finish = System.currentTimeMillis();
		        
		        sc.close();

		        
		        System.out.println("O usuário digitou o número " + numeroDigitado + " após " + (finish - start) + " milissegundos.");
	        }

            tentativas++;
	        
		}while (opcao == 'n' || opcao == 'N');

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}

}
