package Capitulo_14._01_UtilizandoInterface;

public class Executando {

	public static void main(String[] args) {

		// Instanciando a classe OperacaoAritmetica para podermos utilizar seus métodos
		OperacaoAritimetica operacao = new Soma();
		
		double result = operacao.execute(15.8, 8.3);
		
		System.out.println(result);
		
	}

}
