package Capitulo_17.Laboratorios.Lab1;

public class ThreadLab extends Thread{

	private String x;

	// Construtor
	public ThreadLab(String x) {
		this.x = x;
	}

	// Sobrescrevendo o m�todo run()
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("Executando " + (i+1) + "� itera��o -> " + Thread.currentThread().getName());

			try {
				/*
					O m�todo sleep() � usado para parar a execu��o do thread atual (o que quer que esteja em execu��o no sistema)
					por um per�odo espec�fico de tempo e, ap�s esse per�odo de tempo terminar, o thread que est� executando antes
					come�a a executar novamente.
				*/
				sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}