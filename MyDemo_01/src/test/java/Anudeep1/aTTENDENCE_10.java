package Anudeep1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class aTTENDENCE_10 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://lkmapps.accenture.com/AttendancePortal/ParticipantMarkAttendance.aspx");
	  driver.manage().window().maximize();
	
  }
}
