package Capitulo_17.Laboratorios.Lab2;

public class Cap17_Lab1 {

	public static void main(String[] args) {

		// Instanciando as classes
		ThreadLab n1 = new ThreadLab("Thread 1");
		ThreadLab n2 = new ThreadLab("thread 2");
		
		// Criando as Threads
		Thread t1 = new Thread(n1, "Thread 1");
		Thread t2 = new Thread(n2, "Thread 2");
		
		// Startando as Thread
		t1.start();
		t2.start();

	}

}