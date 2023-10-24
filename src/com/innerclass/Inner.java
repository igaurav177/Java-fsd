package com.innerclass;

public class Inner{

	public static void main(String[] args) {
		InnerClassExample3 in = new InnerClassExample3() {

			public void show() {
				System.out.println("This is abstract inner class example");
			}
		};
		in.show();

	}
}
