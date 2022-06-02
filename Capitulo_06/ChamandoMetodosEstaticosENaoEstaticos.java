package Capitulo_06;

public class ChamandoMetodosEstaticosENaoEstaticos {
	
	// Declarando um método dentro da classe
	static void novoEstatico() {
		System.out.println("Este conteúdo está declarado no método da classe principal");
	}

	public static void main(String[] args) {

		// Chamando o método estático sem instanciá-lo
		MetodosEstaticosEMetodosNaoEstaticos.metodoEstatico();
		
		// Chamando o método não estático (necessário instanciá-lo)
		new MetodosEstaticosEMetodosNaoEstaticos().metodoNaoEstatico();
		
		// Chamando o método declarado na mesma classe
		novoEstatico();
		
	}
}