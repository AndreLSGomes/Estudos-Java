package Capitulo_17._08_Sincronizacao.NotifyWayt_2;

public class NotificacaoTres extends Thread{

	NotificacaoUm n1;
	
	// Construtor
	public NotificacaoTres(NotificacaoUm n1) {
		this.n1 = n1;
	}
	
	// Sobrescrevendo o m�todo run()
	public void run() {
		
		synchronized(this.n1) {
			System.out.println(Thread.currentThread().getName() + "-> t3.start() foi alcan�ado!");
			
			/*
				O m�todo notify() da classe de encadeamento � usado para ativar um �nico encadeamento.
				Este m�todo fornece a notifica��o para apenas um thread que est� aguardando um objeto espec�fico.
			*/
			this.n1.notify();
			
			System.out.println(Thread.currentThread().getName() + "-> Encontrou um 'notify()', ou seja, Tread Tr�s sendo executada!");
		}
		
		System.out.println(Thread.currentThread().getName() + " finalizada!");

	}

}