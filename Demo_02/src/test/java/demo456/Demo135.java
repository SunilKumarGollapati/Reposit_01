package demo456;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo135 {
	
  @Test
  
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement El1 = driver.findElement(By.xpath("//a[text()='DEALS']"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(El1).build().perform();
		
  }
}
