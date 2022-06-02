package Capitulo_15._07_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploStream {

	public static void main(String[] args) {

		// Cria uma lista vazias de funcionários
		List<Colaborador> listaColab = new ArrayList<>();
		
		// Adicionando funcionários a lista
		listaColab.add(new Colaborador(2005, "Manuel da Silva", "Desenvolvedor", 3580.0));
		listaColab.add(new Colaborador(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
		listaColab.add(new Colaborador(1045, "Maria das Dores", "Analista", 6250.0));
		listaColab.add(new Colaborador(1780, "João Ricardo", "Desenvolvedor", 7100.0));
		listaColab.add(new Colaborador(5200, "Ana Maria", "Vendedor", 4100.0));
		listaColab.add(new Colaborador(3420, "André de Souza", "Desenvolvedor", 5890.0));
		listaColab.add(new Colaborador(3999, "Robson Gusmão", "Analista", 6500.0));
		listaColab.add(new Colaborador(1920, "Rubens Vieira", "Coordenador", 12300.0));
		listaColab.add(new Colaborador(2389, "Eduardo Alves", "Desenvolvedor", 3200.0));
		listaColab.add(new Colaborador(6300, "Joana Paiva", "Atendente", 1350.0));
		
		// Executando sucessivas operações com os dados da lista
		listaColab.stream()
		
			// Filtrando colaboradores que tem o cargo 'Desenvolvedor'
			//.filter(f -> "Desenvolvedor".equals(f.getCargo()))
			
			// Ordenando pela ordem natural que as Strings obedecem
			//.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
			
			// Ordenando reversamente por cargo
			.sorted((Comparator.comparing(Colaborador::getCargo))
			.reversed()
			.thenComparing(Colaborador::getSalario))
			
			// Escapamos o primeiro resultado
			//.skip(1)
			
			// Limitamos em dois resultados
			.limit(3)
			
			/*
				:: Method Reference - Estamos referenciando o método 'println'
				                      Dessa forma imprimiremos apenas o hash dos objetos
				                      mas ao alterar, na classe 'Colaborador' o padrão de saída da String
				                      sobrescrevendo o método toString.
			*/
			.forEach(System.out::println);

			//.forEach(x -> System.out.println(x.getNome()));
	}

}
