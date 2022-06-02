package Capitulo_17._03_MultiThread;

public class ExemploThreads extends Thread implements Runnable{
	
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println(i + " Uma mensagem");
			i++;
		}
	}

}