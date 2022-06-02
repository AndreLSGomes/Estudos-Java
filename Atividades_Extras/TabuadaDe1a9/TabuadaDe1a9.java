package Atividades_Extras.TabuadaDe1a9;

public class TabuadaDe1a9 {

	public static void main(String[] args) {

		// Crie um algoritmo, utilizando 20 laços de repetição aninhados, que exiba na tela a tabuada de multiplicação dos números de 1 a 9.
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println("*** Tabuada de multiplicação de " + i + " ***\n");
			
			for (int j = 1; j < 11; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
			System.out.println();
			
		}

		/*
		1. algoritmo "Questao46"
		2. var
		3. i, j, resultado: inteiro
		4. tipo: caractere
		5. inicio
		6. para i de 1 ate 9 faca
		7. escreval("*** Tabuada de multiplicação de ", i, "***")
		8. para j de 1 ate 10 faca
		9. resultado <- i * j
		10. escreval(i, " * ", j ," = ", resultado)
		11. fimpara
		12. fimpara
		13. fimalgoritmo
		*/
		
	}

}
