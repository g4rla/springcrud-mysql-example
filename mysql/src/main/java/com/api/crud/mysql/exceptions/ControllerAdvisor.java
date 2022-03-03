package com.api.crud.mysql.exceptions;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.api.crud.mysql.exceptions.models.CustomErrorMessage;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	private static final String ID_OUTSOURCED_WORKER_ALREADY_EXISTS = "id_outsourced_worker already exists.";

	@ExceptionHandler(ExistingWorkerException.class)
	public ResponseEntity<Object> handleCityNotFoundException() {
		return new ResponseEntity<>(buildCustomErrorMessage(ID_OUTSOURCED_WORKER_ALREADY_EXISTS), UNPROCESSABLE_ENTITY);
	}

	private CustomErrorMessage buildCustomErrorMessage(String message) {
		return new CustomErrorMessage(message);
	}

}
