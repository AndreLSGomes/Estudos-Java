package Capitulo_14._04_UtilizandoLambdaSemParametros;

public class ExecutandoFunc2 {

	public static void main(String[] args) {

		// Utilizando de expressão lambda sem parâmetro
		ExemploFuncional2 funcao = () -> System.out.println("Olá munda do Java Funcional!");
		funcao.exibeDados();
		
	}

}
