package Capitulo_16._02_LendoArquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeituraDeArquivos {

	public static void main(String[] args) {
		
		// declarando as variaveis
		FileInputStream arquivo = null;
		DataInputStream dados = null;

		try {
			arquivo = new FileInputStream("src/Capitulo_16./GerarArquivo.txt");
			dados = new DataInputStream(arquivo);
			while(true) {
				char c = dados.readChar();
				System.out.print(c);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		// tentando fechar o stream
		finally {
			try {
				if(arquivo != null){
					arquivo.close();
				}
				if(dados != null){
					dados.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}