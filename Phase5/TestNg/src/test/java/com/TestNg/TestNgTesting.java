package com.TestNg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTesting {
	 WebDriver wd=null;
		@BeforeTest
		public void activate() {
			WebDriverManager.chromedriver().setup();
	        //creating an object to the object
			wd=new ChromeDriver();
	        //maximize the browser
	        wd.manage().window().maximize();
	        
	        //go to browser and open this url 
	        wd.get("http://localhost:4200/register");
		}
		@Test
		public void insert() throws InterruptedException {
			 wd.findElement(By.linkText("register")).click();
			 wd.findElement(By.name("name")).sendKeys("iya");
			 wd.findElement(By.name("email")).sendKeys("iya@g.c");
			 wd.findElement(By.name("experience")).sendKeys("20");
			 wd.findElement(By.name("domain")).sendKeys("c++");
			 wd.findElement(By.className("register")).click();
			 //msg
			 String actualresponse=wd.findElement(By.name("msg")).getText();
			 
//			 assertEquals("the user got added successfully ...!",actualresponse);
//			 wd.findElement(By.linkText("Edit")).click();
//			 Thread.sleep(2000);
		}
		
		@Test
		public void delete() {
			SoftAssert sa=new SoftAssert();

		     wd.get("http://localhost:4200/search");
			 wd.findElement(By.linkText("Delete")).click();
			 sa.assertAll();
		}
		
		
//		
		@AfterTest
		public void close() {
			wd.close();
		}
}
