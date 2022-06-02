package Capitulo_15._02_List;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		// Definindo uma List
		List<String> paises = new ArrayList<>();
		
		// Inserindo dados na coleção
		paises.add("Brasil");
		paises.add("Portugal");
		paises.add("Estados Unidos");
		paises.add("França");
		paises.add("Inglaterra");
		paises.add(2, "Itália");
		
		// Exibindo valores
		System.out.println("Paises na ordem original:");
		paises.forEach(pais -> System.out.println(" - " + pais));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Verifica se o ArrayList contem 'Estados Unidos'
		System.out.println("Estados Unidos está no ArrayList: " + paises.contains("Estados Unidos"));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Imprimindo uma determinada posição do ArrayList
		System.out.println("O país que está na posição 2 do ArrayList é: " + paises.get(2));
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Imprimindo a posição do país 'França'
		System.out.println("A França está na posição " + paises.indexOf("França") + " do ArrayList");
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Verificando o tamanho do ArrayList
		System.out.println("O tamanho do ArrayList é de " + paises.size() + " posições.");
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Substituindo todos os elementos do ArrayLista para maiúculo
		paises.replaceAll(s -> s.toUpperCase());
		
		// Reordenando toda a lista utilizando a ordem natural de Strings
		paises.sort((x, y) -> x.compareTo(y));
		
		System.out.println("Países ordenados e em maiúsculo:");
		paises.forEach(pais -> System.out.println(paises.indexOf(pais) + " -> " + pais));
	}

}
