package Capitulo_03;

public class Atribuicao {
	
	public static void main(String[] args) {
			String endereco;
			
			String umEndereco = (endereco = "Rua Um, 45 Bairro: ABC São Paulo / São Paulo");
			System.out.println("umendereco = " + umEndereco);
			System.out.println("endereco = " + endereco);
			System.out.println(endereco);
			
			int a, b, c, d, e, f;
			a = b = c = d = e = f = 45;
			System.out.println("\na = " + a + ", b = " + b + "\n");
			
			char resposta = 'n';
			boolean flag = false;
			System.out.println("resposta = " + resposta);
			System.out.println("flag = " + flag);
			
			int x = 3;
			int y = x;
			System.out.println("\nX = " + x);
			System.out.println("Y = " + y);
			
			y = 5;
			System.out.println("\nY = " + y);
			
	}
}
