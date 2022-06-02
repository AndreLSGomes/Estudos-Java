package Capitulo_13.TesteMegaSena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Capitulo_13.MegaSenaUtilitario;

	/*
		É a annotation mais básica do JUnit, que serve para marcar métodos que serão executados como testes.
	*/

class SorteioDoNumero {

	@Test
	// testando se o número é maior do que ZERO
	void geracaoDeNumeroPositivo() {
		
		int numeroMaiorQueZero = MegaSenaUtilitario.sortearNumero();
		
		// Usando a instrução ASSERTION
		assertTrue(numeroMaiorQueZero > 0);
	}
	
	@Test
	// testando se o número é menor ou igual a 60
	void geracaoDeNumeroMenorOuIgualASessenta() {
		
		int numeroMaiorQueZero = MegaSenaUtilitario.sortearNumero();
		
		// Usando a instrução ASSERTION
		assertTrue(numeroMaiorQueZero <= 60);
	}

}