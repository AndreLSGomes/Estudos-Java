package Capitulo_17._01_ExeemploThread;

	/*
		Estender a classe Thread e sobrescrever o m�todo run() s�o duas tarefas
		realizadas para definir que um c�digo seja executado em uma thread � parte
 	*/

public class _1_EstendendoInstanciandoThread_SobrescrevendoRun extends Thread{

	//Sobrescrevendo o m�todo run()
	public void run() {
		System.out.println("Algo executando em segmento");
	}

	/*
		String segmento refere-se ao par�metro do m�todo run() sobreposto,
		o qual ser� invocado apenas se uma chamada expl�cita for efetuada.
	*/
	public void run(String segmento) {
		System.out.println("A String em execu��o �: " + segmento);
	}

}