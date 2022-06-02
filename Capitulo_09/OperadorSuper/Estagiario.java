package Capitulo_09.OperadorSuper;

public class Estagiario extends Programador{
	String relatorio;
	String horas;
	
	// Construtor padrão
	public Estagiario() {}

	// Sobrecarga no Construtor
	public Estagiario(String nome, String relatorio, String horas, Double salario) {
		this.nome = nome;
		super.setSalario(salario);
		this.relatorio = relatorio;
		this.horas = horas;
	}
	
	public void dadosEstagiario() {
		System.out.println("Nome do estagiário: " + nome);
		System.out.println("Salário do estagiário: " + super.getSalario());
		System.out.println("Informações sobre o relatório: "  + relatorio);
		System.out.println("Quantidade de horas: "  + horas);
	}

}
