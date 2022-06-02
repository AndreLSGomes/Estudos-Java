package Capitulo_17._06_ExemploYeld;

public class TestarSegmento {

	public static void main(String[] args) {

		ExemploRunnable rodar = new ExemploRunnable();
		rodar.start();
		
		Segmento s = new Segmento();
		s.start();
		
		/*
			N�o alterou em nada porque a JVM j� controla
			as execu��es de todas as Threads
		s.yield();
		*/
		
		for (int i = 0; i < 3; i++) {
			Thread.yield();
			System.out.println("Thread em execu��o: " + Thread.currentThread().getName());
			Thread.yield();
			System.out.println("Thread em execu��o: " + Thread.currentThread().getName());
		}

	}

}