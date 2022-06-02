package Capitulo_04.Laboratorios;

public class Laboratorio_3 {
	
	public static void main(String[] args) {

		int ano = 1930;
		
		for (int i = ano; i <= 2022; i += 4){
			if (i == 1942 || i == 1946) {
				System.out.println("Não houve Copa do mundo em " + i + " devido à segunda guerra mundial!");
			}
			else{
				System.out.println("Copa do mundo de " + i + "!");
			}
		}
	}

}
