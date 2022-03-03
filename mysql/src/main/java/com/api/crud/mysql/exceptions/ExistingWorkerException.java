package com.api.crud.mysql.exceptions;

public class ExistingWorkerException extends RuntimeException {

	private static final long serialVersionUID = -4871880047671714829L;

	public ExistingWorkerException() {}
	
	public ExistingWorkerException(String message) {
		super(message);
	}

}
