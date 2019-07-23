package Anudeep1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_02 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	 String h_count= driver.getWindowHandle();
	 System.out.println(h_count);
	  driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	 Set<String>  T_count=driver.getWindowHandles();
	 
	 for(String S:T_count)
	 {
		 driver.switchTo().window(S);
	 }
	 driver.findElement(By.linkText("Apply Now")).click();
  }
  
  
}
