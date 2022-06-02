package Capitulo_06.Laboratios;

public class Calculadora2 {
	
	public int somar(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	// SOBRECARGA
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	public double subtrair(int valor1, double valor2) {
		return valor1 - valor2;
	}
	public double subtrair(double valor1, int valor2) {
		return valor1 - valor2;
	}

}