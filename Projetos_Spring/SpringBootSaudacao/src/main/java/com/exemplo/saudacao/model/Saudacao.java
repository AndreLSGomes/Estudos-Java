package com.exemplo.saudacao.model;

public class Saudacao {
	
	private final long id;
	private final String saudacao;
	
	// Construtor
	public Saudacao(long id, String saudacao) {
		this.id = id;
		this.saudacao = saudacao;
	}

	// Métodos acessores
	public long getId() {
		return id;
	}

	public String getContent() {
		return saudacao;
	}

}