/**
 * 
 */
package com.uid.exception;

/**
 * @author M1012783
 *
 */
public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ApplicationException() {
		
	}

	/**
	 * @param arg0
	 */
	public ApplicationException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public ApplicationException(Throwable arg0) {
		super(arg0);
	
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ApplicationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

}
