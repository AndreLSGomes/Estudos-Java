package Capitulo_04;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {

		// While
		System.out.println("WHILE");
		int num = 0;
		while (num < 10) {
			num++;
			System.out.println("O valor de num é: " + num);
		}

		// Do While
		System.out.println("\nDO WHILE");
		int x = 15;
		do {
			System.out.println("O valor de x é: " + x);
			x++;
		}while (x <= 20);
		
		// FOR
		System.out.println("\nFOR");
		for(int a = 1, b = 10; ((a < 10) && (b > 5)); a++){
			System.out.println("a = " + a + " b = " + b);
		}
		
		// FOR ANINHADO
		System.out.println("\nFOR ANINHADO");
	    for(int i = 1; i <= 3; i++) {
	    	for(int j = 1; j <= 3; j++) {
	        	System.out.println("i: " + i + " e " + "j: " + j);
	        }
	    	System.out.println("-------------------------------");
	    }
	    
	    // FOR ANINHADO
	    System.out.println("\nFOR ANINHADO - Outro exemplo");
	    for(int i = 1; i <= 8; i++) {
	        for(int j = 1; j <= i; j++) {
	        	System.out.print("* ");
	        }
        	System.out.println();
	    }
	}
}
