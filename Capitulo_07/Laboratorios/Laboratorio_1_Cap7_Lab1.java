package Capitulo_07.Laboratorios;

public class Laboratorio_1_Cap7_Lab1 {
	
	public static void main(String[] args) {
		
		Laboratorio_1_Cadastro pessoa1 = new Laboratorio_1_Cadastro();
		Laboratorio_1_Cadastro pessoa2 = new Laboratorio_1_Cadastro("André", "Gomes");
		Laboratorio_1_Cadastro pessoa3 = new Laboratorio_1_Cadastro("André", "Gomes", 36);
		
		pessoa1.mostrar();
		pessoa2.mostrar();
		pessoa3.mostrar();
		
	}

}