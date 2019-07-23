package MyDemo_01.MyDemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Demo_03 {

	public static void main(String[] args) {
	
		WebDriver Sunil;
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		Sunil = new ChromeDriver();
		Sunil.navigate().to("http://newtours.demoaut.com");
		Sunil.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(Sunil,30); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		WebElement Fname = Sunil.findElement(By.name("First Name"));
		WebElement Lname = Sunil.findElement(By.name("Last Name"));
		WebElement Phn = Sunil.findElement(By.name("Phone"));
		WebElement Eml = Sunil.findElement(By.name("Email"));
		WebElement Addr = Sunil.findElement(By.name("Adress"));
		WebElement Cit = Sunil.findElement(By.name("City"));
		WebElement Stat = Sunil.findElement(By.name("State/Province"));
		WebElement PostCode = Sunil.findElement(By.name("Postal Code"));
		WebElement Cntry = Sunil.findElement(By.name("Country"));
		
		

	}

}
