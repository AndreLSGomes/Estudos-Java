package Capitulo_17._08_Sincronizacao.NotifyWayt_2;

public class NotificacaoDois extends Thread{
	
	NotificacaoUm n1;
	
	// Construtor
	public NotificacaoDois(NotificacaoUm n1) {
		this.n1 = n1;
	}
	
	// Sobrescrevendo o m�todo run()
	public void run() {
		synchronized(this.n1){
			System.out.println(Thread.currentThread().getName() + "-> t2.start() foi alcan�ado!");

			/*
				O m�todo notify() da classe de encadeamento � usado para ativar um �nico encadeamento.
				Este m�todo fornece a notifica��o para apenas um thread que est� aguardando um objeto espec�fico.
			*/
			this.n1.notify();
			
			try {
				/*
					O m�todo Object.wait() interrompe a thread atual, ou seja, coloca a mesma para 'dormir'
					at� que uma outra thread use o m�todo 'Objec.notify()' no mesmo objeto para 'acord�-la'.
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