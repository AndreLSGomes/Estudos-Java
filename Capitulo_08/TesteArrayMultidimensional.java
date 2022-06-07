package Capitulo_08;

public class TesteArrayMultidimensional {

	public static void main(String[] args) {

		int elementos [][] = {{5, 2, 6}, {10, 12, 0, 5}, {65, 99}};
		
		for (int linha = 0; linha < elementos.length; linha++) {
			
			System.out.println("Array " + (linha + 1) + ": ");
			
			for (int col = 0; col < elementos[linha].length; col++) {
				System.out.print("[" + (linha + 1) + "]" + "[" + (col + 1) + "]:" + elementos[linha][col] + " ");
				
			}
			System.out.println("\n");
		}

	}

}