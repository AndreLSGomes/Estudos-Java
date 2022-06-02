package com.exemplo.saudacao.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.saudacao.model.Saudacao;

	/*
		A annotation @RestController no Spring MVC nada mais é do que uma combinação das annotations @Controller e @ResponseBody.
		
		A diferença fundamental entre um aplicativo web e uma API REST é que a resposta de um aplicativo da web é uma visualização
		geral de HTML + CSS + JavaScript enquanto a API REST apenas retorna dados em forma de JSON ou XML.
		Essa diferença também é óbvia nas anotações @Controller e @RestController. O trabalho do @Controller é criar um Map do model
		object e encontrar uma view, mas o @RestController simplesmente retorna o objeto e os dados do objeto são gravados diretamente
		na resposta HTTP como JSON ou XML.
		
		Isso também pode ser feito com o @Controller tradicional e o uso da anotação @ResponseBody, mas como esse é o comportamento
		padrão dos serviços RESTful, o Spring criou o @RestController que combina o comportamento do @Controller e do @ResponseBody.
		
		Fonte -> https://medium.com/@gcbrandao/diferen%C3%A7a-entre-restcontroller-e-controller-annotation-no-spring-mvc-e-rest-8533998a93eb
		
		************************************************************************************************************************************
		
		Um Controller é responsável tanto por receber requisições como por enviar a resposta ao usuário, algo bem parecido com o Servlet do JSP.
		Porém, é feito de forma mais elegante e fácil. O Controller se responsabiliza por informar a View, os atributos que serão visíveis para
		a mesma e também por receber parâmetros vindos da View. E, por último, responder ao usuário o que foi requisitado.
		
		Fonte -> https://www.devmedia.com.br/controlando-o-spring-mvc/26265
	*/
@RestController

public class SaudacaoController {

	private static final String valorPadrao = "Olá, %s!";
	private final AtomicLong contador       = new AtomicLong();
	
	/*
		Essa anotação mapeia solicitações 'HTTP' para métodos de manipulador de controladores MVC e REST.
		
		Para configurar o mapeamento de solicitações da web, usamos a anotação '@RequestMapping'.
		
		A anotação '@RequestMapping' pode ser aplicada a nível de classe ou a nível de método em um controlador.
		A anotação de nível de classe mapeia um caminho ou padrão de solicitação específico em um controlador.
		Você pode então aplicar anotações de nível de método adicionais para tornar os mapeamentos mais específicos
		para os métodos do manipulador.
		
		Fonte -> https://springframework.guru/spring-requestmapping-annotation/
	*/
	@RequestMapping("/saudacao")
	
	
	/*
		Ao mapear a '@RequestParam' eu estou dizendo ao método que ele deve esperar como parâmetro um 'nome'
		como uma String, ou seja, ao acessar '/saudacao?name=SEUNOMEAQUI' o parâmetro nome será atribuído a
		variável 'name', e o 'Model' se encarregará de enviá-lo como atributo a tela (view).
		
		Mas e se o parâmetro não for passado, o que acontecerá?
		Em defaultValue definimos um valor default para que tratemos este caso.
		
		Mas caso não seja definido um valor default então será retornado um erro: “Required String parameter 'name' is not present”.
		Para a segurança e garantia do funcionamento da aplicação isso é ótimo, mas caso não queria que o
		parâmetro seja obrigatório, basta mapeá-lo como '@RequestParam(required = false)', e 'name' recebe null,
		e nenhum erro será retornado.
		
		Fonte -> https://www.devmedia.com.br/controlando-o-spring-mvc/26265
	*/
	public Saudacao saudar(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		/*
			A classe 'Saudacao' possui dois atributos: id e content.
			Iremos instanciar esta classe agora passando estes como argumento, como definido em seu construtor.
		*/
		return new Saudacao(contador.incrementAndGet(), String.format(valorPadrao, name));
	}
}