package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_03class {
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
  @BeforeClass
  public void k()
  {
	  System.out.println("This comes only once");
  }
  @AfterClass
  public void l()
  {
	  System.out.println("This comes last only once");
  }
  @BeforeTest
  public void m()
  {
	  System.out.println("i dont know test");
  }
  @AfterTest
  public void n()
  {
	  System.out.println("i dont know test1");
  }
  
}
