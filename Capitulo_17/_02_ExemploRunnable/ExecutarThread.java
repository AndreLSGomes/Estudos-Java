package Capitulo_17._02_ExemploRunnable;

public class ExecutarThread {

	public static void main(String[] args) {

		ExemploRunnable r = new ExemploRunnable();
		Thread testando   = new Thread(r);
		Thread outroTeste = new Thread(r);
		
		/*
			Somente uma instância de Runnable pode ser passada para diversos
			objetos Thread. Como resultado, diversas threads terão como destino
			uma única instância, o que indica que uma mesma tarefa será realizada
			por diversas threads de execução.
		*/
		
		testando.start();
		outroTeste.start();
	}

}