package Capitulo_06;

public class UtilizandoMetodoVarArgs {

	public static void main(String[] args) {
		
		// Instanciando o método 'CriandoMetodoVarArgs
		CriandoMetodoVarArgs metodo = new CriandoMetodoVarArgs();

		// Declarando o array para que guardará os argumentos para serem enviados ao método
		int[] argumentos = new int[5];
		
		// Percorrendo o array
		for (int i = 0; i < argumentos.length; i++) {
			int j = i + 3;
			argumentos[i] = j;
		}
		
		// Chamando o método e passando a variável 'argumentos' como parâmetro
		int resultado = metodo.calcular(argumentos);
		
		// Impressão do resultado
		System.out.println("O resultado = " + resultado);
		
		// Chamando o método e passando a variável 'argumentos' como parâmetro
		int soma = metodo.contar(argumentos);
		
		// Impressão da soma
		System.out.println("\nA soma = " + soma);

	}
}