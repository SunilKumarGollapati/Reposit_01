package testmeapp;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class OnlineShoppingTest 
{
  WebDriver driver;
//public void startReportBeforeTest() 
  @BeforeTest
  public void launch()
  {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  
  }
  
   @Test(dataProvider = "dp",priority =2)
   public void testLogin(String n, String s) throws InterruptedException 
   {
	  WebDriverWait wait = new WebDriverWait(driver,60);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(n);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	  Thread.sleep(5000);
	  String expected_link = "SignOut";
	  String actual_link = driver.findElement(By.xpath("//a[contains (text(),'SignOut')]")).getText();
	  System.out.println(expected_link);
	  System.out.println(actual_link);
	  Assert.assertEquals(expected_link,actual_link);
	  System.out.println("successfull login");
   }
  
  @Test (priority=3)
  public void testCart() throws InterruptedException
  {
	  WebDriverWait wait1 = new WebDriverWait(driver,60);
	  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains (text(),'Categories')]")));
	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Head");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  WebDriverWait wait = new WebDriverWait(driver,60);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Add to cart')]")));
	  String p_name1 = driver.findElement(By.xpath("//p[text()='Blue tooth head phone']")).getText();
	  System.out.println(p_name1);
	  driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	  String p_name2 = driver.findElement(By.xpath("//p[text()='Blue tooth head phone']")).getText();
	  System.out.println(p_name2);
	  Assert.assertEquals(p_name1,p_name2);
	  System.out.println("Added to cart"); 	
  }
  
  
  @Test (priority=4)
  public void testPayment() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	  driver.findElement(By.xpath("//textarea[@id='add1']")).sendKeys(" ffgrthdjtjtgjfyjfg");
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@value='HDFC Bank']")).click();
	  driver.findElement(By.xpath("//a[@id='btn']")).click();
	  WebDriverWait wait2 = new WebDriverWait(driver,60);
	  wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  
	  
  }
  
//  @Test (priority=1)
//  public void testRegistration() throws InterruptedException
//  {
//	    WebDriverWait wait = new WebDriverWait(driver,60);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignUp")));
//		driver.findElement(By.xpath("//a[contains (text( ),'SignUp')]")).click();
//		Thread.sleep(5000);
//	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("qscwdmnvrg");
//	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("fvjcgBdv");
//	    Thread.sleep(10000);
//		String actual_text = driver.findElement(By.xpath("//span[text()='Available']")).getText();
//		String expected_text = "Available";
//	    System.out.println(expected_text);
//	    System.out.println(actual_text);
//		   
//		Assert.assertEquals(expected_text,actual_text);
//		    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("dfbgdhdh");
//		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mnbvcxz");
//		    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("mnbvcxz");
//		    driver.findElement(By.xpath("//input[@value='Male']")).click();
//		    driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9239067890");
//		    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nzdhjfgzrzdn@gmail.com");
//		    driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07/17/2019");
//		    driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(" ffgrthdjtjtgjfyjfg");
//		    WebElement question =  driver.findElement(By.xpath("//select[@name='securityQuestion']"));
//		    Select Ques1 = new Select(question);
//			Ques1.selectByIndex(1);
//		    driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("Black");
//		    driver.findElement(By.xpath("//input[@name='Submit']")).click();
//		    Thread.sleep(5000);
//		    String actual_msg = driver.findElement(By.xpath("//div[contains (text(),' User Registered Succesfully!!! Please login')]")).getText();
//		    String expected_msg = "User Registered Succesfully!!! Please login";
//		    System.out.println(expected_msg);
//		    System.out.println(actual_msg);
//		    
//		    Assert.assertEquals(expected_text,actual_text);
//		    System.out.println("Registration successful");
//		   
//			Thread.sleep(5000);
//  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      //new Object[] { "mbczkhfs", "mnbvcxz" },
      new Object[] { "qscwdmnbvg", "mnbvcxz" },
    };
 }
  
//  @AfterMethod
//  public void getResultAfterMethod() 
//  {
//	  
//  }
//
//  @AfterTest
//  public void endReportAfterTest() 
//  {
//	  
//  }

}
