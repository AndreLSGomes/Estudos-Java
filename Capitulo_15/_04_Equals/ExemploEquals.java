package Capitulo_15._04_Equals;

public class ExemploEquals {

	public static void main(String[] args) {

		// Instancias da classe
		Pessoa a = new Pessoa("Rojas", 23);
		Pessoa b = new Pessoa("Idia", 19);
		
		System.out.println(a.getNome() + " tem " + a.getIdade() + " e " + b.getNome() + " tem " + b.getIdade());
		
		System.out.println("\n---------------------------\n");

		System.out.println(a.nome + " é igual a " + b.nome + "? " + a.equals(b));

		a.nome = b.nome;

		System.out.println("\n" + a.nome + " é igual a " + b.nome + "? " + a.equals(b));

		a = b;

		System.out.println("\n" + a.nome + " é igual a " + b.nome + "? " + a.equals(b));

	}

}
