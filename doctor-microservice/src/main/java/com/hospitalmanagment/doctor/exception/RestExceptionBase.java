package com.hospitalmanagment.doctor.exception;

@SuppressWarnings("serial")
public class RestExceptionBase extends RuntimeException {

	private int debugId;

	public RestExceptionBase(String message, int debugId) {
		super(message);
		this.debugId = debugId;
	}

	public int getDebugId() {
		return debugId;
	}

}
