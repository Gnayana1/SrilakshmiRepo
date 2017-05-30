package com.sample.spring;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
@ExceptionHandler(ObjectFoundException.class)
	public ResponseEntity<ApplicationErrorMessage>objectFoundExcpeyion(ObjectFoundException ex){
	System.out.println(ex.getApplicationErrorMessage().getErrorMessage());
	return new ResponseEntity<ApplicationErrorMessage>(ex.getApplicationErrorMessage(),HttpStatus.NOT_FOUND);
}
}
    