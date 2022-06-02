package com.exemplo.uploadDownload.exception;

public class FileStorageException extends RuntimeException{
	
	/*
		Fonte -> https://www.alura.com.br/artigos/entendendo-o-serialversionuid
	*/
	private static final long serialVersionUID = 1L;

	// Construtor
	public FileStorageException(String message) {
		super(message);
	}
	
	// Novo construtor para observar a causa da Exception
	public FileStorageException(String message, Throwable cause) {
		super(message, cause);
	}

}