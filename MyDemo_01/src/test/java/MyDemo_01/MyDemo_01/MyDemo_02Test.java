package MyDemo_01.MyDemo_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;

public class MyDemo_02Test {
	int i=0;
  @Test (dataProvider = "dp")
	  public void f(String n, String s) {
		  System.out.println("The User name is "+n);
		  System.out.println("The ID nunmber is "+s);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Sunil", "1234" },
      new Object[] { "Srikanth", "5678" },
      new Object[] { "Niharika", "9010" },
      new Object[] { "Utkarsha", "0001" },
    };
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login for Member "+i++);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Login Sucessful for Member "+i);
  }

}
