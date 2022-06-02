package SWING._02_DesenhandoLinhas;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLines extends JPanel{

	public void paintComponent( Graphics g ){
		super.paintComponent( g );

		g.drawLine( 0, 0, 250, 250 );

	}
}