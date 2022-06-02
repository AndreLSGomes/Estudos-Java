package snakeGame;

import java.awt.Color;

	/*
		Esta classe desenha a tela do jogo (SnakeGame) dividindo-a em duas partes:
		  1- Tela do jogo
		  2- Tela de status do jogo e botão voltar
 	*/

public class TelaJogo extends TelaPadrao{

	private static final long serialVersionUID = 1L;
		
		// Tela do jogo
		private TelaJogoPanel gamePanel;
		
		// Tela de status do jogo
		private TelaJogoStatus statusPanel;
		
		// Declarando o controle desta tela
		private TelaJogoControle controle;
		
		// Construtor
		public TelaJogo() {
			
			// Instanciando e configurando o tamanho da tela do jogo
			gamePanel = new TelaJogoPanel();
			
			// Instanciando e configurando o tamanho da tela de status
			statusPanel = new TelaJogoStatus();
			
			// Adicionando as telas gamePanel e statusPanel à tela do jogo
			add(gamePanel);
			add(statusPanel);
			
			// Definindo as cores das telas
			gamePanel.setBackground(Color.BLACK);
			gamePanel.setBounds(0, 0, 480, 480);
			statusPanel.setBackground(Color.ORANGE);
			statusPanel.setBounds(480,0,160,480);
			
			// Instanciando a tela de controle para esta janela
			controle = new TelaJogoControle(this);
			
			// Adicionando a KeyLKistener para esta janela
			addKeyListener(controle);
			
			// Tornando ativa a janela
			setVisible(true);
			
		}

		// Métodos acessores
		public TelaJogoPanel getGamePanel() {
			return gamePanel;
		}

		public void setGamePanel(TelaJogoPanel gamePanel) {
			this.gamePanel = gamePanel;
		}

		public TelaJogoStatus getStatusPanel() {
			return statusPanel;
		}

		public void setStatusPanel(TelaJogoStatus statusPanel) {
			this.statusPanel = statusPanel;
		}	
}