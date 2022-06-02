package Capitulo_16._01_CriacaoArquivoTxt;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CriandoArquivoTxt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma frase:");
		String texto = new String(scan.nextLine());
		scan.close();
		
		try {
			FileOutputStream arquivo = new FileOutputStream("src/Capitulo_16./GerarArquivo.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);
			dados.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
