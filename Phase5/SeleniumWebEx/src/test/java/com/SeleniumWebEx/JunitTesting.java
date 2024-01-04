package com.SeleniumWebEx;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTesting {
	 WebDriver wd=null;
		@Before
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
		public void test() throws InterruptedException {
			 wd.findElement(By.linkText("register")).click();
			 wd.findElement(By.name("name")).sendKeys("Priya");
			 wd.findElement(By.name("email")).sendKeys("priya@g.c");
			 wd.findElement(By.name("experience")).sendKeys("20");
			 wd.findElement(By.name("domain")).sendKeys("c");
			 wd.findElement(By.className("register")).click();
			 //msg
			 String actualresponse=wd.findElement(By.name("msg")).getText();
			 
//			 assertEquals("the user got added successfully ...!",actualresponse);
//			 wd.findElement(By.linkText("Edit")).click();
//			 Thread.sleep(2000);
		}
		
		@After
		public void close() {
			wd.close();
		}

}
