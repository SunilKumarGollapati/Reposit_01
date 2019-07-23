package pack1;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Demo_07 {

	public static void main(String[] args){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Driver\\Chrome Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignUp")));
		List<WebElement> T_links = driver.findElements(By.tagName("a"));
		int C_links = T_links.size();
		System.out.println(C_links);
		for(int i = 0; i<C_links ;i++) {
			String Links = T_links.get(i).getText();
			System.out.println(Links);
		}
	}
}

