package Capitulo_17._08_Sincronizacao.NotifyWayt_2;

public class PraticandoInstancias {

	public static void main(String[] args) throws InterruptedException{

		// Instanciando as classes Notificacao1, Notificacao2, Notificacao3
		NotificacaoUm   n1 = new NotificacaoUm();
		NotificacaoDois n2 = new NotificacaoDois(n1);
		NotificacaoTres n3 = new NotificacaoTres(n1);
		
		// Criando as Threads
		Thread t1 = new Thread(n1, "Tread Um");
		Thread t2 = new Thread(n2, "Tread Dois");
		Thread t3 = new Thread(n3, "Tread Três");
		
		// Inicializando as Threads
		t1.start();
		
		/*
			O método sleep() é usado para parar a execução do thread atual (o que quer que esteja em execução no sistema)
			por um período específico de tempo e, após esse período de tempo terminar, o thread que está executando antes
			começa a executar novamente.
		*/
		Thread.sleep(3000);
		t2.start();
		Thread.sleep(3000);
		t3.start();

	}

}