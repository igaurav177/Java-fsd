package com.oopspillars;

public class CalculatorImpl extends Calculator{

	@Override
	public void sum(int num1, int num2) {
		System.out.println(num1+num2); 
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}

}
