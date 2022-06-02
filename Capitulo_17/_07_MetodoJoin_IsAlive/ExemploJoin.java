package Capitulo_17._07_MetodoJoin_IsAlive;

public class ExemploJoin implements Runnable {
	
	// Implementando o método run()
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread atual: " + t.getName());
		
		// Utilizando isAlive()
		System.out.println("Thread, você está viva? " + t.isAlive());
	}

}