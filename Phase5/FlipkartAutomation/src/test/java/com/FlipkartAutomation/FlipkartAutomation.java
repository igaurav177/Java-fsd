package com.FlipkartAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;




public class FlipkartAutomation {
	
	WebDriver webdriver = null;

	@Before
	public void Start() throws Exception {

		 WebDriverManager.chromedriver().setup();
	     WebDriver wd=new ChromeDriver();
	     wd.manage().window().maximize();

			webdriver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	     webdriver.manage().window().maximize();
		

	}

	@Test
	public void home() throws InterruptedException {
		webdriver.get("https://www.flipkart.com/");
		
		
		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		

	}

	@Test
	public void search() {
		
		webdriver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("iphone 13");
		webdriver.findElement(By.cssSelector("button[type='submit']")).click();

		
	}

	@Test 
	public void pageHeight() {

		JavascriptExecutor js = (JavascriptExecutor) webdriver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	@After
	public void end() {
		
		System.out.println("Testing Ended successfully");
		webdriver.close();
	}
	
	
	
	
	
}
