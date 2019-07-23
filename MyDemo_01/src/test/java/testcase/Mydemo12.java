package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Mydemo12 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n);
	  System.out.println(n);
  }

  @DataProvider
  public Object[][] dp() {
	  
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
