package Atividades_Extras;

import java.lang.Math;

public class Sorteio {

	public static void main(String[] args) {
		
		/*
		Escreva um algoritmo em java para:
		Sortear um número de 0 a 1000 (dica: usar Math.random())
		Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou menor do que o número sorteado.
		Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em quantas tentativas ele acertou. 
		*/
		
        // Definindo o range
        int max = 1000;
        int min = 0;
        int range = max - min + 1;
        
        int numRandomico;
        int palpite = -1;
        int tentativa = 0;
  
        // Gerando número randomico entre 0 até 1000
        numRandomico = (int)(Math.random() * range) + min;
        
        while (palpite != numRandomico) {
        	
        	// Gerando palpite randomico entre 0 até 1000
        	palpite = (int)(Math.random() * range) + min;
        	
        	if (palpite < numRandomico) {
        		System.out.println("Seu palpite (" + palpite + ") é MENOR do que o número sorteado (" + numRandomico + ").");
        	}
        	else if (palpite > numRandomico) {
        		System.out.println("Seu palpite (" + palpite + ") é MAIOR do que o número sorteado!");
        	}
        	else {
        		System.out.print("\nVocê conseguiu!");
        	}
        	tentativa++;
        }

        System.out.println(" Após " + tentativa + " tentativas você acertou o número sorteado (" + numRandomico + ").");
    }
}