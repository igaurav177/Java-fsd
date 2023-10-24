package com.accessmodifier;

public class PrivateAccessMain {

	public static void main(String[] args) {
		PrivateAccessSpecifier priAccessSpecifier = new PrivateAccessSpecifier();
		System.out.println("calling show method of PrivateAccessSpecifier class");
		// this is not access outside the class because it is private method
//		priAccessSpecifier.show();

	}

}
