package Capitulo_15.Laboratorio.Lab1;

import java.util.HashMap;


public class Cap15_Lab01 {

	public static void main(String[] args) {

		// Criando um objeto HashMap
		HashMap<String, Integer> pessoaMap = new HashMap<>();
		
		// Populando o HashMap pessoaMap
		pessoaMap.put("André", 30);
		pessoaMap.put("Pedro", 35);
		pessoaMap.put("Élida", 31);
		pessoaMap.put("Rafaela", 28);
		
		// Exibindo os resultados
		pessoaMap.forEach((chave, valor) -> System.out.println(chave + ": " + pessoaMap.get(chave)));
		
		/*
			Outra forma
			pessoaMap.forEach((chave, valor) -> System.out.println(chave + ": " + valor));
		*/
		
		/*
			Ou
			for(String k : pessoaMap.keySet()) {
	            System.out.println(k + ": " + pessoaMap.get(k));
	        }
		*/

	}

}