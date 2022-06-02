package Capitulo_04;

public class Continue {

	public static void main(String[] args) {

		int num = 0;
		while(num < 10) {
			++num;
			if (num == 5) {
				// O comando 'continue' fará com o que o programa vá diretamente para o teste da condição (while neste caso)
				System.out.println("------------------");
				continue;
			}
			System.out.println("O valor de num = " + num);
		}
	}

}
