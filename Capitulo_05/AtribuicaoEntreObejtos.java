package Capitulo_05;

public class AtribuicaoEntreObejtos {

	public static void main(String[] args) {
		
		// Instanciando a classe pessoa
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.genero = 'M';
		joao.idade = 44;
		
		maria.genero = 'F';
		maria.idade = 17;


		System.out.println("João tem o gênero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("Maria tem o gênero \'" + maria.genero + "\' e tem " + maria.idade + " anos.");
		System.out.println("\n------------------------------------");
		
		// AtribuiÃ§Ã£o entre objetos distintos
		joao = maria;
		System.out.println("\nJoão tem o gênero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("\n------------------------------------\n");
		
		// AtruibuiÃ£o valores a atrituos de um objeto
		joao.genero = 'M';
		System.out.println("João tem o gênero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("Maria tem o gênero \'" + maria.genero + "\' e tem " + maria.idade + " anos.");
		System.out.println("\n------------------------------------\n");

		maria.idade = 50;
		maria.genero = 'F';
		System.out.println("João tem o gênero \'" + joao.genero + "\' e tem " + joao.idade + " anos.");
		System.out.println("Maria tem o gênero \'" + maria.genero + "\' e tem " + maria.idade + " anos.");
		System.out.println("\n------------------------------------");
	}
}