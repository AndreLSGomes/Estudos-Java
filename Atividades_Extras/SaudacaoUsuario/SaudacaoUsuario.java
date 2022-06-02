package Atividades_Extras.SaudacaoUsuario;

import java.util.Scanner;

public class SaudacaoUsuario {

	public static void main(String[] args) {

		// Saudação usuário
		
		Scanner scan = new Scanner(System.in);
		String nomeUsuario;
		
		// Recebendo o nome do usuário
		System.out.print("Informe o nome do usuário: ");
		nomeUsuario = scan.next();
		
		scan.close();
		
		System.out.println("Seja bemvindo " + nomeUsuario + "!");

	}

}
