package Capitulo_17._08_Sincronizacao.NotifyWayt_2;

	/*
		Fonte-> https://www.devmedia.com.br/java-threads-utilizando-wait-notify-e-notifyall/29545
		        https://www.javatpoint.com/java-thread-notify-method
	*/

public class NotificacaoUm extends Thread{
	
	// sobrescrevendo o método run()
	public void run() 
	{
		synchronized(this) 
		{
			System.out.println(Thread.currentThread().getName() + "-> t1.start() foi alcançado!");

			try 
			{
				/*
					O método Object.wait() interrompe a thread atual, ou seja, coloca a mesma para 'dormir'
					até que uma outra thread use o método 'Objec.notify()' no mesmo objeto para 'acordá-la'.
				*/
				this.wait();
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-> Encontrou um 'notify()', ou seja, Tread Um sendo executada e Thread dois está suspensa!");
		}
		
		System.out.println(Thread.currentThread().getName() + " finalizada!");
	}

}