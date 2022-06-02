package Capitulo_17._04_MultiThread;

public class Test extends Thread{
	
	public void run() {
		Object lock = true;
		synchronized(lock) {
			for(int i = 0; i < 5; i++) {
				System.out.println("55555555555555555");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Segmento objThread1 = new Segmento();
		objThread1.start();
		
		Segmento objThread2 = new Segmento("2222222222222222222");
		objThread2.start();
		
		ExemploRunnable run1 = new ExemploRunnable();
		run1.start();
		
		ExemploRunnable run2 = new ExemploRunnable("444444444444444444");
		run2.start();
		
		Test principal = new Test();
		principal.start();
		
		
	}
}
