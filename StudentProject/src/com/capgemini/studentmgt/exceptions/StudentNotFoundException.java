package com.capgemini.studentmgt.exceptions;

public class StudentNotFoundException extends RuntimeException {

	/**
	 * @param message
	 */
	public StudentNotFoundException(String message) {
		super(message);
	}

}
