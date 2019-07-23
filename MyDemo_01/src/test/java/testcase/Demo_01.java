package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo_01 
{
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
  @BeforeSuite
  public void i()
  {
	  System.out.println("This comes first");
  }
  @AfterSuite
  public void j()
  {
	  System.out.println("This comes Last");
  }
}
