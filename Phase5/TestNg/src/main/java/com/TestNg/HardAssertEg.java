package com.TestNg;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertEg {
	WebDriver wd=null;
	@BeforeTest
	public void intiate() {
		System.out.println("config intiated");
		//register the webdriver =>browser vendor 
				WebDriverManager.chromedriver().setup();
				//creating an object to the object
				 wd=new ChromeDriver();
				//maximize the browser
				wd.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		System.out.println("test1 intiated");
		wd.get("https://www.google.com/");
		String title=wd.getTitle();
		String url=wd.getCurrentUrl();
		assertEquals("Goog", title);
		System.out.println("continue flow");
		assertEquals("https://www.google.com/", url);
		
	}
	
	
	@Test
	public void test2() {
		System.out.println("test2 intiated");
		wd.get("https://www.adre.in/");
		
	}
	
	@AfterTest
	public void  derefer() {
		System.out.println("wd closed");
		wd.close();
	}
}


