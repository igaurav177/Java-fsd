package com.SeleniumWebEx;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws InterruptedException, IOException
    {
    	//register the web driver =>browser vendor 
        WebDriverManager.chromedriver().setup();
        //creating an object to the object
        WebDriver wd=new ChromeDriver();
        //maximize the browser
        wd.manage().window().maximize();
        
        //webpage timebound 
//        wd.manage().timeouts().pageLoadTimeout(1,TimeUnit.MILLISECONDS);
        
        //go to browser and open this url 
        wd.get("https://www.amazon.in/");
        takeScreenShot(wd,"abc");
        
        //access alert 
//        wd.get("http://127.0.0.1:5500/index.html");
//        Alert alert=wd.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		Thread.sleep(2000);
        

//		  wd.get("http://127.0.0.1:5500/index.html");
//          wd.findElement(By.xpath("/html/body/button")).click();
//          Alert alert=wd.switchTo().alert();
//          System.out.println(alert.getText());
//          alert.dismiss();
//          Thread.sleep(2000);

        //implicitly 
//        wd.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);

        WebElement we1=wd.findElement(By.linkText("Start here."));             
		explictLink(wd,we1,200);
		WebElement we2=wd.findElement(By.id("ap_customer_name"));
		explictField(wd,we2,400,"abcd");

 

        
//        wd.findElement(By.className("name")).sendKeys("Vicky singh");
//        wd.findElement(By.name("email")).sendKeys("v33@gmail.com");
//        wd.findElement(By.className("experience")).sendKeys("2");
//        wd.findElement(By.className("domain")).sendKeys("Java");
//        wd.findElement(By.className("register")).click();
//        
//        Thread.sleep(2000);
        
        
		//till we get the element 
//		WebElement we=wd.findElement(By.linkText("Help"));
//		js.executeScript("arguments[0].scrollIntoView();",we);
//		we.click();
		
		
		JavascriptExecutor js=(JavascriptExecutor) wd;
		//no of pixels move down
		
	//	js.executeScript("window.scrollBy(0,1000)");

		
		//scroll down last of the page 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenShot(wd,"def");
		//file+i->increment i
		wd.close();

        
        
        
        
        //close browser
        wd.close();	

    }
    
    

	private static void explictLink(WebDriver wd, WebElement we1, int timeout) {
		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we1));
		we1.click();
	}
	private static void explictField(WebDriver wd, WebElement we2, int timeout, String value) {
		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we2));
		we2.sendKeys(value);

	}

	//taking screenshot
	public static void takeScreenShot(WebDriver wd,String fileName) throws IOException {
		//take the screenshot and store it as a file format 
		File file=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//copy the screen shot to the specified location
		FileUtils.copyFile(file,new File("D:\\Screenshots\\"+fileName+".png"));
		
		
	}

	

}
