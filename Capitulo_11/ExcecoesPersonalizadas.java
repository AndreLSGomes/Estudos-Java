package Capitulo_11;

public class ExcecoesPersonalizadas {
	
	private String aluno;
	private int nota;
	
	public ExcecoesPersonalizadas(String aluno, int nota) throws NotaInvalidaException{
		this.setAluno(aluno);
		this.setNota(nota);
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	
	public String getAluno() {
		return this.aluno;
	}
	
	public void setNota(int nota) throws NotaInvalidaException{
		if (nota < 0 || nota > 10) {
			NotaInvalidaException e = new NotaInvalidaException(nota + " -> Falhou!");
			throw e;
		}
		else {
			this.nota = nota;
		}
	}
	
	public int getNova() {
		return this.nota;
	}
	
}
