package Atividades_Extras.NomeIdadePessoaMaisNova;

import java.util.ArrayList;
import java.util.List;
public class NomeIdadePessoaMaisNovaUsandoLista {

	public static void main(String[] args) {
		
		// Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba o nome e a idade da pessoa mais nova.
		
		List <PessoaList> usuarios = new ArrayList<>();
		
		PessoaList pessoa1 = new PessoaList("João", 40);
		PessoaList pessoa2 = new PessoaList("Maria", 20);
		PessoaList pessoa3 = new PessoaList("Pedro", 18);
		PessoaList pessoa4 = new PessoaList("Lucas", 40);
		PessoaList pessoa5 = new PessoaList("Marcos", 25);
		PessoaList pessoa6 = new PessoaList("André", 35);
		PessoaList pessoa7 = new PessoaList("Márcio", 45);
		PessoaList pessoa8 = new PessoaList("Beth", 55);
		PessoaList pessoa9 = new PessoaList("Alessandra", 20);
		PessoaList pessoa10 = new PessoaList("valéria", 19);
		
		usuarios.add(pessoa1);
		usuarios.add(pessoa2);
		usuarios.add(pessoa3);
		usuarios.add(pessoa4);
		usuarios.add(pessoa5);
		usuarios.add(pessoa6);
		usuarios.add(pessoa7);
		usuarios.add(pessoa8);
		usuarios.add(pessoa9);
		usuarios.add(pessoa10);
		
		PessoaList usuarioMenorIdade = PessoaList.getPessoaMaisNova(usuarios);
		
		System.out.println(usuarioMenorIdade.toString());
	}

}
