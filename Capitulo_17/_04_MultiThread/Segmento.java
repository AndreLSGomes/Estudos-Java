package Capitulo_17._04_MultiThread;

public class Segmento extends Thread {

	private String mensagem;
	private Object lock = true;
	
	public Segmento(String mensagem) {
		run(mensagem);
	}

	public Segmento() {
		super();
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void run(String mensagem) {
		synchronized(lock) {
			for(int i = 0; i <5; i++) {
				System.out.println(mensagem);
			}
		}
	}
	
	public void run() {
		synchronized(lock) {
			for(int i = 0; i <5; i++) {
				System.out.println("11111111111111111");
			}
		}
	}
	
	
	
	
}
