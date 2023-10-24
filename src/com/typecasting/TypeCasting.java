package com.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Implicit TypeCasting
		System.out.println("Implicit Type Casting ");
		int n=96;
		System.out.println("Value of num is:"+ n);
	
		float b=n;
		System.out.println("Value of b is: "+b);
		
		long c=n;
		System.out.println("Value of c is: "+c);
		
		double d=n;
		System.out.println("Value of d is: "+d);
		
				
		// Explicit Type Casting
		
		System.out.println("Explicit Type Casting");
		
		double x=10.10;
		
		int y= (int)x;
		System.out.println("value of x is:"+ x);
		System.out.println("value of y is:"+ y);


	}

}
