package Capitulo_14._01_UtilizandoInterface;

	/*
		Esta é a 1ª classe concreta que implementa a classe OperacaoAritimetica
		deve-se implementar o médoto 'execute'
	*/
public class Soma implements OperacaoAritimetica{
	
	public double execute(double value1, double value2) {
		double result = value1 + value2;
		return result;
	}

}
