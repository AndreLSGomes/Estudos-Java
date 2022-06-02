package Capitulo_17._08_Sincronizacao.NotifyWayt;

public class SegmentoY extends Thread{
	
	int montante;
	
	// Sobrescrevendo o método run()
	public void run() {
		synchronized (this) {
			for (int a = 0; a <= 10; a++) {
				montante += a;
			}
			notify();
			
		}
	}

}