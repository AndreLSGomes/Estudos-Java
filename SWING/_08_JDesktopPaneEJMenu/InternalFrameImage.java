package SWING._08_JDesktopPaneEJMenu;

import javax.swing.JInternalFrame;

public class InternalFrameImage extends JInternalFrame{
	
	private static final long serialVersionUID = 1L;
	
	private PanelImages panelImages = new PanelImages();
	
	public InternalFrameImage() {
		setContentPane(panelImages);
	}
	
	public void setImage(String nomeImagem) {
		panelImages.setImage(nomeImagem);
	}
}
