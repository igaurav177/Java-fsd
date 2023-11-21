package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{   
	public static void main( String[] args )
{
	// Airtel airtel=new Airtel();
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	//via class name 
	Airtel airtel=ac.getBean(Airtel.class);
	//via identifier 
	//	Airtel airtel=(Airtel) ac.getBean("airtel");
	airtel.dataTypeOfSim();
	airtel.typeOfSim();
}

}
