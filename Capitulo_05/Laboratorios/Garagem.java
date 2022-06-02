package Capitulo_05.Laboratorios;

public class Garagem {

	// Crie dois atributos do tipo Carro nessa classe e nomeie-os de carroPasseio e carroUtilitario
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();

	public static void main(String[] args) {
		
		// instancie um objeto do próprio tipo Garagem com o nome de 'g'
		Garagem g = new Garagem();
		
		// Configure valores adequados a sua escolha para os atributos de cada um dos objetos do tipo Carro criados na classe Garagem
		g.carroPasseio.modelo = "Honda Civic";
		g.carroPasseio.potencia = 2.3;
		g.carroPasseio.cor = "Prata";
	
		g.carroUtilitario.modelo = "Ford Transit";
		g.carroUtilitario.potencia = 3.8;
		g.carroUtilitario.cor = "Prata";
		
		// Imprima na tela os atributos de cada um dos carros criados
		System.out.println("CARRO DE PASSEIO:");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potencia: " + g.carroPasseio.potencia + "\n");

		System.out.println("-------------------\n");

		System.out.println("CARRO UTILITARIO:");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potencia: " + g.carroUtilitario.potencia);
	}
}
