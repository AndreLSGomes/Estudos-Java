package Capitulo_15._09_TesteCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {

		// Criando uma LinkedList
		LinkedList<String> link = new LinkedList<>();

		// Populando uma LinkedList
		link.add("Uma string");
		link.add("Duas strings");
		link.add("Três strings");
		link.add("Quatro string");
		
		// Criando um Iterator
		Iterator<String> lk = link.iterator();
		
		// Percorrendo uma LinkedList
		while(lk.hasNext()) {
			System.out.println(lk.next());
		}
	}

}
