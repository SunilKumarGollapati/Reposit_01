package mydemo_01.mydemo_01;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyCss_selector {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	driver.findElement(By.cssSelector("input#userName")).sendKeys("anudeep");
	driver.findElement(By.cssSelector("input#password")).sendKeys("123456789");
	driver.findElement(By.cssSelector("input[name=\'Login\']")).click();

	}
}


//driver.findElement(By.cssSelector("inputuserName")).sendKeys("anudeep");