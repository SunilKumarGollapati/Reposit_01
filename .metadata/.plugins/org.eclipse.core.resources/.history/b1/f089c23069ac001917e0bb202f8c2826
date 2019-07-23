package mydemo_01.mydemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mydemo_03 {
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
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("anudeep123");
	driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("An");
	driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("de");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	driver.findElement(By.xpath("//input[@name=\"emailAddress\"]")).sendKeys("qw12@gmail.com");
	driver.findElement(By.xpath("//input[@name=\"mobileNumber\"]")).sendKeys("7894561237");
	driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("12/12/1997");
	driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys("fbdfbvjsfsjfvsjvfjsvfjsfsdfsf");
	//driver.findElement(By.xpath("//input[@name=\"securityQuestion\"]")).sendKeys("What is your Birth Place?");
	driver.findElement(By.xpath("//input[@name=\"answer\"]")).sendKeys("lodniinn");
	driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
	Thread.sleep(5000);
	
//driver.manage().window().maximize();
driver.close();
}
}
