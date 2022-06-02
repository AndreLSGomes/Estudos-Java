package snakeGame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

	/*
		Esta tela será responsável por apresentar o status do jogo pontuação atingida.
		Nesta tela será exibido um botão para voltar ao MENU.
	*/

public class TelaJogoStatus extends JPanel {

	private static final long serialVersionUID = 1L;
	
	TelaJogoPanel telajogopanel;
	
	// Declarando o botão reiniciar jogo
	private JButton reiniciarJogo;
	
	// Declarando o botão voltar
	private JButton voltar;
	
	// Declarando uma variável que contará quantas frutas a cobra alcançou e uma imagem da comida.
	private JLabel comida;
	private JLabel contador;
	private JLabel pontuacao;
	
	// Construtor
	public TelaJogoStatus() {
		
		// Setando a janela com nenhum layout porque esta tela não herda de BoardBase onde já temos setado o setLayout(null)
		setLayout(null);
		
		// Instanciando o contador, o botão e a imagem
		comida = new JLabel();
		comida.setIcon(new ImageIcon("snakeGame/img/snakeStatus.png"));
		// setBounds(x, y, width, height)
		comida.setBounds(15, 165, 141, 99);
		
		reiniciarJogo = new JButton("Novo Jogo");
		reiniciarJogo.setBounds(10, 100, 120, 30);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(30, 300, 80, 30);
		
		add(comida);
		add(reiniciarJogo);
		add(voltar);
	
}

	// Métodos acessores	
	public JButton getReiniciarJogo() {
		return reiniciarJogo;
	}

	public void setReiniciarJogo(JButton reiniciarJogo) {
		this.reiniciarJogo = reiniciarJogo;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}
	
	public JLabel getComida() {
		return comida;
	}

	public void setComida(JLabel comida) {
		this.comida = comida;
	}

	public JLabel getContador() {
		return contador;
	}

	public void setContador(JLabel contador) {
		this.contador = contador;
	}

	public JLabel getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(JLabel pontuacao) {
		this.pontuacao = pontuacao;
	}

}
