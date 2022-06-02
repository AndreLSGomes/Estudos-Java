package Capitulo_09.Heranca;

public class Programador extends Funcionario {

	/*
	 private: Somente a própria classe pode acessar variáveis e métodos. É o
	 nível mais restrito de encapsulamento.
	*/
	private String linguagemProgramacao;
	private String sistemaOperacional;
	double salario;
	
	// Construtor padrão
	public Programador() {}
	
	// Sobrecarga no Construtor
	public Programador(String n, String e, String linguagem, String so) {
		// Acessando os atributos herdados e as particulares desta classe
		nome = n;
		email = e;
		this.linguagemProgramacao = linguagem;
		this.sistemaOperacional = so;
	}

	// Criando métodos acessors (getters e setters)
	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}

	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Método para exibição do conteúdo
	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Linguagem de programacao: " + linguagemProgramacao);
		System.out.println("Sistema operacional: " + sistemaOperacional + "\n");
	}
	
}
