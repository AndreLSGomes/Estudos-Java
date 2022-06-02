package Capitulo_17.Laboratorios.Lab2;

public class ThreadLab extends Thread{

	static Object lock = new Object();
	private String x;

	// Construtor
	public ThreadLab(String x) {
		this.x = x;
	}

	// Sobrescrevendo o m�todo run()
	public void run() {
		
		/*
			Dessa vez o acesso foi sincronizado entre as threads. Enquanto uma thread
			n�o terminou sua execu��o, a outra n�o p�de obter o lock do objeto para
			executar. Isso s� ocorreu ap�s o t�rmino da execu��o de uma das threads.
			Observa��o 1: A execu��o pode iniciar por qualquer uma das threads: 1 ou 2;
			Observa��o 2: � importante observar que, para a sincroniza��o da execu��o
			das threads, � necess�rio que o objeto de bloqueio tenha o mesmo valor para
			as duas ou mais threads envolvidas na execu��o. Por isso que foi utilizada
			uma inst�ncia est�tica da classe, o que garante que o mesmo endere�o de
			mem�ria � utilizado como bloqueio tanto para a thread 1 quanto pra a thread 2.
		*/
		synchronized(lock) {
			for (int i = 0; i < 10; i++) {
				
				if ((i+1) < 10) {
					System.out.println("Executando 0" + (i+1) + "� itera��o -> " + Thread.currentThread().getName());
				}
				else {
					System.out.println("Executando " + (i+1) + "� itera��o -> " + Thread.currentThread().getName());
				}
	
				try {
					sleep(500);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
	
			}
		}
	}
}