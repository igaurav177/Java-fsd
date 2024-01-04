package com.TestNg;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
    WebDriver wd = null;

    @BeforeTest
    public void initiate() {
        System.out.println("config initiated");
        // Register the webdriver => browser vendor
        WebDriverManager.chromedriver().setup();
        // Creating an object for the webdriver
        wd = new ChromeDriver();
        // Maximize the browser
        wd.manage().window().maximize();
    }

    @Test
    public void test1() {
        System.out.println("test1 initiated");
        wd.get("https://www.amazon.in/");        
        wd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone", Keys.ENTER);
    }

    @Test
    public void test2() {
        System.out.println("test2 initiated");
        wd.get("https://www.flipkart.com/");        
        wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("iphone", Keys.ENTER);
    }

    @AfterTest
    public void derefer() {
        System.out.println("wd closed");
        wd.close();
    }
}

