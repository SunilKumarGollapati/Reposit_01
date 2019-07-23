package Anudeep1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardDemo_09 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.get("https://google.co.in/");
		driver.manage().window().maximize();
	WebElement El1=	driver.findElement(By.xpath("//input[@name='q']"));
		Actions action=new Actions(driver);
		action.keyDown(El1,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();;
		Thread.sleep(5000);
		action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
  }
}
