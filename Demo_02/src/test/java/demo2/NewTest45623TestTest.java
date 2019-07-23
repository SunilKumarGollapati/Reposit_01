package demo2;

import java.util.Set;

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
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");
		String win_name1 = driver.getWindowHandle();
		System.out.println(win_name1);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
		System.out.println("Launch");
		Thread.sleep(5000);
		Set<String> Total_W = driver.getWindowHandles();
		int C_W = Total_W.size();
		System.out.println(C_W);
		for(String s:Total_W) {
			driver.switchTo().window(s);
			System.out.println(driver.getWindowHandles());
		}
		driver.findElement(By.linkText("Apply Now")).click();
  }
}
