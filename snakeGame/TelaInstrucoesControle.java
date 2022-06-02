package snakeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInstrucoesControle implements ActionListener{
	
	private TelaInstrucoes telaInstrucoes;

	// Construtor
	public TelaInstrucoesControle(TelaInstrucoes telaInstrucoes) {
		super();
		this.telaInstrucoes = telaInstrucoes;
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaInstrucoes.getVoltar()) {
			// Mostrar a tela
			TelaMenuControle.mostrarMenu();
			
			// Após mostrar a tela do MENU é que podemos fechar a tela de INSTRUCOES.
			telaInstrucoes.dispose();
		}
		
	}

}
