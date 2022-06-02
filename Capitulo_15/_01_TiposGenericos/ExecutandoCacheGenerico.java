package Capitulo_15._01_TiposGenericos;

public class ExecutandoCacheGenerico {

	public static void main(String[] args) {

		// Declarando e instanciando a classe generics
		CacheGenerico<String> cacheNome       = new CacheGenerico<>();
		CacheGenerico<Integer> cachePortfolio = new CacheGenerico<>();

		// Atribuição de valores
		cacheNome.setValor("Impacta Treinamentos");
		cachePortfolio.setValor(56);

		//Exibindo
		System.out.println("Nome     : " + cacheNome.getValor());
		System.out.println("Portfolio: " + cachePortfolio.getValor());

	}

}
