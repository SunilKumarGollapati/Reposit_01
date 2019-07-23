package demo456;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class NewTest45623Test {
	WebDriver driver;
	@BeforeClass
	  public void launch() {
		  System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("http://10.232.237.143:443/TestMeApp");
			driver.manage().window().maximize();
			System.out.println("Launch");
	  }
  @Test(dataProvider = "Credentials")
  public void login(String n, String s) throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
        Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(n);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		System.out.println("Code for Login for "+n);
		System.out.println("Code for Login for "+n);
		String E_title = "Home";
		String A_title = driver.getTitle();
		if(E_title == A_title) {
			System.out.println("Login is Succesful");
			System.out.println(A_title);
			System.out.println(E_title);
		}
		else
		{
			System.out.println("Login is not Successful");
			System.out.println(A_title);
			System.out.println(E_title);
		}
	  
  }
  @DataProvider
  public Object[][] Credentials() {
    return new Object[][] {
    	new Object[] { "mbczkhfs" , "mnbvcxz" },
    	new Object[] { "poiuytrewq", "qwertyuiop" },
    };
  }
  @AfterMethod
  public void logout() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
		driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
      Thread.sleep(5000);
      System.out.println("Login is Successful");
  }

  
  

  @AfterClass
  public void afterClass() {
	  System.out.println("Closing Application");
	  driver.close();	
  }
    
  }
