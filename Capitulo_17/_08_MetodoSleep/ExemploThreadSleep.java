package Capitulo_17._08_MetodoSleep;

public class ExemploThreadSleep {
	
	public static void main(String[] args) {
		
		// Iniciando uma nova Thread
		Thread fofinho = Thread.currentThread();
		
		System.out.println("[nome, mudou de prioridade, mesmo grupo]: " + fofinho);
		
		// Alterando o nome da Thread
		fofinho.setName("Teste");
		
		// Setando a prioridade da Thread fofinho
		fofinho.setPriority(8);
		
		System.out.println("[nome, prioridade, mesmo grupo]: " + fofinho);
		
		try {
			for (int x =1; x < 10; x++) {
				System.out.println(x + "ª iteração");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
