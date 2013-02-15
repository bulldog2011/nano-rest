package com.leansoft.nanorest.exception;

public class MarshallException extends RuntimeException {

	private static final long serialVersionUID = -236057207720848202L;

	public MarshallException() {
	}

	public MarshallException(String arg0) {
		super(arg0);
	}

	public MarshallException(Throwable arg0) {
		super(arg0);
	}

	public MarshallException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
