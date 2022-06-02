package Capitulo_09.Laboratorio;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	RG rg;
	
	// Construtor sobrecarga
	public Pessoa(String nome, int idade, char sexo, RG rg) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
	}
	
	// Método falar
	public abstract void falar();
	
	// Método mostrarDados
	public abstract void mostrarDados();
	
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
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
