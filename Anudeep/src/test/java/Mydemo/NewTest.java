package Mydemo;

import org.testng.annotations.Test;

public class NewTest {
  @Test (priority=2)
  public void login() {
	  System.out.println("This is login");
  }
  @Test (priority=1, enabled=true)
  public void Registration() {
	  System.out.println("This is Registration");
  }
  @Test (priority=3)
  public void Addtocart() {
	  System.out.println("This is Add");
  }
  
  @Test (priority=4)
  public void logout() {
	  System.out.println("This is logout");
  }
  }

