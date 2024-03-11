package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test (priority=1)
  public void login() {
	  Reporter.log("this is login method",true);
  }
  
  @Test (priority=2)
  public void addToCart() {
	  Reporter.log("this is addToCart method",true);
  }
  
  @Test (priority=3)
  public void logout() {
	  Reporter.log("this is logout method", true);
  }
}
