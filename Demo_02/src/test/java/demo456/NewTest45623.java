package demo456;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest45623 {
	  @Test (dataProvider="dp")
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
	  @AfterMethod
	  public void Logout()
	  {
		  System.out.println("Code for logout");
		  System.out.println("Code for verification");
	  }
	  @BeforeMethod 
	  public void h()
	  {
		  System.out.println("code for clearing the browsing history");
	  }
  }
	

