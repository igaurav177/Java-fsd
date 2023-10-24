package com.methods;

public class Methods {
	
	//method 
	public int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	// call by value
	public int sub(int num1,int num2) {
		return num1-num2;
	}

	// method overloading
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	


	public static void main(String[] args) {
		Methods methodObj= new Methods();
		
		int sumOfTwoNumber=methodObj.add(10, 20);
		System.out.println("Sum of two number is: "+sumOfTwoNumber);
		
		// call by value
		System.out.println("Subtraction of two number is:"+methodObj.sub(20, 10));
		
		//method overloading
		int sumOfThreeNumber = methodObj.add(10, 20, 30);
		System.out.println("Sum of three numbers are:" +sumOfThreeNumber);
	}

}
