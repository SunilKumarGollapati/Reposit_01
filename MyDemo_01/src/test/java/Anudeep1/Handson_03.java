package Anudeep1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handson_03 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	   String Win_name1=driver.getWindowHandle();
	   System.out.println(Win_name1);
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	   Thread.sleep(5000);
	   Set<String> Total_windows=driver.getWindowHandles();
	    int Cnt_windows=Total_windows.size();
	    System.out.println(Cnt_windows);
for(String S :Total_windows )
{
	driver.switchTo().window(S);
	System.out.println(driver.getWindowHandle());
}
driver.findElement(By.linkText("Apply Now")).click();
  }
}
