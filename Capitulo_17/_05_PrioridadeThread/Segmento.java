package Capitulo_17._05_PrioridadeThread;

public class Segmento extends Thread{
	
	public void run() {
		int i = 0;
		while(i <= 5) {
			System.out.println("***  Segmento tem prioridade! ***");
			i++;
		}
	}

}