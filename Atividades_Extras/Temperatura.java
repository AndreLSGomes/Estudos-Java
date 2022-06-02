package Atividades_Extras;

public class Temperatura {

	public static void main(String[] args) {

		/* Escreva um algoritmo em java que, com base em uma temperatura em graus celsius, a converta e exiba em:
		 * Kelvin (K),
		 * Réaumur (Re),
		 * Rankine (Ra)
		 * Fahrenheit (F),
		 * seguindo as fórmulas:
		 * -> F = C * 1.8 + 32
		 * -> K = C + 273.15
		 * -> Re = C * 0.8
		 * -> Ra = C * 1.8 + 32 + 459.67
		 */
		
		double temperatura = 2.43;
	    
        double F = temperatura * 1.8 + 32;
        double K = temperatura + 273.15;
        double Ra = temperatura * 1.8 + 32 + 459.67;
        double Re = temperatura * 0.8;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);

	}

}
