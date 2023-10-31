package com.queue;

import java.util.Scanner;

public class QueueImp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of a queue ");
		int size=sc.nextInt();
		int queue[]=new int[size];
		int front=-1,rear =-1;
		System.out.println("Queue Operations ");
		while(true) {
			System.out.println();
			System.out.println("enter the choice 1. insert 2.delete 3.display 4. exit ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: if(rear==size-1) {
				System.out.println("Queue overflow");
			}
			else {
				front=0;
				System.out.println("Enter the ele to enter");
				int key=sc.nextInt();
				rear++;
				queue[rear]=key;
			}
			break;
			case 2: if(front==-1||front>rear) {
				System.out.println("queue underflow");
			}
			else {
				System.out.println("Element deleted is : "+queue[front]);
				front++;
			}
			break;
			case 3: if(front==-1 || front>rear) {
				System.out.println("queue is empty ");
			}
			else {
				for(int i=front;i<=rear;i++) {
					System.out.print(queue[i]+"-->");
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