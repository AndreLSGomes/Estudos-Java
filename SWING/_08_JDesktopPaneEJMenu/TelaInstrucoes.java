package SWING._08_JDesktopPaneEJMenu;

public class TelaInstrucoes extends InternalFrameImage {

	private static final long serialVersionUID = 1L;
	
	TelaInstrucoes telaInstrucoes;

	// Construtor
	public TelaInstrucoes (String titulo, Menu telaPrincipal) {

		// Configurando as propriedades da Janela
		setSize(800, 600);
		setVisible(true);
		setResizable(false);
		setImage("setas.png");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Removendo barra da janela
		((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

		telaPrincipal.jdPane.add(this);
	}

}
