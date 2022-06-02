package Atividades_Extras.NomeIdadePessoaMaisNova;

import java.util.Scanner;

public class NomeIdadePessoaMaisNovaUsandoArray {

	public static void main(String[] args) throws InterruptedException {
		
		// Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba o nome e a idade da pessoa mais nova.

		PessoaArray[] usuarios = new PessoaArray[10];

		Scanner scan = new Scanner(System.in);
		
		// Populando o array de usuários
		for (int i = 0; i < usuarios.length; i++) {
			
			PessoaArray usuario = new PessoaArray();
			
			System.out.print("Digite o nome do " + (i+1) + "º usuário: ");
			usuario.setNome(scan.nextLine());
			
			System.out.print("Idade do usuário " + usuario.getNome() + ": ");
			usuario.setIdade(Integer.parseInt(scan.nextLine()));
			
			usuarios[i] = usuario;
			
			System.out.println("\n-------------------\n");
			
		}
		
		scan.close();
        System.out.println("AGUARDE ENQUANTO PROCESSAMOS ESTES DADOS!");
		
        // pausa de 2 segundos	            
        Thread.sleep(2000);
        limpaTela();
        
		int indice = 999999999;
		int menorIdade = 999999999;
		
		// Verificando o usuário mais jovem
		for (int i = 0; i < usuarios.length; i++) {
			
			if (menorIdade > usuarios[i].getIdade()) {
				indice = i;
				menorIdade = usuarios[i].getIdade();
			}
			
		}

        System.out.println("A pessoa mais jovem entre os usuários é " + usuarios[indice].getNome() + " e sua idade é de " + usuarios[indice].getIdade() + ".");

	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}

}
