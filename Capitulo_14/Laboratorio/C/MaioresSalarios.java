package Capitulo_14.Laboratorio.C;

public class MaioresSalarios {

	public static void main(String[] args) {

		double[] salariosBrutos = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		double[] salariosTop;
		
		System.out.print("Salários Brutos:");
		
		salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, (salario) -> salario >= 3000? true:false);

		DoubleArrayUtils.processaValores(salariosBrutos, a -> System.out.println(a));
		
		System.out.println("------------------------------------------------------");
		System.out.print("Salários Brutos:");
		
		DoubleArrayUtils.processaValores(salariosTop, a -> System.out.println(a));
		
		
		/*
			Fazendo em uma única linha
			DoubleArrayUtils.processaValores(DoubleArrayUtils.filtraValores(salariosBrutos, (salario) -> salario >= 3000? true:false), a -> System.out.println(a));
		*/
		
		
		
	}

}