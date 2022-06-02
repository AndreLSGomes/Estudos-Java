package Capitulo_08;

public class CadastroUnidimensional {

	public static void main(String[] args) {

		ArrayUnidensional_Pessoa pessoas[] = new ArrayUnidensional_Pessoa[2];
		
		pessoas[0] = new ArrayUnidensional_Pessoa();
		pessoas[0].altura = 1.68;
		pessoas[0].peso   = 55;

		System.out.println("pessoas[0]:");
		System.out.println(pessoas[0].altura);
		System.out.println(pessoas[0].peso);
		System.out.println("\n-----------\n");
		
		pessoas[1] = new ArrayUnidensional_Pessoa();
		pessoas[1].altura = 1.77;
		pessoas[1].peso   = 60;
		
		System.out.println("pessoas[1]:");
		System.out.println(pessoas[1].altura);
		System.out.println(pessoas[1].peso);
		System.out.println("\n-----------\n");
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Array pessoas[" + i + "].atributo -> Altura: " + pessoas[i].altura);
			System.out.println("Array pessoas[" + i + "].atributo -> Peso: " + pessoas[i].peso+ "\n");
		}

	}
}
