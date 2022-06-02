package snakeGame;

import javax.swing.JPanel;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


	/*
		Esta tela será responsável por desenhar tudo referente ao jogo
 	*/


//ActionListener - interface de ações sobre a tela, escuta e age conforme a implementação
public class TelaJogoPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	// Instanciando a classe TelaJogoStatus
	TelaJogoStatus telaStatus = new TelaJogoStatus();
	
	/*
		Declarando path da música
		O arquivo wav deve estar na raiz do projeto, ou seja, 'workspace\Academia_Java'
	 */
	String filePath = "snakeAte.wav";
	MusicStuff m = new MusicStuff();

	// declarando constantes
	private static final int LARGURA_TELA  = 460;
	private static final int ALTURA_TELA   = 440;
	private static final int TAMANHO_CELULA  = 15;
	private static final int UNIDADES = LARGURA_TELA * ALTURA_TELA / (TAMANHO_CELULA * TAMANHO_CELULA);

	/* 
		diminuindo esse intervalo a cobra fica cada vez mais rápida,
		possível implementar niveis de dificuldade utilizando constantes diferentes easy 300; medio 200; hard 100; expert 50;
	 */
	private static int INTERVALO = 300;

	private static final String NOME_FONTE = "Arial";
	private final int[] eixoX = new int[UNIDADES];
	private final int[] eixoY = new int[UNIDADES];
	private int corpoCobra    = 4;
	private int blocosComidos;
	private int blocoX;
	private int blocoY;
	private char direcao      = 'D'; // C - Cima, B - Baixo, E - Esquerda, D - Direita
	private boolean estaRodando = false;
	Timer timer;
	Random random;

	// Montando e chamando a tela do Jogo
	TelaJogoPanel() {
		random = new Random();
		setPreferredSize(new Dimension(LARGURA_TELA, ALTURA_TELA));
		setFocusable(true);

		//controla o pressionar de teclas
		addKeyListener(new LeitorDeTeclas());

		iniciarJogo();
	}

	// Método para Criar os blocos, setar que o jogo está ON e inicar o TIMER
	public void iniciarJogo() {
		criarBloco();
		estaRodando = true;
		timer = new Timer(INTERVALO, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		desenharTela(g);
	}

	public void desenharTela(Graphics g) {

		if (estaRodando) {
			g.setColor(Color.RED);
			g.fillOval(blocoX, blocoY, TAMANHO_CELULA, TAMANHO_CELULA);

			for (int i = 0; i < corpoCobra; i++) {
				if (i == 0) {
					g.setColor(Color.green);
					// Desenhando a snake com 3D
					g.fill3DRect(eixoX[0], eixoY[0], TAMANHO_CELULA, TAMANHO_CELULA, true);
				} else {
					g.setColor(new Color(45, 180, 0));
					g.fill3DRect(eixoX[i], eixoY[i], TAMANHO_CELULA, TAMANHO_CELULA, true);
				}
			}
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial", Font.BOLD, 13));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Pontos: " + blocosComidos, (LARGURA_TELA - metrics.stringWidth("Pontos: " + blocosComidos)) / 2, g.getFont().getSize());
		}
		else {
			fimDeJogo(g);
		}
	}

	private void criarBloco() {
		blocoX = random.nextInt(LARGURA_TELA / TAMANHO_CELULA) * TAMANHO_CELULA;
		blocoY = random.nextInt(ALTURA_TELA / TAMANHO_CELULA) * TAMANHO_CELULA;
	}

	// Mostra as mensagens de GAME OVER
	public void fimDeJogo(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font(NOME_FONTE, Font.BOLD, 16));
        FontMetrics fontePontuacao = getFontMetrics(g.getFont());
        g.drawString("Pontos: " + blocosComidos, (LARGURA_TELA - fontePontuacao.stringWidth("Pontos: " + blocosComidos)) / 2, g.getFont().getSize());
        g.setColor(Color.GREEN);
        g.setFont(new Font(NOME_FONTE, Font.BOLD, 50));
        FontMetrics fonteFinal = getFontMetrics(g.getFont());
        g.drawString("GAME OVER", (LARGURA_TELA - fonteFinal.stringWidth("GAME OVER")) / 2, ALTURA_TELA / 2);
	}

	// Verificando as ações do usuário, se a snake comeu uma fruta e validando os limites da tela
	public void actionPerformed(ActionEvent e) {
		if (estaRodando) {
			andar();
			comerFruta();
			validarLimites();
		}
		repaint();
	}

	// Movimentação da snake
	private void andar() {
		for (int i = corpoCobra; i > 0; i--) {
			eixoX[i] = eixoX[i - 1];
			eixoY[i] = eixoY[i - 1];
		}

		switch (direcao) {
		case 'C':
			eixoY[0] = eixoY[0] - TAMANHO_CELULA;
			break;
		case 'B':
			eixoY[0] = eixoY[0] + TAMANHO_CELULA;
			break;
		case 'E':
			eixoX[0] = eixoX[0] - TAMANHO_CELULA;
			break;
		case 'D':
			eixoX[0] = eixoX[0] + TAMANHO_CELULA;
			break;
		default:
			break;
		}
	}

	// Após a snake comer uma fruta
	private void comerFruta() {
		if (eixoX[0] == blocoX && eixoY[0] == blocoY) {

			// Aumentando tamanho da cobra após comer uma fruta
			corpoCobra++;

			// Após comer a fruta outra será gerada
			criarBloco();

			// Seta contador assim que a snake comer uma fruta
			blocosComidos++;
			
			// Toca um som quando a snake comer uma fruta
			m.playMusic(filePath);
		}
	}
	

	// Caso a cobra colida com o próprio corpo
	private void validarLimites() {
		//A cabeça bateu no corpo?
		for (int i = corpoCobra; i > 0; i--) {
			if (eixoX[0] == eixoX[i] && eixoY[0] == eixoY[i]) {
				estaRodando = false;
				break;
			}
		}

		//A cabeça tocou uma das bordas Direita ou esquerda?
		if (eixoX[0] < 0 || eixoX[0] > LARGURA_TELA) {
			estaRodando = false;
		}

		//A cabeça tocou o piso ou o teto?
		if (eixoY[0] < 0 || eixoY[0] > ALTURA_TELA) {
			estaRodando = false;
		}

		if (!estaRodando) {
			timer.stop();
		}
	}

	// Implentação do Listenner
	public class LeitorDeTeclas extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (direcao != 'D') {
					direcao = 'E';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (direcao != 'E') {
					direcao = 'D';
				}
				break;
			case KeyEvent.VK_UP:
				if (direcao != 'B') {
					direcao = 'C';
				}
				break;
			case KeyEvent.VK_DOWN:
				if (direcao != 'C') {
					direcao = 'B';
				}
				break;
			default:
				break;
			}
		}
	}

	// Métodos acessores
	public static int getINTERVALO() {
		return INTERVALO;
	}

	/*
		Este método seta a dificuldade
		A dificuldade DEFAULT é a "easy" > INTERVALO = 300
	*/
	public static void setINTERVALO(int iNTERVALO) {
		INTERVALO = iNTERVALO;
	}
	
}