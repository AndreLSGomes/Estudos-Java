package Capitulo_11;

public class TesteExcecoesPersonalizadas {

	public static void main(String[] args) {

		try {
			ExcecoesPersonalizadas dados = new ExcecoesPersonalizadas("André", 28);
		}
		catch (NotaInvalidaException e) {
			System.err.println("Nota invalida " + e.getMessage());
			
		}

	}

}
