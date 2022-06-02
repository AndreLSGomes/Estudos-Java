package Capitulo_06.Laboratios;

public class Cap6_Lab3 {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("joao");
		aluno1.imprimeAluno();
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("maria");
		aluno2.imprimeAluno();
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("marcos");
		aluno2.imprimeAluno();
		
		System.out.println("Contador acessado diretamente da classe Aluno: " + Aluno.contadorDeAlunos + ".");
		
	}
}