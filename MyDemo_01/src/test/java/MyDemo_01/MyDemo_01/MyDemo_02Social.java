package MyDemo_01.MyDemo_01;

import org.testng.annotations.Test;

public class MyDemo_02Social {
  @Test (priority=1)
  public void Google() {
	  System.out.println("2 This is Google");
  }
  @Test (priority=3)
  public void Twitter() {
	  System.out.println("3 This is Twitter");
  }
  @Test (enabled = false)
  public void Facebook() {
	  System.out.println("1 This is Facebook");
  }
}
