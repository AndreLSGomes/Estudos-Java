package Capitulo_08.Desafio;

public class PreenchencoMatrizNaDiagonal {

	public static void main(String[] args) {

		char[][] matriz = new char[7][7];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
		        // Sorteando número de 0 a 9 e incluindo na matriz[4][4]
		        if (i == j) {
		        	matriz[i][j] = 'X';
		        }
		        else {
					matriz[i][j] = 'o';	
		        }
			}
		}
		
		// Exibindo a matriz
		System.out.println("\nExibindo a matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
		       System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}

	}
}

