package com.TestNg;
import org.testng.annotations.Test;

public class PrioritizeMethod {
	@Test(priority = 1)
	public void signup() {
		System.out.println("test sign up ");	
	}

	@Test(priority = 2)
	public void signIn() {
		System.out.println("test sign in ");	
	}

	@Test(priority = 3)
	public void search() {
		System.out.println("test search ticket ");	
	}

	@Test(priority = 4)
	public void book() {
		System.out.println("test book a ticket ");	
	}
	@Test(priority = 5)
	public void save() {
		System.out.println("test save a ticket");	
	}
	@Test(priority = 6)
	public void pay() {
		System.out.println("test pay a ticket ");	
	}
	@Test(priority = 7)
	public void logoff() {
		System.out.println("test logoff ");	
	}

}
