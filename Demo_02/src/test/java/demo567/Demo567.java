package demo567;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo567{
	
  @Test
  
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		Actions act1 = new Actions(driver);
		WebElement El1 = driver.findElement(By.xpath("//span[contains(text(),'About')]"));
		act1.moveToElement(El1).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Our')]")).click();
//		act1.moveToElement(El2).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]")).click();
//		act1.moveToElement(El3).build().perform();
		Set<String> T_win = driver.getWindowHandles();
		for(String S:T_win)
		{
			driver.switchTo().window(S);
			
		}
		driver.switchTo().frame(driver.findElement(By.name("main_page")));
		String Address = driver.findElement(By.xpath("//div[@class='contact-info']")).getText();
		System.out.println(Address);
  }
}
