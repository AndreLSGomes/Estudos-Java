package Capitulo_17.Laboratorios.Lab2;

public class ThreadLab extends Thread{

	static Object lock = new Object();
	private String x;

	// Construtor
	public ThreadLab(String x) {
		this.x = x;
	}

	// Sobrescrevendo o método run()
	public void run() {
		
		/*
			Dessa vez o acesso foi sincronizado entre as threads. Enquanto uma thread
			não terminou sua execução, a outra não pôde obter o lock do objeto para
			executar. Isso só ocorreu após o término da execução de uma das threads.
			Observação 1: A execução pode iniciar por qualquer uma das threads: 1 ou 2;
			Observação 2: É importante observar que, para a sincronização da execução
			das threads, é necessário que o objeto de bloqueio tenha o mesmo valor para
			as duas ou mais threads envolvidas na execução. Por isso que foi utilizada
			uma instância estática da classe, o que garante que o mesmo endereço de
			memória é utilizado como bloqueio tanto para a thread 1 quanto pra a thread 2.
		*/
		synchronized(lock) {
			for (int i = 0; i < 10; i++) {
				
				if ((i+1) < 10) {
					System.out.println("Executando 0" + (i+1) + "ª iteração -> " + Thread.currentThread().getName());
				}
				else {
					System.out.println("Executando " + (i+1) + "ª iteração -> " + Thread.currentThread().getName());
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