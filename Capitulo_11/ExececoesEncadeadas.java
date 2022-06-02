package Capitulo_11;

public class ExececoesEncadeadas {
	
	public static void main(String[] ars) {
		try {
			metodo1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 1º método
	public static void metodo1() throws Exception {
		try {
			// Chamando o método 2
			metodo2();
		}
		catch(Exception e) {
			throw new Exception("Exceção descrita no 1º método!");
		}
	}

	// 2º método
	public static void metodo2() throws Exception {
		throw new Exception("Exceção descrita no 2º método!");
	}
	
}