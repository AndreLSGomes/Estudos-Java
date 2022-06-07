package com.exemplo.fullstackapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.fullstackapp.model.Employee;

/*
	A anotação @Repository é uma especialização da anotação @Component que é usada
	para indicar que a classe fornece o mecanismo para armazenamento, recuperação,
	atualização, exclusão e operação de pesquisa em objetos .
*/
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{
	
	

}