package Demo567;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyDemo_03Test{
	WebDriver driver;
  @SuppressWarnings("unused")
@Test
	  public void launch() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		System.out.println("Launch");
		WebElement el1 = driver.findElement(By.xpath("//input[@name='q']"));
//		Actions act1 = new Actions(driver);
//		act1.keyDown(el1,Keys.SHIFT).sendKeys("Build").keyUp(Keys.SHIFT).build().perform();
//		Thread.sleep(3000);
//		act1.keyDown(el1,Keys.SHIFT).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).build().perform();
		driver.navigate();
		System.out.println("Code for asserting");
		Assert.assertEquals("11", "11");
		System.out.println("Comparison is true");
  }
}

