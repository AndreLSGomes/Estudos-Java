package Capitulo_16._03_Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ExemploFiles {

	public static void main(String[] args) {

		try {

			// Setandos as variáveis de path
			Path arquivo   = Paths.get("src\\Capitulo_16.\\GerarArquivo.txt");
			Path novaPasta = Paths.get("src\\Capitulo_16.\\Textos");
			Path pasta     = Paths.get("src\\Capitulo_16");
			
			// Métodos para manipular diretórios e arquivos
			if (!Files.exists(arquivo)) {
				System.out.println("O arquivo / diretório não existe!");
			}
			else if(Files.isDirectory(arquivo)) {
				System.out.println("O item é um diretório");
			}
			else if(Files.isRegularFile(arquivo)) {
				System.out.println("O item é um arquivo");
			}
			
			// Exibindo o tamanho do arquivo
			System.out.println(Files.size(arquivo));
			
			// Criando o diretório rascunhos
			Files.createDirectories(novaPasta);
			
			// Exibe o conteúdo do diretório Capitulo_16
			Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));
			
			// Copia o arquivo para outro path
			Path novoPath = Paths.get("src\\Capitulo_16.\\Textos\\arquivoCopiado.txt");
			Files.copy(arquivo, novoPath, StandardCopyOption.REPLACE_EXISTING);
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
