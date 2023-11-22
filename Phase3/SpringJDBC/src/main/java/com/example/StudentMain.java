package com.example;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter student id value ");
//		s.setId(sc.nextInt());
//		System.out.println("enter student name value ");
//		s.setName(sc.next());
//		System.out.println("enter student email value");
//		s.setEmail(sc.next());
//		if(dao.insert(s)>0) {
//			System.out.println("inserted the record into the student table ");
//		}
//		else {
//			System.out.println("insertion failed ");
//		}
//		
		
//		System.out.println("Enter student id which you want to delete: ");
//		s.setId(sc.nextInt());
//		if(dao.delete(s)>0) {
//			System.out.println("For student id: "+s.getId()+" record is deleted.");
//		}else {
//			System.out.println("Deletion failed");
//		}
		
		System.out.println("Enter student id which you want to update email for: ");
		int id=sc.nextInt();
		System.out.println("Enter student email id which you want to update:");
		String email= sc.next();
		
		
		if(dao.update(id,email)>0) {
			System.out.println("For student id: "+id+" record is updated.");
		}else {
			System.out.println("Updation failed");
		}
		
		
		
		
		
		
		
//		System.out.println("via preparedstatement");
//		Student getstudent=dao.getDetails("karthik");
//		System.out.println(getstudent);
//		System.out.println("via direct result ");
//		List<Student> getall=dao.getallstudents();
//		for(Student student:getall) {
//			System.out.println(student);
//		}
		
	}

}
