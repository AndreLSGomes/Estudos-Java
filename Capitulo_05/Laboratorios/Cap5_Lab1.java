package Capitulo_05.Laboratorios;

public class Cap5_Lab1 {

	public static void main(String[] args) {

		// Declarando um objeto do tipo Funcionario e o instancie
		Laboratorio_1 func = new Laboratorio_1();
		
		// Determinando valores para os atributos nome, sobrenome, cargo e salario do objeto criado
		func.nome = "João";
		func.sobrenome = "Souza";
		func.cargo = "Gerente";
		func.salario = 13845.25;
		
		//Imprima os atributos do objeto na tela
		System.out.print("O funcionário \'" + func.nome + " " + func.sobrenome + "\' tem o cargo de \'" + func.cargo + "\' e seu salário é de R$" + func.salario);
	}

}
