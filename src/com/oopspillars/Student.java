package com.oopspillars;

public class Student {
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String Name, int marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}


	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		Student gaurav = new Student(1,"Gaurav kumar",100);
		System.out.println(gaurav.toString());
		
		

	}

}
