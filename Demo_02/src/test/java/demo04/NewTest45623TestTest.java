package demo04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest45623TestTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		String S = driver.switchTo().alert().getText();
		System.out.println(S);
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText());
		driver.close();
		
		
  }
}