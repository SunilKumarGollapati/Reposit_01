package MyDemo_01.MyDemo_01;
import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class TC_99 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println("user name is "+n);
	  System.out.println("user name is "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Sunil" , "Kumar" },
      new Object[] { "Sam", "Don" },
    };
  }
}