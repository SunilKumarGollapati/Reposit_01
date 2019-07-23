package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Demo_09 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		Thread.sleep(10000);
		// ID
		driver.findElement(By.cssSelector("input.userName")).sendKeys("Sunil");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Password1234");
	}
}