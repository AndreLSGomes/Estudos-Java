package com.exemplo.fullstackapp.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.stereotype.Service;
import com.exemplo.fullstackapp.model.DatabaseSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import java.util.Objects;

@Service
public class SequenceGeneratorService {

	private MongoOperations mongoOperations;
	
	// Construtor
	@Autowired
	public SequenceGeneratorService(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}
	
	// Método para gerar sequências para inserção de dados
	public long generatorSequence(String SeqName) {
		DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(SeqName)),
				                                                 new Update().inc("seq", 1),
                                                                 options().returnNew(true).upsert(true), DatabaseSequence.class
                                                                );
		
		// Retorno do método
		return !Objects.isNull(counter) ? counter.getSeq() : 1;
		
	}
	
}