package Capitulo_17._04_MultiThread;

public class ExemploRunnable extends Thread implements Runnable{

	private String umaMensagem;
	private Object lock = true;

	public ExemploRunnable(String umaMensagem) {
		run(umaMensagem);
	}

	public ExemploRunnable() {
		super();
	}

	public String getMensagem() {
		return umaMensagem;
	}

	public void setMensagem(String mensagem) {
		this.umaMensagem = mensagem;
	}
	
	public void run() {
		synchronized(lock) {
		for(int i = 0; i <5; i++) {
			System.out.println("333333333333333333");
		}
		}
	}
	
	public void run(String umaMensagem) {
		synchronized(lock) {
			for(int i = 0; i <5; i++) {
				System.out.println(umaMensagem);
			}
		}
	}
	
	
}
