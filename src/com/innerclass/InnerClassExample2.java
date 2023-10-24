package com.innerclass;

public class InnerClassExample2 {
	private String msg ="This is inner class second example ";
	void display(){  
		class Inner{  
			void msg(){
				System.out.println(msg);
			}  
		}  
		Inner i=new Inner();  
		i.msg();
	}

	public static void main(String[] args) {
		InnerClassExample2  obj=new InnerClassExample2();  
		obj.display();  
	}
}


