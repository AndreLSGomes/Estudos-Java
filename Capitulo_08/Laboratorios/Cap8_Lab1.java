package Capitulo_08.Laboratorios;

public class Cap8_Lab1 {
	
	public static int maiorNumero(int numeros[]) {
		int maior = -1000000000;
		
		for (int x : numeros) {
			if ( x > maior) {
				maior = x;
			}
		}
		return maior;
	}
	
	public static int[] organizaArray(int numeros[]) {
		
		int[] vetor = numeros;
		int temp;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				
				if (vetor[i] < vetor[j]) {
					temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
					
				}
			}
		}
		
		return vetor;
	}
	
	public static void main(String[] args) {
		
		// Declarando o tipo, instanciando e populando o array em uma única linha
		int numeros[] = {20, 105, 40, 305, 67, 38, 500};
		int maior = maiorNumero(numeros);
		
		// Encontrando o maior número do array
		System.out.println("\nO MAIOR número declarado no array é = " + maior);
		
		// Ordenando o array do menor para o maior
		System.out.print("\nO array ordenado do MENOR -> MAIOR: ");
		int vetorOrganizado[] = organizaArray(numeros);
		
		for (int i = 0; i < vetorOrganizado.length; i++) {
			System.out.print(vetorOrganizado[i]);
			if (i < vetorOrganizado.length-1) {
				System.out.print(", ");
			}
			else {
				System.out.println(".");
			}
		}
		
	}

}
