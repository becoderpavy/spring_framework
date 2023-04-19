package com.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(NumberFormatException.class)
	public String numberExcption() {
		return "error";
	}

	@ExceptionHandler(NullPointerException.class)
	public String nullExcption() {
		return "error";
	}

	@ExceptionHandler(Exception.class)
	public String allExcption() {
		return "error";
	}

}
