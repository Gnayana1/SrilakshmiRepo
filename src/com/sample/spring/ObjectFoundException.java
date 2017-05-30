package com.sample.spring;

public class ObjectFoundException extends RuntimeException{
	private ApplicationErrorMessage applicationErrorMessage;
	
	
	public ApplicationErrorMessage getApplicationErrorMessage() {
		return applicationErrorMessage;
	}


	public void setApplicationErrorMessage(ApplicationErrorMessage applicationErrorMessage) {
		this.applicationErrorMessage = applicationErrorMessage;
	}


	public ObjectFoundException(ApplicationErrorMessage e) {
		this.applicationErrorMessage=e;
	}

}
