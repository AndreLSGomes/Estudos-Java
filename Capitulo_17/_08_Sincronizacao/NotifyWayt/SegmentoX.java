package Capitulo_17._08_Sincronizacao.NotifyWayt;

public class SegmentoX {

	public static void main(String[] args) {

		SegmentoY y = new SegmentoY();
		y.start();
		
		synchronized (y) {
			try{
				System.out.println("Esperando que Y seja executado....");
				y.wait();
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("O montante de y é: " + y.montante);

	}

}