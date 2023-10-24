package com.calculator;

import java.util.Scanner;

public class ArthimaticCalculator {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice\n+\n-\n*\n/\nPress 'e' to exit");
			char input = sc.next().charAt(0);

			if (input == 'e') {
				System.out.println("Exiting the calculator.");
				break; // Exit the loop
			}

			if (input != '+' && input != '-' && input != '*' && input != '/') {
				System.out.println("Invalid Input");
				continue; 
			}

			System.out.println("Enter two Numbers: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			switch (input) {
			case '+':
				int sum = num1 + num2;
				System.out.println("Sum of two numbers: " + sum);
				break;
			case '-':
				int subtraction = num1 - num2;
				System.out.println("Subtraction of two numbers: " + subtraction);
				break;
			case '*':
				int multiplication = num1 * num2;
				System.out.println("Multiplication of two numbers: " + multiplication);
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("Division by zero is not allowed.");
				} else {
					double division = (double) num1 / num2;
					System.out.println("Division of two numbers: " + division);
				}
				break;
			}
		}



	}

}
