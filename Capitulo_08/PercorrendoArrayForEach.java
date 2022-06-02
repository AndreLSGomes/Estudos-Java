package Capitulo_08;

public class PercorrendoArrayForEach {

	public static void main(String[] args) {
		
		int valor = 10;

		// Declaração de uma única linha
		int[] numeros = {valor, 11, 12};
		
		// Exibindo os valores do array com ENHANCED FOR"
		System.out.println("Exibindo os valores do array com ENHANCED FOR");
		for(int num : numeros) {
			System.out.println("Num = " + num);
		}

		System.out.println("\n-------------------------------------------------\n");
		
		// Exibindo os índices e os valores do array com FOR
		System.out.println("Exibindo os índices e os valores do array com FOR");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}

		System.out.println("\n-------------------------------------------------\n");
		
		// Declaração de uma única linha array bidimensional
		int[][] elementos = {{0, 1, 1}, {3, 5, 8, 13}, {21, 34}};
		
		System.out.println("Array bidimensional\n");
		for (int i = 0; i < elementos.length; i++) {
			for(int j = 0; j < elementos[i].length; j++) {
				System.out.println("elementos[" + i + "][" + j + "] = " + elementos[i][j]);
			}
			if (i < elementos.length-1) {
				System.out.println("\n--------------------\n");
			}

		}
		
		System.out.println("\n-------------------------------------------------\n");
		
		// Array anônimo
		System.out.println("Array anônimo");
		int x[];
		x = new int[] {17, 38, 10};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}

}