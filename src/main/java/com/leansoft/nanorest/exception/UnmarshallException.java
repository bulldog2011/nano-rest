package com.leansoft.nanorest.exception;

public class UnmarshallException extends RuntimeException {
	
	private static final long serialVersionUID = -6187730572931328511L;

	public UnmarshallException() {
	}

	public UnmarshallException(String message) {
		super(message);
	}

	public UnmarshallException(Throwable cause) {
		super(cause);
	}

	public UnmarshallException(String message, Throwable cause) {
		super(message, cause);
	}

}
