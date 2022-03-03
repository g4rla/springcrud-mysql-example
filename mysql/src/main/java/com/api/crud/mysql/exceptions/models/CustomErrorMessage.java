package com.api.crud.mysql.exceptions.models;

public class CustomErrorMessage {

	private String message;

	public CustomErrorMessage() {}
	
	public CustomErrorMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomErrorMessage [message=" + message + "]";
	}
	
}
