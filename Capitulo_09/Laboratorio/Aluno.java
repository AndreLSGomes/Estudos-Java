package Capitulo_09.Laboratorio;

public class Aluno extends Pessoa{

	private float mensalidade;
	private String curso;
	
	public Aluno(int numRG, String nasc, String nome, int idade, char sexo, String curso, float mensalidade) {
		super(nome, idade, sexo, new RG(numRG, nasc));
		this.curso = curso;
		this.mensalidade = mensalidade;
	}

	// Método falar
	public void falar() {
		System.out.print("-> " + this.getNome() + " Presente!\n\n");
	}

	public void mostrarDados() {
		System.out.println("--------------- Aluno: " + super.getNome() + " -------------------");
		System.out.println("O RG do aluno é: " + + rg.getNumero());
		System.out.println("A data de nascimento do aluno é: " + rg.getDataNasc());
		System.out.println("A idade do aluno é: " + super.getIdade());
		System.out.println("O sexo do aluno é " + super.getSexo());
		System.out.println("O curso em que oaluno está matriculado é " + this.curso);
		System.out.println("A mensalidade paga pelo aluno é: " + this.mensalidade);
		System.out.println("-------------------------------------------------\n");
	}

	// Métodos acessores
	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
