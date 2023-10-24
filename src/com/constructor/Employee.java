package com.constructor;

public class Employee {
	
	// default constructor
	Employee(){
		double salary=100000;
		double bonus=10000;
		double totalSalary=bonus+salary;
		System.out.println("Total salary is: "+ totalSalary);

	}

	// parameterised constructor
	Employee(double salary,double bonus) {
		double totalSalary=bonus+salary;
		System.out.println("Total salary is: "+ totalSalary);
	}
	
	
	public static void main(String[] args) {
		
		// calling of default constructor
		Employee employee = new Employee();
		
		
		//calling of parameterised constructor
		Employee employee1 = new Employee(50000,5000);
		
	}

}
