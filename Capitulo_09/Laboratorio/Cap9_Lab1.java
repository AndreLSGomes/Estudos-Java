package Capitulo_09.Laboratorio;

public class Cap9_Lab1 {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(521234567, "15/06/1993", "Manuel", 19, 'M', "Ciência da computação", 1099);
		Aluno aluno2 = new Aluno(415678912, "12/08/1990", "Cláudia", 22, 'F', "Administração", 799);
		
		RG rg = new RG(261454789, "05/02/1974");

		// int numRG, String nasc, String nome, int idade, char sexo, String disciplina, float salario
		Professor professor = new Professor("Rafael", 38, 'M', rg, "Português", 2500);
		
		// Realizando chamada para a aula
		professor.falar();
		System.out.println(aluno1.getNome() + "? ");
		aluno1.falar();

		professor.falar();
		System.out.println(aluno1.getNome() + "? ");
		aluno2.falar();
		
		System.out.println();
		
		// Exibindo os dados do professor e alunos
		professor.mostrarDados();
		aluno1.mostrarDados();
		aluno2.mostrarDados();
	}
}