package Capitulo_17._06_ExemploYeld;

public class Segmento extends Thread{
	
	public void run() {
		int i = 0;
		while(i <= 3) {
			System.out.println("***  Segmento ***");
			i++;
		}
	}

}