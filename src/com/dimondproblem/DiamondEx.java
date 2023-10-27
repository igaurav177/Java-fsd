package com.dimondproblem;

public class DiamondEx implements FirstInterface, SecondInterface {
	 public void display() {
	        // Calling the default show() methods from both interfaces
	        FirstInterface.super.display();
	        SecondInterface.super.display();
	    }
	public static void main(String[] args) {
		DiamondEx diamondObj = new DiamondEx();
		diamondObj.display();
		
	}

}
