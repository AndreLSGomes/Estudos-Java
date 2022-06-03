package com.exemplo.chatApp.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.exemplo.chatApp.model.ChatMessage;

@Controller

//Método para controlar o envio de mensagens
public class ChatController {
	
	/*
		Anotação para mapear a Messageem um método de tratamento de mensagens, correspondendo
		o declarado patterns a um destino extraído da mensagem. A anotação também é suportada
		no nível do tipo, como forma de declarar um prefixo (ou prefixos) de padrão em todos
		os métodos de classe.
	*/
	@MessageMapping("/chat.sendMessage")
	
	/*
	A anotação que indica o valor de retorno de um método deve ser convertida para a Messagese
	necessário e enviada para o destino especificado.
	Em um cenário típico de solicitação/resposta, a entrada Messagepode transmitir o destino a
	ser usado para a resposta. Nesse caso, esse destino deve ter precedência.

	Esta anotação pode ser colocada em nível de classe, caso em que é herdada por métodos da classe.
	*/
	@SendTo("/topic/public")

	/*
	 	@PAYLOAD
		Anotação que vincula um parâmetro de método à carga útil de uma mensagem.
		Também pode ser usado para associar uma carga útil a uma invocação de método.
		A carga útil pode ser passada através de um 'MessageConverter' para convertê-la
		de um formato serializado com um tipo MIME específico para um objeto que
		corresponda ao parâmetro do método de destino.
	*/
	
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
		return chatMessage;
	}
	
	@MessageMapping("chat.addUser")
	@SendTo("/topic/public")
	
	// Método que controla o acesso de usuários à aplicação
	public ChatMessage addUser(@Payload ChatMessage chatMessage,
								SimpMessageHeaderAccessor headerAcessor
							  ) {
		
		/*
			Possibilitar a adição de um username e, consequentemente, um novo usuário
			na web socket session
		*/
		headerAcessor.getSessionAttributes().put("username", chatMessage.getSender());
		
		return chatMessage;
		
	}

}