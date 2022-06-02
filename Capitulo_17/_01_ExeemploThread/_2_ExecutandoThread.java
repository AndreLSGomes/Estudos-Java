package Capitulo_17._01_ExeemploThread;

public class _2_ExecutandoThread extends Thread{

	// Atributo
	private String mensagem;

	// Construtor
	public _2_ExecutandoThread(String texto) {
		this.mensagem = texto;
	}

	// sobrescrevendo run()
	public void run() {

		// Loop para iterar por valores
		while(true) {
			System.out.println(mensagem);
		}

	}

	public static void main(String[] args) {

		// Instanciando a classe ExemploExtendendoThread e chamando o método run() sobrescrito
		_2_ExecutandoThread obj = new _2_ExecutandoThread("Executando uma Thread??");

		obj.start();
		while(true) {
			System.out.println("Executando a thread principal.....");
		}

	}

}