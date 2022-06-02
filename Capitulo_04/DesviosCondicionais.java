package Capitulo_04;

public class DesviosCondicionais {

	public static void main(String[] args) {

		// Exemplo IF
		int x = 10;
		if(x < 15) {
			System.out.println("Exemplo IF");
			System.out.println("X é menor do que 15");
			System.out.println("O valor de X =" + x + "\n");
		}
		
		// Exemplo IF ELSE
		int y = 16;
		if(y < 15) {
			System.out.println("Exemplo IF ELSE");
			System.out.println("Y é menor do que 15");
			System.out.println("O valor de Y =" + x);
		}
		else {
			System.out.println("Exemplo IF ELSE");
			System.out.println("Y é maior do que 15");
			System.out.println("O valor de Y =" + x);
		}
		
		// Exemplo IF ELSE em cascata
		int hora = 17;
		System.out.println("\nExemplo IF ELSE em cascata");
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		// SWITCH
		int mes = 7;
		System.out.println("\nExemplo SWITCH");
		switch(mes) {
			case 1: System.out.println("Janeiro"); break;
			case 2: System.out.println("Fevereiro"); break;
			case 3: System.out.println("MarÃ§o"); break;
			case 4: System.out.println("Abril"); break;
			case 5: System.out.println("Maio"); break;
			case 6: System.out.println("junho"); break;
			case 7: System.out.println("Julho"); break;
			case 8: System.out.println("Agosto"); break;
			case 9: System.out.println("Setembro"); break;
			case 10: System.out.println("Outubro"); break;
			case 11: System.out.println("Novembro"); break;
			case 12: System.out.println("Dezembro"); break;
		}
		
		
		// SWITCH utilizando valor default
		String pais = "Argentina";
		System.out.println("\nSWITCH utilizando valor default");
		switch(pais) {
			case "Brasil":
			case "Portual":
				System.out.println("Bom dia!");
				break;
			case "FranÃ§a":
				System.out.println("Bon Jour!");
				break;
			case "MÃ©xico":
			case "Argentina":
			case "Espanha":
				System.out.println("Buenos dia!");
				break;
			default:
				System.out.println("Good morning!");
		}
	}
}
