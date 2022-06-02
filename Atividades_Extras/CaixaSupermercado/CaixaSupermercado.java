package Atividades_Extras.CaixaSupermercado;

import java.util.Scanner;

public class CaixaSupermercado {

	public static void main(String[] args) throws InterruptedException {

		/*
		 Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo deve
		 receber a informação de quantos produtos o cliente comprou e, para cada produto, deverá ler o seu preço.
		 Ao final, deverá informar quanto o cliente deve pagar pelas compras.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		double valorCompra = 0;
		String produto;
		double qtdProduto, precoProduto = 0;
		
		System.out.println("Bemvindo ao Supermercado XYZ!\n\n");
		
		System.out.print("Informe a quantidade de itens comprados: ");
		int qtdProdutos = scan.nextInt();

        System.out.println("\n\nAGUARDE ENQUANTO PROCESSAMOS ESTES DADOS");
        // pausa de 2 segundos	            
        Thread.sleep(2000);
        limpaTela();
		
		for (int i = 0; i < qtdProdutos; i++) {
			
			System.out.print("Informe qual o produto deseja adquirir: ");
			produto = scan.next();
			
			System.out.print("Informe a quantidade deste produto: ");
			qtdProduto = scan.nextDouble();
			
			System.out.print("Informe o preço deste produto: ");
			precoProduto = scan.nextDouble();
			
			valorCompra = valorCompra + (qtdProduto * precoProduto);
			
			System.out.println("\n*** -------------------***\n ");
			
		}
		
		scan.close();
		
		System.out.print("\\nO valor total de sua compra foi de R$ " + valorCompra);
		
	}
	
	public static void limpaTela() {
		for( int i = 0; i < 15; i++ ) {
			System.out.println("");
		}
	}
}
