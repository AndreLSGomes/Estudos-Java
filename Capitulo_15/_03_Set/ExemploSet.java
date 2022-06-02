package Capitulo_15._03_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {

		// Operação com TreeSet
		TreeSet<String> treinamentos = new TreeSet<>();
		
		// Fazendo uso do Conjunto TreeSet
		treinamentos.add("Java");
		treinamentos.add("Javascript");
		treinamentos.add("SQL");
		treinamentos.add("ASP.NET");
		treinamentos.add("C#");
		
		// Fazendo uso do iterator
		Iterator<String> iteradora = treinamentos.iterator();
		System.out.println("Treinamentos ordenados por ordem alfabética:");
		
		// Loop para exibir os valores
		while (iteradora.hasNext()){
			String nomeTreinamento = iteradora.next();
			System.out.println("Curso -> " + nomeTreinamento);
		}

	}

}
