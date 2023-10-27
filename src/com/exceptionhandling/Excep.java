package com.exceptionhandling;

public class Excep {
	public static void main(String[] args) {
		try {
		int b[]= {2,3,4,5,67};
		b[12]=24;
			int a=50/0;
		
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {   //best practice 
			e.printStackTrace();
		}
		System.out.println("Program close");
	}
	
}
