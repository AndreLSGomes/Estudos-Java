package com.exemplo.chatApp.config;

	/*
		A API WebSocket fornece um protocolo de comunicação full-duplex e bidirecional
		através um uma única conexão TCP.
		Full-duplex significa que um cliente e um servidor podem enviar mensagens
		independentes um dos outros. O conceito de bidirecional significa
		que um cliente pode enviar uma mensagem para um servidor e vice versa.
	*/

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*
	Indica que uma classe declara um ou mais métodos @Bean e pode ser processada pelo
	contêiner Spring para gerar definições de bean e solicitações de serviço para esses
	beans em tempo de execução .
*/
@Configuration

/*
	Adicione esta anotação a uma @Configurationclasse para habilitar o sistema de mensagens
	com suporte do broker no WebSocket usando um subprotocolo de mensagens de nível superior.
*/
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

	/*
		Stomp -> Simple Text Orientated Messaging Protocol
				 É um protocolo de mensagens orientado a texto simples.
				 O protocolo STOMP é comumente usado dentro de um soquete da web quando um aplicativo
				 da web precisa dar suporte à comunicação bidirecional com um servidor da web.
	*/
	// Este método registra o endpoint para que as aplicações no Front-End utilizem o websocket
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws").withSockJS();
	}
	
	@Override
	// Configurar um engine de mensagens (roteador de mensagens)
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.setApplicationDestinationPrefixes("/app");
		registry.enableSimpleBroker("/topic");
	}
	
}