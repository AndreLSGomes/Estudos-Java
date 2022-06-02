package Capitulo_11.Laboratorios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Digite uma frase: ");
			String texto = scan.nextLine();
			scan.close();
			
			PrintWriter writer = new PrintWriter("C://doc1.txt");
			writer.println(texto);
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas!");
		}
		
	}

}
