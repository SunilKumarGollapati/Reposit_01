package demo2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo123 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/htdocs/nri_banking/accounts/fixed_deposits/fixed_deposits.htm']")).click();
		String win_name1 = driver.getWindowHandle();
		Set<String> T_Windows = driver.getWindowHandles();
		System.out.println(win_name1);
		int count = T_Windows.size();
		for (String S:T_Windows) {
			driver.switchTo().window(S);
			System.out.println(driver.getWindowHandle());
		}
		driver.findElement(By.xpath("//img[@src='/htdocs/nri_banking/product_page/images/primnav/loans.gif']")).click();
		driver.close();
		
  	}
}