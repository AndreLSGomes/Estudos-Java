package Capitulo_09.ClasseAbstrata;

public class Quadrado extends Poligono {
	
	// Criando os atributos
	private double lado;
	
	// Construtor da classe
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	// Acesso ao método abstrado da classe Polígono
	public double calcularArea() {
		double resultado = lado * lado;
		System.out.println("Área do quadrado: " + resultado);
		return resultado;
	}

}
