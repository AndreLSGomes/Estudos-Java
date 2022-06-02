package Capitulo_17.Laboratorios.Lab1;

public class ThreadLab extends Thread{

	private String x;

	// Construtor
	public ThreadLab(String x) {
		this.x = x;
	}

	// Sobrescrevendo o método run()
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("Executando " + (i+1) + "ª iteração -> " + Thread.currentThread().getName());

			try {
				/*
					O método sleep() é usado para parar a execução do thread atual (o que quer que esteja em execução no sistema)
					por um período específico de tempo e, após esse período de tempo terminar, o thread que está executando antes
					começa a executar novamente.
				*/
				sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}