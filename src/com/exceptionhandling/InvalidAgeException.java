package com.exceptionhandling;
//rule 1: class need to extend superclass exception 

public class InvalidAgeException extends Exception {
	//rule -2 toString to print the exception definition 
	public InvalidAgeException(String msg) {
		super(msg);
	}


}
