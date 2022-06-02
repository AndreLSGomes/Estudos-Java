package Capitulo_04;

public class Break {

	public static void main(String[] args) {
		
		int i;
		for (i = 1; i < 11; i++) {
			if(i == 5)
				break;
				System.out.println("O valor de i = " + i);
		}
		System.out.println("Saindo do laço FOR " + i);
	}

}