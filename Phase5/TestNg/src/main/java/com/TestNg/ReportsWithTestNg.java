package com.TestNg;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportsWithTestNg {
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
		
		Reporter.log("test1 scenario :  testing the url and the title for the google page" );
		System.out.println("test1 intiated");
		SoftAssert sa=new SoftAssert();
		wd.get("https://www.google.com/");
		String title=wd.getTitle();
		String url=wd.getCurrentUrl();
		assertEquals("Google", title);
		Reporter.log("when to test1 and tested with google title ");
		assertEquals("https://www.google.", url);
		Reporter.log("when to test1 and tested with google url ");
		//sa.assertAll();//provide all the issues at the last
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
