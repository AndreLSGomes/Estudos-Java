package Capitulo_09.ClasseAbstrata;

public class Calculando {

	public static void main(String[] args) {

		// Criar as instâncias das classes 'Quadrado' e 'Triangulo'
		Quadrado  q = new Quadrado(10);
		Triangulo t = new Triangulo(5, 20);
		
		q.calcularArea();
		t.calcularArea();

	}

}
