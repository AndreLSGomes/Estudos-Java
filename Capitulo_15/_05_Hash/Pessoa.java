package Capitulo_15._05_Hash;

public class Pessoa {
	
	String nome;
	int idade;
	
	// Construtor
	public Pessoa(String n, int i) {
		nome  = n;
		idade = i;
	}
	
	// Métodos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
