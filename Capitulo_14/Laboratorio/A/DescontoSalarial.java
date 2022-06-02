package Capitulo_14.Laboratorio.A;

public class DescontoSalarial {

	public static void main(String[] args) {

		double[] salariosBrutos = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		double[] salariosLiquidos;
		
		// Usando uma interface
		InterfaceTransformaValores desconto = DoubleArrayUtils::transformaValores;
		salariosLiquidos = desconto.executa(salariosBrutos, a -> a - (a * 0.1));

		/*
			Sem utilizar uma interface pois DoubleUnaryOperator já é uma interface
			salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, (salario) -> salario - (salario * 0.1));
		*/
		
		// Exibindo salariosLiquidos
		for (int i = 0; i < salariosLiquidos.length; i++) {
			System.out.println(salariosBrutos[i] + " descontado de 10% = " + salariosLiquidos[i]);
		}
		
	}

}