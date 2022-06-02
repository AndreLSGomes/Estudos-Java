package Atividades_Extras.EleicaoLiderTurma;

public class Candidatos extends Aluno{

	private int votos = 0;
	
	public Candidatos(String nome) {
		super(nome);
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos() {
		this.votos += 1;
	}

}
