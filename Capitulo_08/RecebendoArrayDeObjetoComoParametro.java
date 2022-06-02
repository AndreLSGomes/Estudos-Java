package Capitulo_08;

public class RecebendoArrayDeObjetoComoParametro {

	public static void main(String[] args) {

		PassandoArrayDeObjetoComoParametroNoArray usuarioInfo = new PassandoArrayDeObjetoComoParametroNoArray("João");
		
		PassandoArrayDeObjetoComoParametroNoArray novosUsuarios[] = {usuarioInfo, new PassandoArrayDeObjetoComoParametroNoArray("Maria"), new PassandoArrayDeObjetoComoParametroNoArray("José")};
		
		for (PassandoArrayDeObjetoComoParametroNoArray x : novosUsuarios) {
			System.out.print(x.getNome() + " || ");
		}

	}

}
