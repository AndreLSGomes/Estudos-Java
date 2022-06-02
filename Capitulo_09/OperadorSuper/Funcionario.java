package Capitulo_09.OperadorSuper;

public class Funcionario {

	// Definindo a classe Funcionario
	
	/* As variáveis e métodos podem ser acessados pela sua própria
		classe e subclasses (não se preocupe, em breve você entenderá o que são
		subclasses);
	*/
	protected String nome;
	protected String email;
	int idade;
	char sexo;
	
	// Construtor padrão
	public Funcionario() {
	}
	
	// Sobrecarga no Construtor
	public Funcionario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

}
