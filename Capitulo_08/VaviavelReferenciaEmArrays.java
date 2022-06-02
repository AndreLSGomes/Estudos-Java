package Capitulo_08;

public class VaviavelReferenciaEmArrays {

	public static void main(String[] args) {

		// Variável de referência em arrays unidimensionais
		int codigos[];
		int dados[] = new int[3];
		char artigos[] = new char[4];
		
		codigos = dados;
		// Erro pois estes arrays possuem tipos diferentes
		// codigos = artigos;
		
		
		//-------------------------------------------------
		
		// Variável de referência em arrays bidimensionais
		int codigo[];
		int notas[][] = new int[4][];
		
		codigos = dados;

	}

}
