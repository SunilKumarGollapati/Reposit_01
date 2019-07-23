package demo456;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Demo1234 {
	WebDriver driver;
  @Test
  public void pass() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='chkavailabilityBtn']")).click();
		if(ExpectedConditions.alertIsPresent()!=null)
		{
			Alert altr1 = driver.switchTo().alert();
			System.out.println(altr1.getText());
			altr1.accept();
		}
		else 
		{
			System.out.println("no alerts");
		}
	
  }
}
