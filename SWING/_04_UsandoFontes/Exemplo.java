package SWING._04_UsandoFontes;

/*

Dentro de uma classe que estende a JPanel, usamos os recursos da Font com um objeto da Graphics, como se fosse um componente para a pintura/gráficos.
Para escrevermos strings coloridas, primeiro setamos a fonte, depois usamos o método drawString(), como segue :

public void Exemplo( Graphics g)
{
	super.paintComponent(g);
	
	g.setFont( new Font(“Serif”, Font.BOLD, 15) );
	g.drawString(“ Serif 15, negrito”, 20, 30 );
	
	g.setFont( new Font(“Monospaced”, Font.ITALIC, 15) );
	g.drawString(“Monospaced 15, itálico”, 20, 30 );
	
	g.setFont( new Font(“SansSerif”, Font.PLAIN, 15) );
	g.drawString(“SansSerif 15, plano”, 20, 30 );
	
	g.setColor( Color.RED);
	g.setFont( new Font(“Serif”, Font.BOLD + Font.ITALIC, 15) );
	g.drawString(g.getFont().getName() + “ “+ g.getFont().getSize() + “ point negrito e itálico”, 20, 100 );
}

*/