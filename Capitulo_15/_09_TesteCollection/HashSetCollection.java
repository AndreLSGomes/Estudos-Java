package Capitulo_15._09_TesteCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {

		// Criando uma HashSet Collection
		HashSet<String> conjunto = new HashSet();
		
		// Populando o HashSet Collection
		conjunto.add("3");
		conjunto.add("2");
		conjunto.add("1");
		conjunto.add("1");
		
		// Iterator
		Iterator it = conjunto.iterator();
		
		// Populando um HashSet Collection
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
