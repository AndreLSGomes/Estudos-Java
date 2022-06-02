package Capitulo_10;

public interface Eletrodomestico {
	void ligar();
	void desligar();
	
	static void ligarTudo(Eletrodomestico... eletroArray) {
		for (Eletrodomestico eletro: eletroArray) {
			eletro.ligar();
			System.out.println(eletro + " ligado!");
		}
		System.out.println();
	}
	
	static void desligarTudo(Eletrodomestico... eletroArray) {
		for (Eletrodomestico eletro: eletroArray) {
			eletro.desligar();
			System.out.println(eletro + " desligado!");;
		}
		System.out.println();
	}

}
