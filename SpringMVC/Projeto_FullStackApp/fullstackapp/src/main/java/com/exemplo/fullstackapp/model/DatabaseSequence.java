package com.exemplo.fullstackapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
	@Document é uma anotação fornecida pelo projeto de dados Spring.
	Ele é usado para identificar um objeto de domínio, que é persistido
	no MongoDB . Assim, você pode usá-lo para mapear uma classe Java em
	uma coleção dentro do MongoDB.
*/
@Document(collection = "database_sequence")
public class DatabaseSequence {
	
	/*
		A anotação @Id especifica a chave primária de uma entidade e a
		@GeneratedValue fornece a especificação de estratégias de geração
		para os valores das chaves primárias.
	*/
	@Id
	private String id;
	private long seq;
	
	// Métodos acessores
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public long getSeq() {
		return seq;
	}
	
	public void setSeq(long seq) {
		this.seq = seq;
	}

}