package com.exceptionhandling;



public class UserDefineMain {
	public static void main(String[] args) throws InvalidAgeException {

		AgeValidator ageobj=new AgeValidator();
		ageobj.ageValidation(4);

	}
}

