package com.exemplo.uploadDownload.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException{
	
	/*
		Fonte -> https://www.alura.com.br/artigos/entendendo-o-serialversionuid
	*/
	private static final long serialVersionUID = 1L;

	// Construtor
	public MyFileNotFoundException(String message) {
		super(message);
	}
	
	// Novo construtor para observar a causa da Exception
	public MyFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}