package SWING._08_JDesktopPaneEJMenu;

import javax.swing.JInternalFrame;

public class TelaJogo extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	// Construtor
	public TelaJogo (String titulo, Menu telaPrincipal) {

		// Configurando as propriedades da Janela
		super(titulo);
		setSize(800, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

		telaPrincipal.jdPane.add(this);
	}

}
