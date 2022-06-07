package Capitulo_17._10_TesteRunnable;

public class Main {

	public static void main(String[] args) {

		// Instanciando Tarefa_1 e Tarefa_2
		Runnable obj_1 = new Tarefa_1();
		Runnable obj_2 = new Tarefa_2();
		
		// Criando duas Threads
		Thread tarefa_1 = new Thread(obj_1);
		Thread tarefa_2 = new Thread(obj_2);
		
		tarefa_1.run();
		tarefa_2.run();

	}

}
