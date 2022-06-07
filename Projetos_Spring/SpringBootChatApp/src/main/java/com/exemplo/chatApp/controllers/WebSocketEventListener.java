package com.exemplo.chatApp.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.exemplo.chatApp.model.ChatMessage;

import org.slf4j.Logger;

/*
	Podemos usar @Component em todo o aplicativo para marcar os beans como componentes
	gerenciados do Spring. O Spring apenas pegará e registrará beans com @Component e
	não procurará @Service e @Repository em geral.
	
	O Spring suporta a anotação @Component desde de sua versão 2.5, e a mesma serve para
	indicar ao framework que aquela classe é um bean que deverá ser administrado pela
	implementação de IoC Container do Spring.
	
	Quando uma classe é anotada com @Component significa que a mesma usará o padrão de injeção de depêndencia,
	e será elegível para auto-configuração e auto-detecção de beans anotados à partir de escaneamento de classpath
	que o IoC Container do Spring faz.

	Ao carregar a aplicação, o Spring escanea o classpath atrás de classes anotadas com
	@Component ou especializações para então criar uma instância com escopo do tipo singleton
	por padrão, ou seja, os beans são stateless (não devem guardar estado), assim não sendo
	necessário uma nova instância do bean a cada vez que houver uma referência.
*/
@Component
public class WebSocketEventListener {
	
	// Criar uma propriedade para "nonitorar" as ocorrências eventuais deste componente
	private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);
	
	// Injeção de dependência
	@Autowired
	private SimpMessageSendingOperations messagingTemplate;
	
	/*
		Anotação que marca um método como ouvinte para eventos do aplicativo.
		Se um método anotado oferecer suporte a um único tipo de evento, o método poderá declarar um
		único parâmetro que reflita o tipo de evento a ser escutado. Se um método anotado oferecer suporte
		a vários tipos de eventos, essa anotação poderá se referir a um ou mais tipos de eventos suportados
		usando o classes atributo.
	*/
	@EventListener
	// Método para verificar se as conexões estão estabelecidas
	public void handleWebSocketConnectListenner(SessionConnectedEvent event) {

		logger.info("Uma nova conexão - via websocket - acaba de ocorrer");
		
	}
	
	// Escutando a desconexão
	@EventListener
	public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {

		/*
			StompHeaderAccessor
			Pode ser usado para preparar cabeçalhos para uma nova mensagem STOMP ou para acessar e/ou
			modificar cabeçalhos específicos de STOMP de uma mensagem existente.
			
			Use um dos métodos estáticos de fábrica nesta classe, chame getters e setters e, no final,
			se necessário, chame NativeMessageHeaderAccessor.toMap() para obter os cabeçalhos atualizados
			ou chame toNativeHeaderMap()para obter apenas os cabeçalhos específicos do STOMP.
			
			Fonte -> https://medium.com/@paulouskipsk/usando-o-spring-boot-para-implementa%C3%A7%C3%A3o-do-websocket-com-stomp-cf02155f8c4d
		*/
		StompHeaderAccessor headerAcessor = StompHeaderAccessor.wrap(event.getMessage());
		
		String username = (String) headerAcessor.getSessionAttributes().get("username");
		
		// Verificando se o nome do usuário existe
		if (username != null) {
			
			logger.info("Usuário " + username +" desconectou!");
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setType(ChatMessage.MessageType.LEAVE);
			chatMessage.setSender(username);
			
			messagingTemplate.convertAndSend("/topic/public", chatMessage );
		}
		
	}

}