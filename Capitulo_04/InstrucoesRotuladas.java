package Capitulo_04;

public class InstrucoesRotuladas {

	public static void main(String[] args) {
		
		// Primeira instrução Rotulada
		instrucao1:
			for (int i = 1; i < 4; i++) {
				instrucao2:
					for (int j = 1; j < 4; j++) {
						if(j == 2) {
							System.out.println("Saindo da instrucao 1");
							break instrucao1;
						}
						System.out.println("Instrucao2");
					}
				System.out.println("Instrucao1");
			}
	}
}
