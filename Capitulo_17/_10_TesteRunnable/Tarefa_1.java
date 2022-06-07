package Capitulo_17._10_TesteRunnable;

public class Tarefa_1 implements Runnable{
	
	// Método run
	public void run() {

		for(int i = 0; i < 5; i++) {
			
			System.out.println("Tarefa_1 em ação!");
			
			try{
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println();
			}
		}
	
	}

}