package Capitulo_06.Laboratios;

public class Aluno {

	public static int contadorDeAlunos;
	private String nome;
	
	public int getContador() {
		return Aluno.contadorDeAlunos;
	}
	public void setContador() {
		Aluno.contadorDeAlunos++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		this.setContador();
	}
	
	public void imprimeAluno() {
		System.out.println("Aluno: " + this.getNome());
		System.out.println("Contagem no objeto " + this.getNome() + ": " + this.getContador() + ".\n");
	}

}
