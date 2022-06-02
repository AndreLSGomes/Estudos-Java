package Capitulo_08;

public class ConstrucaoInicializacaoAtribuicaoArrayEmUmaUnicaLinha {

	public static void main(String[] args) {

		// Construção, inicialização e atribuição de um array uma única linha
		
		System.out.println("Construção, inicialização e atribuição de um array uma única linha:");
		System.out.println("  -> int conjunto[][] = {{0, 1, 1, 9}, {3, 5, 8, 13}, {22, 89, 35}, {56, 9, 37}};\n");
		int conjunto[][] = {{0, 1, 1, 9}, {3, 5, 8, 13}, {22, 89, 35}, {56, 9, 37}};
		
		// Percorrendo o array Bidimensional
		System.out.println("Percorrendo o array Bidimensional:");
		for (int i = 0; i < conjunto.length; i++) {
			
			for (int j = 0; j < conjunto[i].length; j++) {
				System.out.print("  -> Conjunto[" + i +"][" + j + "] = " + conjunto[i][j] + ", ");
			}
			System.out.println("\n");
		}

	}

}
