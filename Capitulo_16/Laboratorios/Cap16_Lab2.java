package Capitulo_16.Laboratorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Cap16_Lab2 {

	final static String PASTA_ORIGEM = "src\\Capitulo_16\\Laboratorios\\Mp3";
	final static String PASTA_BACKUP = "src\\Capitulo_16\\Laboratorios\\Backup";

	public static void main(String[] args) {

		// Setandos as variáveis de path
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_BACKUP);
		
		try {
			
			// Métodos para manipular diretórios e arquivos
			if (!Files.exists(backup)) {
				System.out.println("O diretório 'backup' não existe!\n Criando diretório 'backup', aguarde.....");
				
				// Criando o diretório backup
				Files.createDirectory(backup);

			}
			
			// Criando a variável streamOrigem
			Stream<Path> streamOrigem = Files.list(origem);
			
			System.out.println("ARQUIVOS TRANSFERIDOS:\n");
			
			streamOrigem.forEach(p -> {
				try {
					Files.copy(p, backup.resolve(p.getFileName()), StandardCopyOption.REPLACE_EXISTING);
					System.out.println(p.getFileName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			streamOrigem.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
