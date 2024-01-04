import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTest {
	 WebDriver wd=null;
	@Before
	public void activate() {
		WebDriverManager.chromedriver().setup();
        //creating an object to the object
		wd=new ChromeDriver();
        //maximize the browser
        wd.manage().window().maximize();
        
        //go to browser and open this url 
        wd.get("http://localhost:8080/JdbcSelenium/index.jsp");
	}
	
	
	@Test
	public void test() throws InterruptedException {
		 wd.findElement(By.name("addBtn")).click();
		 wd.findElement(By.name("pid")).sendKeys("6");
		 wd.findElement(By.name("pname")).sendKeys("apple");
		 wd.findElement(By.name("pcost")).sendKeys("20");
		 wd.findElement(By.id("addBtnproduct")).click();
		 //msg
		 String actualresponse=wd.findElement(By.name("msg")).getText();
		 
		 assertEquals("the product got added successfully ...!",actualresponse);
//		 wd.findElement(By.linkText("Edit")).click();
		 Thread.sleep(2000);
	}
	
	@After
	public void close() {
		wd.close();
	}

}

