package Capitulo_06;

public class CriandoMetodoVarArgs {

	// parâmetro de tamanho variável utilizando ARRAY	
	public int calcular(int[] lista) {
		
		int resultado = 0;
		for (int i = 0; i <lista.length; i++) {
			resultado += lista[i];
		}
		return resultado;
		
	}
	
	// parâmetro de tamanho variável utilizando LIST	
	public int contar(int...lista ) {
		
		int soma = 0;
		// Percorrendo a lista
		for (int item: lista) {
			soma += (item + 2);
		}
		return soma;
		
	}

}