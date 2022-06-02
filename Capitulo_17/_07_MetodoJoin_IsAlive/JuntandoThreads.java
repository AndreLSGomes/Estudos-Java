package Capitulo_17._07_MetodoJoin_IsAlive;

public class JuntandoThreads {

	public static void main(String[] args) throws Exception{

		// Criar uma nova Thread e juntar a Thread existente
		Thread t = new Thread(new ExemploJoin());
		
		// Inicializando a Thread
		t.start();
		
		// Tentando juntar as Threads - com um intervalo de tempo
		t.join(2000);
		
		System.out.println("\nFazendo a junção depois de 2 segundos\n");
		System.out.println("Thread atual: " + t.getName());
		
		// Observandose a Thread está viva
		System.out.println("Tread, você está né? " + t.isAlive());

	}

}