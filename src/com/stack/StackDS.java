package com.stack;

import java.util.Scanner;

public class StackDS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of a stack ");
		int size=sc.nextInt();
		int stack[]=new int[size];
		int top =-1;
		System.out.println("stack Operations ");
		while(true) {
			System.out.println();
			System.out.println("enter the choice 1. push 2.pop 3.display 4. exit ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:if(top==size-1) {
				System.out.println("the stack is full and no more inserts ..");
			}
			else {
				System.out.println("enter the ele into the stack : ");
				int key=sc.nextInt();
				top++;
				stack[top]=key;
			}
				
			break;
			case 2: if(top==-1) {
				System.out.println("stack is empty and no more deletions..");
			}
			else {
				System.out.println("the element deleted is "+stack[top]);
				top=top-1;
				
			}
			break;
			case 3: if(top==-1) {
				System.out.println("stack is empty ");
			}
			else {
				for(int i=top;i>=0;i--) {
					System.out.print(stack[i]+"-->");
				}
			}
			break;	
			case 4:System.exit(0);
				break;
			default:System.out.println("check ur choice ");
				break;
			}
		}

	}

}
