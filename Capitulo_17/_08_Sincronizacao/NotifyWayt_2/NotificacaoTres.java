package Capitulo_17._08_Sincronizacao.NotifyWayt_2;

public class NotificacaoTres extends Thread{

	NotificacaoUm n1;
	
	// Construtor
	public NotificacaoTres(NotificacaoUm n1) {
		this.n1 = n1;
	}
	
	// Sobrescrevendo o método run()
	public void run() {
		
		synchronized(this.n1) {
			System.out.println(Thread.currentThread().getName() + "-> t3.start() foi alcançado!");
			
			/*
				O método notify() da classe de encadeamento é usado para ativar um único encadeamento.
				Este método fornece a notificação para apenas um thread que está aguardando um objeto específico.
			*/
			this.n1.notify();
			
			System.out.println(Thread.currentThread().getName() + "-> Encontrou um 'notify()', ou seja, Tread Três sendo executada!");
		}
		
		System.out.println(Thread.currentThread().getName() + " finalizada!");

	}

}