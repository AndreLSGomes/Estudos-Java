package Capitulo_15.Laboratorio.Lab1;


public class Pessoa {
	
	// Atributos
	private String nome;
	private int idade;
	
	// Construtor
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
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
