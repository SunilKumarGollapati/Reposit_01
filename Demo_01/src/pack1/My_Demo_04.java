package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_Demo_04 {

	public static void main(String[] args) {
	WebDriver Sunil;
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
	Sunil = new ChromeDriver();
	Sunil.navigate().to("http://newtours.demoaut.com");
	Sunil.manage().window().maximize();
	Sunil.findElement(By.linkText("REGISTER")).click();
	WebElement cntry = Sunil.findElement(By.name("country"));
	Select sel1 = new Select(cntry);
	sel1.selectByVisibleText("INDIA");
	WebElement Fname = Sunil.findElement(By.name("firstName"));
	Fname.sendKeys("Sunil");
	WebElement Lname = Sunil.findElement(By.name("lastName"));
	Lname.sendKeys("Kumar");
	WebElement Phn = Sunil.findElement(By.name("phone"));
	Phn.sendKeys("9908312096");
	WebElement Eml = Sunil.findElement(By.name("userName"));
	Eml.sendKeys("sunilkumar.sunil35@gmail.com");
	WebElement Addr = Sunil.findElement(By.name("address1"));
	Addr.sendKeys("Telangana");
	WebElement Cit = Sunil.findElement(By.name("city"));
	Cit.sendKeys("Hyderabad");
	WebElement Stat = Sunil.findElement(By.name("state"));
	Stat.sendKeys("Telangana");
	WebElement PostCode = Sunil.findElement(By.name("postalCode"));
	PostCode.sendKeys("500079");
	WebElement User= Sunil.findElement(By.name("email"));
	User.sendKeys("Sunil");
	WebElement Pass= Sunil.findElement(By.name("password"));
	Pass.sendKeys("abcde");
	WebElement CPass= Sunil.findElement(By.name("confirmPassword"));
	CPass.sendKeys("abcde");
	Sunil.findElement(By.name("register")).click();
	
	
	
	
	
	
	
	

	}

}
