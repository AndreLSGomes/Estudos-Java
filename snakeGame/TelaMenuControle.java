package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe para controlarmos os eventos dos botões disponíveis no Menu, acionados pelo usuário.
public class TelaMenuControle implements ActionListener{
	
	/*
		O que são listeners e ActionListener
		O usuário poderá utilizará os botões disponíveis na classe Menu e através do ActionListener saberemos qual dos botões foi acionado, disparando uma resposta apropriada.
		-> Fonte: https://www.devmedia.com.br/java-listeners-trabalhando-com-actionlistener-e-keylistener-em-java/31850
	*/

	// Criando uma variável objeto do tipo TelaMenu
	private static TelaMenu telaMenu;
	
	/*
		Construtor
		Dentro do construtor recebemos um objeto do tipo Menu para podermos ter controle sobre ele
	*/
	public TelaMenuControle(TelaMenu telaMenu) {
		TelaMenuControle.telaMenu = telaMenu;
	}
	
	// Método responsável por voltar ao MENU
	public static void mostrarMenu() {
		telaMenu.setVisible(true);
	}

	// Construtor da actionPerformed para os botões da tela de MENU
	public void actionPerformed(ActionEvent e) {

		// Verificando qual botão foi clicado
		if (e.getSource() == telaMenu.getNovoJogo()) {
			// Inicia novo jogo();
			new TelaJogo();
			telaMenu.setVisible(false);
		}
		else if (e.getSource() == telaMenu.getInstrucoes()) {
			// Iniciando a tela Instruções e fechando a tela Menu
			new TelaInstrucoes();
			telaMenu.setVisible(false);
		}
		else if (e.getSource() == telaMenu.getSair()) {
			// Saída do jogo
			System.exit(0);
		}
		
	}

}
