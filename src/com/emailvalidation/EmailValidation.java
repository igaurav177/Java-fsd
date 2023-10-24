package com.emailvalidation;

public class EmailValidation {
	
	//check email id is valid or not 
	public boolean searchEmail(String emailToSearch, String[] emailArr) {
		for (String email : emailArr) {
			if (emailToSearch.equals(email)) {
				return true;
			}
		}
		return false;

	}

}
