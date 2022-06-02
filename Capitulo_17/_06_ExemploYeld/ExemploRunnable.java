package Capitulo_17._06_ExemploYeld;

public class ExemploRunnable extends Thread implements Runnable{
	
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println(i + " ExemploRunnable");
			i++;
		}
	}

}