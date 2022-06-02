package Capitulo_17._06_ExemploYeld;

public class TestarSegmento {

	public static void main(String[] args) {

		ExemploRunnable rodar = new ExemploRunnable();
		rodar.start();
		
		Segmento s = new Segmento();
		s.start();
		
		/*
			Não alterou em nada porque a JVM já controla
			as execuções de todas as Threads
		s.yield();
		*/
		
		for (int i = 0; i < 3; i++) {
			Thread.yield();
			System.out.println("Thread em execução: " + Thread.currentThread().getName());
			Thread.yield();
			System.out.println("Thread em execução: " + Thread.currentThread().getName());
		}

	}

}