package pack1;
import java.awt.Dimension;
import java.awt.Point;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_program_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.navigate().to("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
//		Dimension d = new Dimension(330,900);
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(300,500);
//		driver.manage().window().setPosition(p);
		

		WebElement Uname = driver.findElement(By.name("userName"));
		WebElement Pswrd = driver.findElement(By.name("password")); 
		WebElement Sbmt  =  driver.findElement(By.name("login"));
		Uname.sendKeys("demo");
		Pswrd.sendKeys("demo");
		Sbmt.click();
		
		driver.close();//closes only parent window of the browser
		driver.quit();//closes entire windows

//		int a =10;
//		int b = 20;
//		int Sum = a+b;
//		System.out.println("The Sum is "+Sum);
		
//		driver.findElement(By.name("username")).sendKeys("Sunil");
//		
	}

}
