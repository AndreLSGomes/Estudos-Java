package Capitulo_15.Laboratorio.Lab2;

import java.util.ArrayList;

public class Cap15_Lab2 {

	public static void main(String[] args) {

		// Criando uma ArrayList parametrizada do tipo Estudante
		ArrayList<Estudante> estudanteList = new ArrayList<>();

		// Populando a ArrayList 'estudanteList'
		estudanteList.add(new Estudante("Joana", 8.5, 9.0, 0.0));
		estudanteList.add(new Estudante("Antônio", 6.0, 9.0, 0.0));
		estudanteList.add(new Estudante("Mariana", 7.5, 9.0, 0.0));
		estudanteList.add(new Estudante("Ricardo", 7.0, 6.0, 0.0));
		estudanteList.add(new Estudante("Gustavo", 9.5, 10.0, 0.0));

		// Calculando e setando a média de cada aluno
		estudanteList.forEach(a -> a.setMedia((a.getNotaMatematica() + a.getNotaPortugues()) / 2));

		// Imprimindo o nome e a média de cada aluno
		estudanteList.forEach(a -> System.out.println(a.getNome() + " - " + a.getMedia()));

	}

}
