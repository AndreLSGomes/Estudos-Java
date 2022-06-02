package Capitulo_08.Laboratorios;

public class Cap8Lab02 {

	public static void main(String[] args) {

		if (args.length > 0) {
			int soma = 0;
			
			for (int i = 0; i < args.length; i++) {
				soma += Integer.parseInt(args[i]);
			}
			
			double media = soma / args.length;
			
			System.out.print("A média das idades ");
			
			for (int i = 0; i < args.length; i++) {
				System.out.print("\'" + args[i] + "\'");
				if (i < args.length-2) {
					System.out.print(", ");
				}
				else if (i < args.length-1) {
					System.out.print(" e ");
				}
			}
			
			System.out.print(" é de " + media + " anos.");
		}
		else {
			System.out.println("Entre com valores válidos para as idades");;
		}
	}
}
