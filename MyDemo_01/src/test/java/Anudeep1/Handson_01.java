package Anudeep1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Handson_01 {
	 WebDriver driver;
	 @BeforeClass
	  public void launch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		 
		  
	  }
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(n);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	new Object[] { "asif123456", "asif1234" },
        new Object[] { "asif123456", "asif1234" },
    };
  }
 @AfterMethod
 public void logout() throws InterruptedException
 {
	 driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
	 Thread.sleep(5000);
 }
 @BeforeMethod
 public void login() throws InterruptedException
 {
	 driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	 Thread.sleep(5000);
 }
}
