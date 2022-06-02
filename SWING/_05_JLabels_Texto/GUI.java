package SWING._05_JLabels_Texto;

import javax.swing.JFrame;

public class GUI {
	public static void main(String[] args) {
		Rotulo label1 = new Rotulo();

		label1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1.setSize(400,250);
		label1.setVisible(true);
	}
}