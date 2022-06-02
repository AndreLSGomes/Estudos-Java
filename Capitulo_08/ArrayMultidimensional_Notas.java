package Capitulo_08;

public class ArrayMultidimensional_Notas {

	public static void main(String[] args) {
		
		double notas[][][] = new double[1][3][3];
		
		// Notas do primeiro aluno para a 1ª matéria.
		notas[0][0][0]= 6.5;
		notas[0][0][1] = 7.5;
		notas[0][0][2] = 7.0;
		
		// Notas do primeiro aluno para a 2ª matéria.
		notas[0][1][0]= 6.5;
		notas[0][1][1] = 7.5;
		notas[0][1][2] = 7.0;
		
		// Notas do primeiro aluno para a 3ª matéria.
		notas[0][2][0]= 6.5;
		notas[0][2][1] = 7.5;
		notas[0][2][2] = 7.0;
		
		int i = 0, j, k;
		
		System.out.println("----------------------------------\n");
			
		for(j = 0; j <= 2; j++) {
			for(k = 0; k <= 2; k++) {
				System.out.println("Nota do: " + (i+1) + "º aluno, " + (j+1) + "ª matéria: " + notas[i][j][k]);
			}
			System.out.println("\n----------------------------------\n");
		}
	}
}
