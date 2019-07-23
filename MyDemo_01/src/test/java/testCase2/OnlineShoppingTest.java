package testCase2;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class OnlineShoppingTest {
	WebDriver driver;
  @Test(priority = 1)
  public void Checking() throws InterruptedException {
	  
	  driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignUp")));
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		Thread.sleep(10000);
		WebElement Name = driver.findElement(By.xpath("//input[@name='userName']"));
		Name.sendKeys("adgjlzcbm");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sunil");
		Thread.sleep(5000);
		String Scene = driver.findElement(By.xpath("//span[@id='err']")).getText();
		Assert.assertEquals("Available", Scene, "First soft assert failed");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sfhkxvn");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("sfhkxvn");
		driver.findElement(By.xpath("//input[@value = 'Male']")).click();
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9908312097");
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("adgjlzcbm@gmail.com");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("05/29/1997");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Telangana");
		WebElement question = driver.findElement(By.xpath("//select[@name = 'securityQuestion']"));
		Select ques1 = new Select(question);
		ques1.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("Red");;
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		
		
	
	
  }
  @AfterMethod
  public void GetResultsAfterMethod() {
  }

  @BeforeTest
  public void StartReportBeforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterTest
  public void endReportAfterTest() {
  }

}
