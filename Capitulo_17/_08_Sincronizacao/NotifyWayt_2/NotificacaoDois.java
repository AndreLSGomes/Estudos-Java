package Capitulo_17._08_Sincronizacao.NotifyWayt_2;

public class NotificacaoDois extends Thread{
	
	NotificacaoUm n1;
	
	// Construtor
	public NotificacaoDois(NotificacaoUm n1) {
		this.n1 = n1;
	}
	
	// Sobrescrevendo o método run()
	public void run() {
		synchronized(this.n1){
			System.out.println(Thread.currentThread().getName() + "-> t2.start() foi alcançado!");

			/*
				O método notify() da classe de encadeamento é usado para ativar um único encadeamento.
				Este método fornece a notificação para apenas um thread que está aguardando um objeto específico.
			*/
			this.n1.notify();
			
			try {
				/*
					O método Object.wait() interrompe a thread atual, ou seja, coloca a mesma para 'dormir'
					até que uma outra thread use o método 'Objec.notify()' no mesmo objeto para 'acordá-la'.
				*/
				this.n1.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + "-> Encontrou um 'notify()', ou seja, Tread Dois sendo executada!");
		}
		
		System.out.println(Thread.currentThread().getName() + " finalizada!");
	}

}