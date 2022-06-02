package SWING._08_JDesktopPaneEJMenu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class Instrucoes extends JFrame {

	private JPanel contentPane;
	private JTextField txtInstrues;
	private JTextField txtOObjetivoDo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucoes frame = new Instrucoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Instrucoes() {
		setBackground(new Color(0, 0, 0));
		setFont(new Font("Calibri", Font.PLAIN, 12));
		setTitle("SnakeGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenuFrame.class.getResource("/SnakeGameComJDesktopPaneEJMenu/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 640, 480);
		setResizable(false);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("Novo Jogo");
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Novo Jogo");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Instru\u00E7\u00F5es");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Regras do Jogo");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Sair");
		menuBar_1.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("INSTRU\u00C7\u00D5ES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(94, 0, 448, 76);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnOObjetivoDo = new JTextPane();
		txtpnOObjetivoDo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnOObjetivoDo.setText("O objetivo do jogo \u00E9 fazer com que a cobrinha coma o m\u00E1ximo poss\u00EDvel de frutas.\r\nA cobrinha n\u00E3o deve tocar nas bordas da janela nem em si mesma.");
		txtpnOObjetivoDo.setBounds(10, 124, 616, 76);
		contentPane.add(txtpnOObjetivoDo);
		
		JLabel lblNewLabel_2 = new JLabel("Movimentos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 299, 171, 22);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnUtilizeAsSetas = new JTextPane();
		txtpnUtilizeAsSetas.setText("Utilize as setas do teclado para mover a cobrinha.");
		txtpnUtilizeAsSetas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnUtilizeAsSetas.setBounds(10, 319, 340, 25);
		contentPane.add(txtpnUtilizeAsSetas);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Instrucoes.class.getResource("/SnakeGameComJDesktopPaneEJMenu/setas.png")));
		lblNewLabel_3.setBounds(370, 182, 256, 199);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Instrucoes.class.getResource("/SnakeGameComJDesktopPaneEJMenu/snake_Status2.png")));
		lblNewLabel_1.setBounds(142, 0, 91, 76);
		contentPane.add(lblNewLabel_1);
		
	}
}
