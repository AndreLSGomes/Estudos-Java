package com.exemplo.fullstackapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FullstacksppApplicationTests {

	/*
		O Spring Boot fornece uma anotação @SpringBootTest, que pode ser usada como uma
		alternativa à anotação @ContextConfiguration de teste padrão quando você precisar
		de recursos do Spring Boot . A anotação funciona criando o ApplicationContext usado
		em seus testes por meio do SpringApplication .
	*/
	@Test
	void contextLoads() {
	}

}
