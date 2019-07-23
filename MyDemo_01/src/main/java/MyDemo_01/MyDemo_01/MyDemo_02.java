package MyDemo_01.MyDemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyDemo_02 {



	public static void main(String[] args) {
		WebDriver Sunil;
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		Sunil = new ChromeDriver();
		Sunil.navigate().to("http://10.232.237.143:443/TestMeApp");
		Sunil.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(Sunil,30); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		WebElement Sin = Sunil.findElement(By.className("fa fa-lock"));
		Sin.click();
		WebElement Uname = Sunil.findElement(By.name("userName"));
		WebElement Pswrd = Sunil.findElement(By.name("password")); 
		WebElement Sbmt  =  Sunil.findElement(By.name("login"));

		Uname.sendKeys("demo");
		Pswrd.sendKeys("demo");
		Sbmt.click();

	}

}
