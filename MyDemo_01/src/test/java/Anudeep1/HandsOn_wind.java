package Anudeep1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandsOn_wind {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.manage().window().maximize();
	  String t_1=driver.getWindowHandle();
	  System.out.println(t_1);
	  driver.findElement(By.xpath("img[src='/assets/images/Taxercise_Super-income-Web-Banner_300-x-126.jpg']"));
	  Set<String> c_out=driver.getWindowHandles();
	  for(String S:c_out)
	  {
		  driver.switchTo().window(S);
	  }
	  driver.findElement(By.name("txtName")).sendKeys("Anudeep");
  }
}
