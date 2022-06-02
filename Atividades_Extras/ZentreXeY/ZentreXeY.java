package Atividades_Extras.ZentreXeY;

import java.util.Scanner;

public class ZentreXeY {

	public static void main(String[] args) {

		// Crie um algoritmo que leia dois valores (x e y) representando um intervalo. Em seguida, leia um novo valor (z) e verifique se z pertence ao intervalo [x, y].
		
		Scanner scan = new Scanner(System.in);
		
		// Recebendo os números do usuário
		System.out.print("Digite o primeiro número: ");
		int x = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int y = scan.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int z = scan.nextInt();
		
		// Verificando x está entre x e y
		if (z > x && z < y) {
			System.out.println("O número (" + z + ") está entre os números " + x + " e " + y);
		}
		else {
			System.out.println("O número (" + z + ") não está entre os números " + x + " e " + y);
		}
		
		scan.close();

	}

}
