package Anudeep1;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handson_08 {
	  WebDriver driver;
  @Test
  public void f() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement from=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[1]/ul/li[2]/div/div/span"));
   WebElement to=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadGrid1_ctl00']/tbody/tr/td"));
 
 action.dragAndDrop(from, to).perform();
  }
}
