package Capitulo_06;

public class SobrecargaDeMetodos {
	
	// Métodos de sobrecarga
	static void mostrar(int valor) {
		System.out.println("O valor informado = " + valor);
	}
	
	static void mostrar(String nome) {
		System.out.println("O valor informado = " + nome);
	}

	static void mostrar() {
		System.out.println("Nada foi informado!");
	}
	
	public static void main(String[] args) {

		mostrar(5);
		mostrar("Teste");
		mostrar();
	}
}
