package Capitulo_08;

public class ArrayBidimensional_Notas {

	public static void main(String[] args) {
		
		double notas[][] = new double[100][3];
		
		// Notas do 1º aluno.
		notas[0][0]= 6.5;
		notas[0][1] = 7.5;
		notas[0][2] = 7.0;
		
		// Notas do 2º aluno.
		notas[1][0]= 6.5;
		notas[1][1] = 7.5;
		notas[1][2] = 7.0;
		
		// Notas do 3º aluno.
		notas[2][0]= 6.5;
		notas[2][1] = 7.5;
		notas[2][2] = 7.0;
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("\nNotas do " + (i+1) + "º aluno");
			
			for(int j = 0; j < 3; j++) {
				System.out.println((j+1) + "ª notas: " + notas[i][j]);
			}
			
			System.out.println("\n------------------");
		}
	}	
}