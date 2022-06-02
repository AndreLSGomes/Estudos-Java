package Capitulo_07.Laboratorios;

public class Laboratorio_1_Cadastro {
	private String nome;
	private String sobrenome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//  Construtor padrão
	public Laboratorio_1_Cadastro() {
	}
	
	// Construtor 
	public Laboratorio_1_Cadastro(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	// Construtor Padrão
	public void Laboratorio_1_Cadastro1() {
	}
	
	// Construtor_1
	public void Laboratorio_1_Cadastro1(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	// Construtor_2
	public Laboratorio_1_Cadastro(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// Criando método para exibir os valores
	public void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade + "\n");
	}
	
}
