package Capitulo_09.Heranca;

public class TesteHeranca {

	public static void main(String[] args) {

		/*
		// Instanciando a classe
		Programador junior = new Programador("Mário", "mario@gmail.com", "Java", "Linux / Windows");
		
		// fazendo uso do objeto
		junior.exibir();
		*/
		
		Estagiario estagiario = new Estagiario("José", "Este é o meu relatório", "O total de horas totalizam 370", 5.300);
		estagiario.dadosEstagiario();

	}

}
