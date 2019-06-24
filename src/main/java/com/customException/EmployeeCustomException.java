package com.customException;

/**
 * @author vbopche
 *
 */
public class EmployeeCustomException extends Exception {

	private static final long serialVersionUID = 1L;

	private final String msg;

	EmployeeCustomException(String message) {
		super(message);
		this.msg = message;
	}
@Override
	public String getMessage() {

		return "Exception :: " + msg;
	}
}
