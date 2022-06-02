package Capitulo_15._08_Map;

public class JogadorFutebol {
	
	private String nomeJogador;
	private String posicao;
	
	// Construtor
	public JogadorFutebol(String nome, String posicao) {
		super();
		this.nomeJogador = nome;
		this.posicao = posicao;
	}

	// Métodos acessores
	public String getNome() {
		return nomeJogador;
	}

	public void setNome(String nome) {
		this.nomeJogador = nome;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return this.getNome() + "\t\t" + this.getPosicao();
	}

}
