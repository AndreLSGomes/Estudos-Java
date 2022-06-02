package Capitulo_15._08_Map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Capitulo_15._07_Stream.Colaborador;

public class MapMetodoMinMax {

	public static void main(String[] args) {

		List<Colaborador> listaColab = new ArrayList<>();

		listaColab.add(new Colaborador(2005, "Manuel da Silva", "Desenvolvedor", 3580.0));
		listaColab.add(new Colaborador(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
		listaColab.add(new Colaborador(1045, "Maria das Dores", "Analista", 6250.0));
		listaColab.add(new Colaborador(1780, "João Ricardo", "Desenvolvedor", 7100.0));
		listaColab.add(new Colaborador(5200, "Ana Maria", "Vendedor", 4100.0));
		listaColab.add(new Colaborador(3420, "André de Souza", "Desenvolvedor", 5890.0));
		listaColab.add(new Colaborador(3999, "Bartolomeu Dias", "Analista", 6500.0));
		listaColab.add(new Colaborador(1920, "Rubens da Gama", "Coordenador", 12300.0));
		listaColab.add(new Colaborador(2389, "Cristovão Col.", "Navegador", 3200.0));
		listaColab.add(new Colaborador(6300, "Pedro Alvares", "Explorador", 1350.0));

		// Filtrando a menor matrícula
		Colaborador minColab = listaColab.stream()
				.min(Comparator.comparing(Colaborador::getMatricula))
				.get();

		// Filtrando a maior matrícula
		Colaborador maxColab = listaColab.stream()
				.max(Comparator.comparing(Colaborador::getMatricula))
				.get();

		// Exibindo os valores
		System.out.println("Colaborador com o menor número de matrícula: " + minColab);
		System.out.println("Colaborador com o maior número de matrícula: " + maxColab);

	}

}
