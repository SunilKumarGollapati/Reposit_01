package demo456;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NewTest45623TestTest {
	WebDriver driver;

	@BeforeClass
	  public void launch() {
		  System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("http://10.232.237.143:443/TestMeApp");
			driver.manage().window().maximize();
			System.out.println("Launch");
	}
  @Test
  public void f() {
  }
//  
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
}
