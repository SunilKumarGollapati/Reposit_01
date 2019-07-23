package Anudeep1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Handson_04 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a[@href='/htdocs/nri_banking/accounts/fixed_deposits/fixed_deposits.htm']")).click();
	  Set<String> T_count=driver.getWindowHandles();
	  int c_count=T_count.size();
	  System.out.println(c_count);
	  for(String S :T_count )
	  {
	  	driver.switchTo().window(S);
	  	System.out.println(driver.getWindowHandle());
	  }
	
	  driver.findElement(By.xpath("//img[@alt='Loans']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'Attractive interest rates')]")).getText(),"Attractive interest rates"); 
		  System.out.println("its found");
	  
	  
	
  }
}
