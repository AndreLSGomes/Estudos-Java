package Atividades_Extras;

public class TransformandoNomeEmAbreviatura {

	public static void main(String[] args) {
		
		/*Escreva um algoritmoem Java que receba um nome completo na forma de uma String e
		  mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
		  menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
		  Almeida Prado. Abreviatura: P. J. de A. P.
		*/

		String nome = "Pedro Luiz de Santos Gomes";
		String abreviatura = "";
		
		for (int i = 0; i < nome.length(); i++) {
			
			//caractere = nome.charAt(i);
			
			if (i == 0) {
				abreviatura = abreviatura + nome.charAt(i) + ". ";
			}
			else if (nome.charAt(i-1) == ' ' && nome.charAt(i) != ' ' && nome.charAt(i+1) != ' ' && nome.charAt(i+2) == ' '){
				abreviatura = abreviatura + nome.charAt(i) + nome.charAt(i+1) + nome.charAt(i+2);
			}
			else if (nome.charAt(i-1) == ' ' && nome.charAt(i) != ' ' && nome.charAt(i+1) != ' ' && nome.charAt(i+2) != ' ' && nome.charAt(i+3) == ' '){
				abreviatura = abreviatura + nome.charAt(i) + nome.charAt(i+1) + nome.charAt(i+2) + nome.charAt(i+3);
			}
			else if(nome.charAt(i-1) == ' ' && nome.charAt(i) != ' ' && nome.charAt(i+1) != ' ' && nome.charAt(i+2) != ' ' && nome.charAt(i+3) != ' ') {
				abreviatura = abreviatura + nome.charAt(i) + ". ";
			}
		}
		System.out.println(abreviatura);
	}

}
