package Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_01 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	  
  }
}
