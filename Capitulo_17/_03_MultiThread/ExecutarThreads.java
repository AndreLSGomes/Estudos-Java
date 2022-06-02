package Capitulo_17._03_MultiThread;

public class ExecutarThreads {

	public static void main(String[] args) {

		// instanciando
		ExemploThreads testando   = new ExemploThreads();
		ExemploThreads avaliando  = new ExemploThreads();
		ExemploThreads explorando = new ExemploThreads();
		
		// Iniciando a thread
		testando.start();
		avaliando.start();
		explorando.start();
	}

}