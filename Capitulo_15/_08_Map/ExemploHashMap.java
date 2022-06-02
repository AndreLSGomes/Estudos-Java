package Capitulo_15._08_Map;

import java.util.HashMap;

public class ExemploHashMap {

	public static void main(String[] args) {

		// Praticando RemoveIf
		
		HashMap<String, Produto> mapProduto = new HashMap<>();
		
		mapProduto.put("Leite     ", new Produto("Leite em pó ", "Laticínios", 5.80));
		mapProduto.put("Cerveja   ", new Produto("Cerveja lata", "Bebidas   ", 1.89));
		mapProduto.put("Detergente", new Produto("Detergente  ", "Limpeza   ", 2.49));
		mapProduto.put("Manteiga  ", new Produto("Manteiga    ", "Laticínios", 2.90));
		mapProduto.put("Creme     ", new Produto("Creme dental", "Limpeza   ", 1.75));
		mapProduto.put("Sabonete  ", new Produto("Sabonete    ", "Higiente  ", 0.99));
	
		// Verificando um determinado produto
		System.out.println(mapProduto.containsKey("Cerveja"));
		
		// Obtendo um produto através da key
		System.out.println(mapProduto.get("Manteiga"));
		
		// Removendo um produto
		mapProduto.remove("Detergente");
		
		// Quantidade de produtos
		System.out.println(mapProduto.size());
		
		System.out.println("\n----------------------------------------------------\n");
		
		// Exibir todos os produtos do map
		mapProduto.forEach((chave, valor) -> System.out.println(valor));

	}

}
