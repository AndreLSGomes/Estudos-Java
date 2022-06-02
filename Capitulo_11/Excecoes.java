package Capitulo_11;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/*
	Fonte -> https://acervolima.com/excecoes-em-java/
	O que é uma exceção?
	
	Uma exceção é um evento indesejado ou inesperado, que ocorre durante a execução de um programa, ou seja, em tempo de execução, que interrompe o
	fluxo normal das instruções do programa.
	
	Hierarquia de exceção
	Todos os tipos de exceção e erros são subclasses da classe Throwable , que é a classe base da hierarquia.
	Um ramo é encabeçado por Exception.
	Esta classe é usada para condições excepcionais que os programas do usuário devem capturar.NullPointerException é um exemplo de tal exceção.
	Outro ramo, Error, são usados pelo sistema de tempo de execução Java ( JVM ) para indicar erros relacionados ao próprio ambiente de tempo de execução (JRE).
	
	Como a JVM trata uma exceção?
	Tratamento de exceções padrão: sempre que dentro de um método, se uma exceção ocorrer, o método cria um objeto conhecido como Objeto de exceção e o entrega
	ao sistema de tempo de execução (JVM).
	O objeto de exceção contém o nome e a descrição da exceção e o estado atual do programa em que a exceção ocorreu.
	Criar o Objeto de Exceção e tratá-lo no sistema de tempo de execução é chamado de lançamento de uma Exceção.
	Pode haver a lista dos métodos que foram chamados para chegar ao método em que a exceção ocorreu.
	Esta lista ordenada de métodos é chamada Call Stack.
	A partir daí os seguintes procedimentos acontecerão:
		1- O sistema de tempo de execução pesquisa a pilha de chamadas para encontrar o método que contém o bloco de código que pode manipular a exceção ocorrida.
		   O bloco do código é chamado de manipulador de exceções.
		2- O sistema de tempo de execução começa a pesquisar a partir do método no qual a exceção ocorreu, prossegue pela pilha de chamadas na ordem inversa em
		   que os métodos foram chamados.
		3- Se encontrar o manipulador apropriado, ele passa a exceção ocorrida para ele.
		   Manipulador apropriado significa que o tipo do objeto de exceção lançado corresponde ao tipo do objeto de exceção que ele pode manipular.
		4- Se o sistema de tempo de execução pesquisar todos os métodos na pilha de chamadas e não conseguir encontrar o manipulador apropriado, o sistema de tempo
		   de execução transfere o Objeto de Exceção para o manipulador de exceção padrão, que faz parte do sistema de tempo de execução.
		   Este manipulador imprime as informações de exceção no formato a seguir e termina o programa de forma anormal.
*/

public class Excecoes {
	
	public static void main(String[] ars) throws IOException {
		
		int i;
		
		// Bloco try com catch (exception)
		try {
			i = 1/0;
			System.out.print(i);
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("\nNão é possível dividir um inteiro por 0");
		}
		
		System.out.println("\n********************************************************************************\n");
		
		// Bloco try com catch (ArithmeticException e print e.printStackTrace)
		try {
			int x;
			x = 1/0;
			x = 2;
			System.out.print(x);
		}
		catch (ArithmeticException e) {
			System.out.println("Tratando a exceção: ");
			e.printStackTrace();
		}
		
		System.out.println("Continuação do código.........");
		
		System.out.println("\n********************************************************************************\n");
		
		/* 
			Bloco try mas manipulando mais de uma Exception IOException e ArithmeticException
			catch (IOException | ArithmeticException ex) {
			O IOException foi levado para a assinatura da classe
			
			Uma outra explicação -> https://www.devmedia.com.br/tratando-excecoes-em-java/25514
			Imagine uma situação em que não é desejado que uma exceção seja tratada na própria classe ou método, mas sim em outro método ou classe que venha lhe chamar.
			Para solucionar tal situação utilizamos o comando throws na assinatura do método com a possível exceção que o mesmo poderá a vir lançar.
			Sintaxe: tipo_retorno nome_metodo() throws tipo_exceção_1, tipo_exceção_2, tipo_exceção_n
			Na classe principal (main) poderíamos tratar a excessão, por exemplo.
			public static void main(String args[]){
				try {
					aumentarLetras();
				}
				catch(NullPointerException e) {
					System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras() "+e);
				}
			}
		*/
		try {
			int x;
			x = 1/0;
			System.out.print(x);
		}
		catch (ArithmeticException ex) {
			System.out.println(ex);
		}
		
		System.out.println("\n********************************************************************************\n");
		
		// Bloco try com catch e finally
		File file = null;
		InputStream is = null;
		try {
			file = new File("arquivo.txt");
			System.out.println("Imagine que o arquivo foi encontrado e manipulado pelo sistema");
			System.out.println("\nDepois disso manipulamos o arquivo");
			System.out.println("Porém após a manipulação o arquivo ainda está aberto, gerando uma falha de segurança, desperdício de recusos, dentre outras.");
			System.out.println("\nO 'finally' pode ser utilizado para fechar o arquivo, por exemplo.\n");
		}
		/*
			O finally neste caso é utilizado para evitar deixar o arquivo aberto.
		*/
		finally {
			is.close();
		}
		
		System.out.println("Continuação do código.........");
		
		System.out.println("\n********************************************************************************\n");
		
	}

}
