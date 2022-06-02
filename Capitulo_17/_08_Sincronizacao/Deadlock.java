package Capitulo_17._08_Sincronizacao;

public class Deadlock {
	
	private static class Recurso{
		public int value;
	}
	
	private Recurso RecursoX = new Recurso();
	private Recurso RecursoY = new Recurso();
	
	/*
		No código apresentado, há possibilidade de ocorrer um deadlock, o que é demonstrado nas linhas 25 e 34.
		Ele é justificado de acordo com a seguinte situação:
			read() foi iniciado por uma thread e write() foi iniciado por uma outra thread.
			O risco de impasse existe porque as duas threads são capazes de ler e gravar de
			forma independente.
			Já que a thread de leitura (read) possui o recurso X, e a thread de gravação
			(write)	possui o recurso Y, ambas permanecerão paralisadas, aguardando a
			desistência uma	da outra.
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
