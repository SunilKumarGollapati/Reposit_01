package Anudeep1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Handson_util {
	WebDriver driver;
  @Test
  public void f() {
	  driver=Accesutil.getDriver("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp");
  }
}
