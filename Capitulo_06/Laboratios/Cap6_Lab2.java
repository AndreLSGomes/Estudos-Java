package Capitulo_06.Laboratios;

public class Cap6_Lab2 {

	public static void main(String[] args) {

		Calculadora2 calc = new Calculadora2();

		System.out.println("Métodos subtrair com sobrecarga:");
		System.out.println("Chamando a versão subtrair com 2 double = " + calc.subtrair(6.2, 2.1));
		System.out.println("Chamando a versão subtrair com 1 inteiro e 1 double = " + calc.subtrair(6, 2.1));
		System.out.println("Chamando a versão subtrair com 1 double e 1 ionteiro = " + calc.subtrair(6.2, 2));

	}
}
