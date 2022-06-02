package Capitulo_11;

public class ExemploNumberFormat {

	public static void main(String[] args) {

		try {
			String texto = "10xpt23";
			int idade = Integer.parseInt(texto);
			
			System.out.println(texto);
		}
		catch(NumberFormatException e) {
			System.out.println("Não foi possível converter a string em interiro");
			e.printStackTrace();
		}
	}

}
