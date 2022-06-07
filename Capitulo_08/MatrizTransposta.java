package Capitulo_08;

public class MatrizTransposta {

	public static void main(String[] args) {

		int a[][] = {{15, 22, 36}, {18, 98, 54}, {78, 95, 51}};
		int b[][] = new int[3][3];
		
		imprimirMatriz(a);
		
		// Transpondo a matriz 'b' pela matriz 'a'
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				b[linha][coluna] = a[coluna][linha];
			}
		}
		
		System.out.println();
		imprimirMatriz(b);
	}
	
	public static void imprimirMatriz(int x[][]) {
		// Impressão da matriz a
		for (int linha = 0; linha < x.length; linha++) {
			for (int coluna = 0; coluna < x[linha].length; coluna++) {
				System.out.print("[" + linha + "][" + coluna + "]: " + x[linha][coluna] + " ");
			}
			System.out.println();
		}
	}

}
