package Capitulo_15._05_Hash;


public class ExemploHash {

	public static void main(String[] args) {

		// Instancias da classe
		Pessoa a = new Pessoa("Rojas", 23);
		Pessoa b = new Pessoa("Idia", 19);

		System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.hashCode() == b.hashCode()));

		System.out.println("\n" + a.nome + " é igual a " + b.nome + "? " + (a.hashCode() == b.hashCode()));

		a = b;

		System.out.println("\n" + a.nome + " é igual a " + b.nome + "? " + (a.hashCode() == b.hashCode()));

	}

}
