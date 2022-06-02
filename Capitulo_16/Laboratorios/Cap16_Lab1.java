package Capitulo_16.Laboratorios;

import java.io.*;
import java.util.Scanner;

public class Cap16_Lab1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma frase:");
		String texto = new String(scan.nextLine());
		scan.close();
		
		/*
			Chamando o método para criar o arquivo e
			escrever nele o texto enviado como parâmetro
		*/
		escrever(texto);
		
		/*
			Chamando o método para ler o arquivo criado anteriormente
		*/
		ler();

	}

	public static void escrever(String texto) {
		try {
			FileOutputStream arquivo = new FileOutputStream("src\\Capitulo_16\\Laboratorios\\Cap16_Lab1.txt");
			DataOutputStream dados   = new DataOutputStream(arquivo);
			dados.writeChars(texto);
			dados.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ler() {
		try {
			FileInputStream arquivo = new FileInputStream("src\\Capitulo_16\\Laboratorios\\Cap16_Lab1.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			while(dados.available() > 0) {
				char c = dados.readChar();
				System.out.print(c);
			}
			dados.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}