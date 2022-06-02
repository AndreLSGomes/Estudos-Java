package Capitulo_14._07_UtilizandoLambda;

public class ExecutandoFunc5 {

	public static void main(String[] args) {

		ExemploFunc5 calculo = recebedor -> {
			double temporaria = recebedor * 4;
			return temporaria;
		};
		
		double resultado = calculo.quadruplo(6.5);
		System.out.println("Resultado do cálculo: " + resultado);

		/*
		ExecutandoFunc5 calculo = recebedor -> recebedor * 4;
		System.out.println("Resultado = " + calculo.quadruplo(25));
		*/

	}

}