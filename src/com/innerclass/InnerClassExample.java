package com.innerclass;

public class InnerClassExample {
		
	class InnerClass{
		void display() {
			System.out.println("This is inner class method");
		}
		
	}
	public static void main(String[] args) {
		InnerClassExample obj =new InnerClassExample();
		InnerClassExample.InnerClass in=  obj.new InnerClass();
		in.display();
	}
		
}
