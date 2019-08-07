package com.rest.services.exception;

public class UserServiceException extends RuntimeException {
	
	private static final long serialVersionUID = -8652627459554148088L;

	public UserServiceException(String message) {
		super(message);
	}
}
