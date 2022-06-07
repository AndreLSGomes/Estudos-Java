package Capitulo_17._09_TesteThread;

public class Main {
	
	public static void main(String[] args) {
		
		// Criando os objetos do tipo Thread
		Thread_1 objUm   = new Thread_1();
		Thread_2 objDois = new Thread_2();
		
		// Iniciando as Thread
		objUm.start();
		objDois.start();
	}

}
