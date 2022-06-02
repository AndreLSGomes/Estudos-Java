package Capitulo_08;

public class PassandoArrayComoParametro {

	public static void main(String[] args) {

		int valoresA[] = new int[3];
		int valoresB[] = new int[3];
		
		int i;
		
		valoresA[0] = 10;
		valoresA[1] = 20;
		valoresA[2] = 30;
		
		valoresB = dobraValores(valoresA);
		
		for (i = 0; i < valoresB.length; i++) {
			System.out.println("Valoresb[" + i + "] = " + valoresB[i]);
		}

	}
	
	static int[] dobraValores(int x[]) {
		int i;
		for (i = 0; i < x.length; i++)
			x[i] *= 2;
		return x;
	}

}
