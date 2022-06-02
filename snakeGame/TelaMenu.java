package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;

/*
		Será a primeira tela a ser apresentada para o usuário
		Esta janela também será a única que poderá fechar o sistema (como definido em BoardBase).
 */

public class TelaMenu extends TelaPadrao implements ActionListener{

	private static final long serialVersionUID = 1L;

	// Recebendo a TelaJogoPanel para podermos setar a dificuldade do jogo
	TelaJogoPanel telaJogo;

	// Tornando o ComboBox Global declarando-o fora do construtor
	JComboBox combobox;

	// Declarando os botões
	private JButton novoJogo;
	private JButton instrucoes;
	private JButton sair;

	// Quem controlará esta tela será o MenuControl, portanto declaramos uma variável que receberá MenuControl
	private TelaMenuControle controle;

	// CONSTRUTOR DO MENU
	public TelaMenu() {
		super();

		// Setando para que esta tela de menu feche o sistema.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		/* Especificmos aqui o layout utilizado na aplicação "através de setLayout(), indicando que será utilizado o gerenciador FlowLayout.
			Diferente das outras telas onde NÃO UTILIZAREMOS O GERENCIADOR DE LAYOUT -> setLayout(null) definido na BoardBase (tela base).
			-> setLayout(new FlowLayout());

		 ***  MUDAMOS DE IDEIA E IREMOS UTILIZAR UMA TELA SEM LAYOUT PARA PODERMS COLOCAR OS ELEMENTOS ONDE QUEREMOS, MANUALMENTE UTILIZANDO SETBOUNDS()  ***
		 */

		// Instanciando os botões
		novoJogo = new JButton("Novo Jogo");
		novoJogo.setBounds(190, 4, 100, 25);

		instrucoes= new JButton("Instruções");
		instrucoes.setBounds(293, 4, 100, 25);

		sair = new JButton("Sair");
		sair.setBounds(396, 4, 80, 25);

		// Populando o JComboBox
		String[] items = {"Easy", "Normal", "Hard", "Expert"};

		// Texto sobre o ComboBox
		JLabel nivelJogo = new JLabel("Escolha o nível do jogo:");
		nivelJogo.setBounds(20, 4, 150, 25);
		nivelJogo.setFont(new Font("Arial", Font.BOLD, 12));

		// Instanciando um ComboBox para setar a dificuldade do jogo
		combobox = new JComboBox(items);
		combobox.setBounds(20, 24, 100, 25);

		// Declarando o texto
		// setBounds(x, y, width, height)
		JLabel tituloJogo = new JLabel("Snake Game");
		tituloJogo.setBounds(215, 190, 230, 62);
		tituloJogo.setFont(new Font("Arial", Font.BOLD, 30));

		// adicionando os botões à BoardBase		
		// Como o layout = FlowLayout() a ordem dos botões será de acordo com a ordem nas chamadas dos botões e já virão centraliados por padrão.
		// Poderíamos fazer uma BARRA DE MENU, mas optamos por simplificar (Fonte -> https://www.devmedia.com.br/criando-uma-barra-de-menu/2384).
		add(nivelJogo);
		add(novoJogo);
		add(instrucoes);
		add(sair);
		add(tituloJogo);
		add(combobox);

		// Instanciando o controle do menu recebendo esta tela que estamos agora.
		controle = new TelaMenuControle(this);

		// Listening os botões e ComboBox
		novoJogo.addActionListener(controle);
		instrucoes.addActionListener(controle);
		sair.addActionListener(controle);
		combobox.addActionListener(this);

		// Agora setamos a visibilidade para 'true' porque o padrão é 'false'
		setVisible(true);

		/***** Após a construção do menu esta classe deve ser chamada no main *****/

	}

	/* Verificando se o ComboBox foi utilizado
	   Fonte -> https://www.youtube.com/watch?v=EAxV_eoYrIg
	 */
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() ==  combobox) {
			if (combobox.getSelectedItem() == "Easy") {
				telaJogo.setINTERVALO(300);
			}
		}

		if(e.getSource() ==  combobox) {
			if (combobox.getSelectedItem() == "Normal") {
				telaJogo.setINTERVALO(200);
			}
		}

		if(e.getSource() ==  combobox) {
			if (combobox.getSelectedItem() == "Hard") {
				telaJogo.setINTERVALO(100);
			}
		}

		if(e.getSource() ==  combobox) {
			if (combobox.getSelectedItem() == "Expert") {
				telaJogo.setINTERVALO(50);
			}
		}

	}

	/* Métodos acessores
		A particularidade desta classe é que usaremos apenas os métodos SET
	 */
	public JButton getNovoJogo() {
		return novoJogo;
	}

	public void setNovoJogo(JButton novoJogo) {
		this.novoJogo = novoJogo;
	}

	public JButton getInstrucoes() {
		return instrucoes;
	}

	public void setInstrucoes(JButton instrucoes) {
		this.instrucoes = instrucoes;
	}

	public JButton getSair() {
		return sair;
	}

	public void setSair(JButton sair) {
		this.sair = sair;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JComboBox getCombobox() {
		return combobox;
	}

	public void setCombobox(JComboBox combobox) {
		this.combobox = combobox;
	}

}
