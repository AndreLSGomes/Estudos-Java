package Capitulo_02;

public class TiposDeDados {
	
	//Exemplos de Enum
	public enum DiaDaSemana{SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;}

	public static void main(String[] args) {

		// Tipos de dados primitivos
		/*
		 * Java é uma linguagem fortemente tipada
		 * Há duas categorias de tipos em Java:
		 * -> Tipos primitivos: Incluem tipos numéricos (byte, short, int, long, float e double), textuais (char) e booleanos (boolean).
		 * -> Tipos de referência: Os valores desse tipo são referências a objetos. Os tipos de referência incluem tipos de classe, de interface e de array.
		*/
		
		// Literais
		/*
		 * Um literal é uma representação, em código-fonte, de um valor fixo. Eles não
		 * necessitam de nenhuma operação computacional para serem representados,
		 * isso acontece de forma direta no código. Os literais podem ser atribuídos a
		 * variáveis de um tipo primitivo, como mostra o seguinte exemplo:
		 */
		byte b = 100;
		short s = 100;
		int i = 100;
		long l = 922345678;
		float f = 0.12F;
		double d = 1.32;
		char c = 'M';
		boolean bo = true;
		
		System.out.println("Byte a = " + b);
		System.out.println("short s = " + s);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("char c = " + c);
		System.out.println("boolean bo = " + bo);
		
		// ENUM
		DiaDaSemana diaBom = DiaDaSemana.SABADO;
		System.out.println("\nDia bom é o: " + diaBom.name());
	}

}
