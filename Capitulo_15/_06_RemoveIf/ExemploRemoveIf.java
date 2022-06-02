package Capitulo_15._06_RemoveIf;

import java.util.HashSet;
import java.util.Set;

public class ExemploRemoveIf {

	public static void main(String[] args) {

		// Praticando RemoveIf
		
		Set<Produto> produto = new HashSet<>();
		
		produto.add(new Produto("Leite em pó", "Laticínios", 5.80));
		produto.add(new Produto("Cerveja em lata", "Bebidas", 1.89));
		produto.add(new Produto("Detergente", "Limpeza", 2.49));
		produto.add(new Produto("Manteiga", "Laticínios", 2.90));
		produto.add(new Produto("Pasta de dente", "Limpeza", 1.75));
		
		produto.removeIf(p -> p.getPrecoProd() > 2.5);
		
		System.out.println("Lista de produtos: \n");
		produto.forEach(p -> System.out.println("Produto: " + p.getNomeProd()));
		
	}

}
