package Capitulo_17._05_PrioridadeThread;

public class TestarSegmento {

	public static void main(String[] args) {

		ExemploRunnable rodar = new ExemploRunnable();
		rodar.start();
		
		Segmento s = new Segmento();
		s.setPriority(7);
		s.start();

	}

}