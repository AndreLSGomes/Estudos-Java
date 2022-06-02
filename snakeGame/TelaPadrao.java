package snakeGame;

import java.awt.Toolkit;
import javax.swing.JFrame;

	/*
		A classe Board representa o display (a tela do jogo). É uma matriz de células.
		Possui um método de geração de alimentos que gera o alimento em uma posição aleatória.
	*/

	public class TelaPadrao extends JFrame{
		
		/*
			Esse é um atributo utilizado para controlar explicitamente a compatibilidade entre o .class usado para serializar e o .class que será utilizado na desserialização.
 			Fonte -> https://blog.algaworks.com/serialversionuid/
		*/
		private static final long serialVersionUID = 1L;

		// Construtor de Board
		public TelaPadrao() {
			
			/* SETANDO O TÍTULO DA JANELA (JFrame).
 				Uma vez que você tenha um objeto JFrame válido (esta classe extende JFrame), você pode chamar o método setTitle da classe JFrame
			   -> Fonte: https://alvinalexander.com/java/jframe-title-set/
			*/
			setTitle("Snake Game");
			
			/* SETANDO O TAMANHO DA JANELA (JFrame)
				setSize - Redimensiona este componente para que tenha largura w e altura h.
				Os valores de largura e altura são ampliados automaticamente se um deles for menor que o tamanho mínimo especificado pela chamada anterior para setMinimumSize.
				-> Fonte: https://alvinalexander.com/java/java-set-jframe-size/
				
				***** Poderia ter sido utilizado setPreferredSize *****
						Define o tamanho preferencial deste componente para um valor CONSTANTE.
						As chamadas subsequentes para getPreferredSize sempre retornarão esse valor.
						Definir o tamanho preferencial como nulo restaura o comportamento padrão.
		 	*/
			setSize(640, 480);
			
			/* A tela do menu é quem fechará o sistema, através do botão FECHAR.
			   As outras duas telas poderão ser fechadas sem fechar o sistema.

				O método 'setDefaultCloseOperation()' é usado para especificar uma das várias opções para o botão Fechar.
				Use uma das seguintes constantes para especificar sua escolha:
				JFrame.EXIT_ON_CLOSE       — Saia do aplicativo.
				JFrame.HIDE_ON_CLOSE       — Oculta o quadro, mas mantém o aplicativo em execução.
				JFrame.DISPOSE_ON_CLOSE    — Descarte o objeto frame, mas mantenha o aplicativo rodando.
				JFrame.DO_NOTHING_ON_CLOSE — Ignora o clique. 
				-> Fonte: https://chortle.ccsu.edu/java5/notes/chap56/ch56_9.html
				
				*** setUndecorated(true); -> remove toda a barra de botões do jframe***
			*/
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			/* CENTRALIZANDO A TELA DO JOGO
				Define a localização da janela em relação ao componente especificado de acordo com os cenários a seguir:
				A tela de destino mencionada abaixo é uma tela na qual a janela deve ser colocada após o método setLocationRelativeTo ser chamado.
				
				Se o componente for null, ou o GraphicsConfigurationassociado a este componente for null, a janela será colocada no centro da tela. O ponto central pode ser obtido com o GraphicsEnvironment.getCenterPointmétodo.
				Se o componente não for null, mas não estiver sendo exibido no momento, a janela será colocada no centro da tela de destino definida pelo GraphicsConfigurationassociado a este componente.
				Se o componente não estiver nulle for exibido na tela, a janela estará localizada de forma que o centro da janela coincida com o centro do componente.
				Fonte -> https://docs.oracle.com/javase/7/docs/api/java/awt/Window.html#setLocationRelativeTo(java.awt.Component)
			*/
			setLocationRelativeTo(null);
			
			/*
			 	** Esse método altera as informações relacionadas ao layout e, portanto, invalida a hierarquia do componente! **
				Se o layout for “null” os componentes da sua tela vão ser “independentes” e sua posição vai depender somente do método setBounds.
				Ou seja, os componentes deverão ter suas posições setadas pelo método setBounds.
				-> https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#setLayout(java.awt.LayoutManager)
				-> https://docs.oracle.com/javase/7/docs/api/javax/swing/RootPaneContainer.html
				-> https://docs.oracle.com/javase/tutorial/uiswing/layout/none.html
				-> https://www.guj.com.br/t/sobre-o-metodo-setlayout/234687/3
			*/
			setLayout(null);
			
			/*
			 	Um método para garantir que uma interface gráfica tenha a aparência desejada é impedir que o usuário a redimensione, usando este método de JFrame:
				   ** public void setResizable(boolean redimensionável) **
				-> https://chortle.ccsu.edu/java5/notes/chap62/ch62_2.html
			*/
			setResizable(false);
			
			/*
				ALTERANDO O ÍCONE DA JANELA
				-> https://www.programcreek.com/java-api-examples/?class=javax.swing.JFrame&method=setIconImage
				-> http://www.java2s.com/Code/JavaAPI/javax.swing/JFramesetIconImageImageimage.htm
			*/
			SetIcon();
		}
		
		private void SetIcon() {
			setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/icon.png")));
	    }
		
	}