package Capitulo_13;

import java.util.Random;

public class MegaSenaUtilitario {
	
	// Método utilitário
	public static int sortearNumero() {
		Random sorteador = new Random();
		int numero = sorteador.nextInt();
		return numero;
	}

}