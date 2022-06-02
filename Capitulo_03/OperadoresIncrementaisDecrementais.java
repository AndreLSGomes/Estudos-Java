package Capitulo_03;
/**
 * Incremental -> ++a
 * Incremental ou prefixo, se o sinal for antes da variavel, seu valor será aumentado em 1.
 * 
 * Pós-incremental -> a++
 * Pós-incremental ou sufixo, se o sinal for depois da variavel, a expressão será resolvida 
 * primeiro e, em seguida, o valor da variavel será¡ aumentada em um.
 */

public class OperadoresIncrementaisDecrementais {

	public static void main(String[] args) {

		int x = 4;
		
		// incremento com mais de uma casa.
		System.out.println("Incremento com mais de uma casa : " + (x+=5));
		
		System.out.println("Incremento de X = " + (x++));
		System.out.println("Incremento de X = " + (++x));
		System.out.println("Incremento de X = " + (x--));
		System.out.println("Incremento de X = " + (--x));

	}

}
