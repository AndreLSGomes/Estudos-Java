package Capitulo_17._02_ExemploRunnable;

public class ExecutarThread {

	public static void main(String[] args) {

		ExemploRunnable r = new ExemploRunnable();
		Thread testando   = new Thread(r);
		Thread outroTeste = new Thread(r);
		
		/*
			Somente uma inst�ncia de Runnable pode ser passada para diversos
			objetos Thread. Como resultado, diversas threads ter�o como destino
			uma �nica inst�ncia, o que indica que uma mesma tarefa ser� realizada
			por diversas threads de execu��o.
		*/
		
		testando.start();
		outroTeste.start();
	}

}