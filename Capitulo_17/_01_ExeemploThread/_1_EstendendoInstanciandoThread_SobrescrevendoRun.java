package Capitulo_17._01_ExeemploThread;

	/*
		Estender a classe Thread e sobrescrever o método run() são duas tarefas
		realizadas para definir que um código seja executado em uma thread à parte
 	*/

public class _1_EstendendoInstanciandoThread_SobrescrevendoRun extends Thread{

	//Sobrescrevendo o método run()
	public void run() {
		System.out.println("Algo executando em segmento");
	}

	/*
		String segmento refere-se ao parâmetro do método run() sobreposto,
		o qual será invocado apenas se uma chamada explícita for efetuada.
	*/
	public void run(String segmento) {
		System.out.println("A String em execução é: " + segmento);
	}

}