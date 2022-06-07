package com.exemplo.fullstackapp.exception;

import java.util.Date;

public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;

	// Constutor
	public ErrorDetails(Date timesstamp, String message, String details) {
		super();
		this.timestamp = timesstamp;
		this.message = message;
		this.details = details;
	}

	// Métodos acessores (apenas get)
	public Date getTimesstamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}