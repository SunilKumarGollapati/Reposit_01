package Anudeep1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handson_05 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	 
	  driver.findElement(By.xpath("//input[@value='Check Availability']")).click();
	  Thread.sleep(5000);
//  String S =driver.switchTo().alert().getText();
//  System.out.println(S);
 
  System.out.println(driver.switchTo().alert().getText());
  driver.switchTo().alert().accept();
  //driver.quit();
  }
}
