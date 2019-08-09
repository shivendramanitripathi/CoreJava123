package com.uid.exception;

public class ServiceException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		
	}

	public ServiceException(String arg0) {
		super(arg0);
		
	}

	public ServiceException(Throwable arg0) {
		super(arg0);
		
	}

	public ServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

}
