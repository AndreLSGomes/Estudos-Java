package Capitulo_17._08_Sincronizacao;

public class Deadlock {
	
	private static class Recurso{
		public int value;
	}
	
	private Recurso RecursoX = new Recurso();
	private Recurso RecursoY = new Recurso();
	
	/*
		No c�digo apresentado, h� possibilidade de ocorrer um deadlock, o que � demonstrado nas linhas 25 e 34.
		Ele � justificado de acordo com a seguinte situa��o:
			read() foi iniciado por uma thread e write() foi iniciado por uma outra thread.
			O risco de impasse existe porque as duas threads s�o capazes de ler e gravar de
			forma independente.
			J� que a thread de leitura (read) possui o recurso X, e a thread de grava��o
			(write)	possui o recurso Y, ambas permanecer�o paralisadas, aguardando a
			desist�ncia uma	da outra.
	*/
	
	public int read() {
		// Pode ocorrer um deadlock aqui
		synchronized (RecursoX) {
			synchronized (RecursoY) {
				return RecursoY.value + RecursoX.value;
			}		
		}
	}
	
	public void write(int x, int y) {
		// Pode ocorrer um deadlock aqui
		synchronized (RecursoY) {
			synchronized (RecursoX) {
				RecursoX.value = x;
				RecursoY.value = y;
			}
		}
	}

}
