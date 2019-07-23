package Anudeep1;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class Handson_07 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  	  driver =new ChromeDriver();
	  	  driver.get("http://10.232.237.143:443/TestMeApp");
	  	  driver.manage().window().maximize();
	  	  Thread.sleep(5000);
	  	  WebElement T_1=driver.findElement(By.xpath("//span[text() ='AboutUs']"));
	  	  Actions act=new Actions(driver);
	  	  act.moveToElement(T_1).build().perform();
	  	 WebElement T_2=driver.findElement(By.xpath("//span[contains(text(),'Our')]"));
	  	  Actions act2=new Actions(driver);
	  	  act2.moveToElement(T_2).build().perform();
	  	driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
	  	Set<String> T_count=driver.getWindowHandles();
	  	for(String S:T_count)
	  	{
	  		driver.switchTo().window(S);
	  		
	  	}
	  	driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  String address=driver.findElement(By.xpath("//div[@class='contact-info']")).getText();
	  	System.out.println(address);
	  	
	  	 
	 	 
	    }
	  

  }

