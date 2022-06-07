package Capitulo_15._09_TesteCollection;

import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {

		// Criando um Vetor de Collections
		Vector<String> vector = new Vector();
		
		// Populando o vetor
		vector.add("Um vetor");
		vector.add("Dois vetores");
		vector.add("Três vetores");
		vector.add("Quatro vetores");
		
		// Criando um iterator
		Iterator<String> it = vector.iterator();
		
		// Percorrendo o Vector Collection
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
