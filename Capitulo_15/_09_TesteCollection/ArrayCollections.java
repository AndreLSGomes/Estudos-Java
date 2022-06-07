package Capitulo_15._09_TesteCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollections {

	public static void main(String[] args) {

		// Criando um ArrayList
		ArrayList<String> lista = new ArrayList<String>();
		
		// Populando o ArrayList
		lista.add("Um texto");
		lista.add("Dois textos");
		lista.add("Três textos");
		
		// Operador Iterator
		Iterator textos = lista.iterator();
		
		// Percorrendo o ArrayList
		while(textos.hasNext()) {
			System.out.println(textos.next());
		}

	}

}
