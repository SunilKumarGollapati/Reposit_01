import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mdemo_02 {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver;
	//int a,b,sum;
	//a=10;
	//b=20;
	//sum=a+b;
	//System.out.println("sum");
//	driver.findElement(By.name("username")).sendKeys("Anud");
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("Anudeep");
	driver.findElement(By.name("lastName")).sendKeys("reddy");
	driver.findElement(By.name("phone")).sendKeys("78794464644");
	driver.findElement(By.name("userName")).sendKeys("MAR@GMAIL.COM");
	driver.findElement(By.name("city")).sendKeys("ONGOLE");
	driver.findElement(By.name("state")).sendKeys("AP");
	driver.findElement(By.name("postalCode")).sendKeys("523274");
	driver.findElement(By.id("email")).sendKeys("demo1");
	driver.findElement(By.name("password")).sendKeys("demo1");
	driver.findElement(By.name("confirmPassword")).sendKeys("demo1");
	WebElement Cntry=driver.findElement(By.name("country"));
	Select Se1=new Select(Cntry);
	Se1.selectByVisibleText("GERMANY");
//driver.manage().window().maximize();
driver.close();
}
}
