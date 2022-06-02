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
		Thread t3 = new Thread(n3, "Tread Tr�s");
		
		// Inicializando as Threads
		t1.start();
		
		/*
			O m�todo sleep() � usado para parar a execu��o do thread atual (o que quer que esteja em execu��o no sistema)
			por um per�odo espec�fico de tempo e, ap�s esse per�odo de tempo terminar, o thread que est� executando antes
			come�a a executar novamente.
		*/
		Thread.sleep(3000);
		t2.start();
		Thread.sleep(3000);
		t3.start();

	}

}