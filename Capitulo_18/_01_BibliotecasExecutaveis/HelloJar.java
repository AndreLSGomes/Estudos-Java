package Capitulo_18._01_BibliotecasExecutaveis;

import javax.swing.JFrame;

	/*
		A partir do Eclipse, selecione a op��o de exporta��o de projeto
		1. Escolha a op��o Java > Runnable JAR file
		2. Selecione, dentre as op��es, a classe principal do pacote que est� sendo gerado
		Para execu��o da aplica��o, d� um duplo clique no arquivo gerado (dependendo
		da configura��o do sistema operacional) ou acesse o prompt de comando e
		execute o seguinte comando: java -jar [nome-arquivo].jar
	*/

public class HelloJar extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		// Instanciando um JFrame
		JFrame frame = new JFrame("Hello jar");
		
		// Configurando o frame
		frame.setSize(640, 480);
		
		// Encerrar a aplica��o ao fechar o Frame
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Centraliza o Frame
		frame.setLocationRelativeTo(null);
		
		// N�o permite o redimensionamento do Frame
		frame.setResizable(false);
		frame.setVisible(true);

	}

}
