package com.emailvalidation;

import java.util.Scanner;

public class EmailValidationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many email id do you want to insert?");
		int input = sc.nextInt();
		String emails[]=new String[input];
		for(int i=0;i<input;i++) {
			emails[i]=sc.next();
		}

		System.out.print("Enter the email ID you want to search for: ");
		String emailToSearch = sc.next();

		EmailValidation emailValidationObj = new EmailValidation();
		boolean isFound = emailValidationObj.searchEmail(emailToSearch, emails);

		// Display the result
		if (isFound) {
			System.out.println("Email ID " + emailToSearch + " found in the list.");
		} else {
			System.out.println("Email ID " + emailToSearch + " not found in the list.");
		}



	}

}
