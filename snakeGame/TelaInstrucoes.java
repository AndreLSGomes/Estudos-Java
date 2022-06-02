package snakeGame;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaInstrucoes extends TelaPadrao{
	
	// Serializando
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private JButton voltar;
	
	// Instanciando o InstrucoesControl
	private TelaInstrucoesControle controle;

	// Construtor
	public TelaInstrucoes() {
		super();
		
		// setBounds(x, y, width, height)
		JLabel lb1 = new JLabel("Instruções: ");
		lb1.setFont(new Font("Arial", Font.BOLD, 20));
		lb1.setBounds(12, 12, 170, 22);
		
		JLabel lb2 = new JLabel("O objetivo do jogo é fazer a snake comer o máximo de frutas possíveis. ");
		lb2.setFont(new Font("Arial", Font.PLAIN, 12));
		lb2.setBounds(12, 38, 522, 15);	
		
		JLabel lb6 = new JLabel("A snake não deve tocar nas bordas da janela ou em si mesma.");
		lb6.setFont(new Font("Arial", Font.PLAIN, 12));
		lb6.setBounds(12, 53, 522, 15);
		
		JLabel lb3 = new JLabel("Movimentos: ");
		lb3.setFont(new Font("Arial", Font.BOLD, 20));
		lb3.setBounds(12, 256, 170, 15);
		
		JLabel lb4 = new JLabel("Mova a snake utilizando as setas do teclado: ");
		lb4.setFont(new Font("Arial", Font.PLAIN, 12));
		lb4.setBounds(12, 277, 351, 15);
		
		JLabel lb5 = new JLabel("");
		lb5.setIcon(new ImageIcon("setas.png"));
		lb5.setBounds(362, 131, 260, 180);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(483, 366, 117, 25);
		
		// Instanciando o controle
		controle = new TelaInstrucoesControle(this);
		
		// Adicionando o botão voltar
		voltar.addActionListener(controle);
		
		// Adicionando os botões
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		add(voltar);
		
		setVisible(true);
	}

	// Métodos acessores do botão VOLTAR.
	public JButton getVoltar() {
		return voltar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

}
