package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest_02 {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @Test
  public void g() {
	  System.out.println("g");
  }
  @Test
  public void h() {
	  System.out.println("h");
  }
  @BeforeMethod
  public void i()
  {
	  System.out.println("This comes first");
  }
  @AfterMethod
  public void j()
  {
	  System.out.println("This comes Last");
  }
  
}
