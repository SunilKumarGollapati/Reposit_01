import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mydemo_02 {
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
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement signin=driver.findElement(By.linkText("SignIn"));
	WebElement Uname=driver.findElement(By.name("userName"));
	WebElement Pwsrd=driver.findElement(By.name("password"));
	WebElement Sbmt=driver.findElement(By.name("login"));
	signin.click();
	Uname.sendKeys("demo");
	Pwsrd.sendKeys("demo");
	Sbmt.click();
//driver.manage().window().maximize();
driver.close();
	driver.quit();
}
}
