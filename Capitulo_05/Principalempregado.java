package Capitulo_05;

public class Principalempregado {

	public static void main(String[] args) {
		// Criando a instância da classe Empregado
		Empregado emp = new Empregado();
		
		// Chamada do método setEndereco
		emp.setEndereco("Centro");
		
		// Chamada do método setIdade
		emp.setIdade(40);
		
		// Chamada da função / método mostrar
		System.out.println(emp.mostrar());

	}

}
