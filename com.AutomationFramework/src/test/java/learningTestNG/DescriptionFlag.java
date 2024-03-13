package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test (description = "this method is for login to webpage",priority=1)
  public void login() {
	  Reporter.log("login method",true);
  }
  
  @Test (description = "this method is for add to cart", priority=2)
  public void addToCart() {
	  Reporter.log("addToCart method",true);
  }
  
  @Test (description = "this method is for logout", priority=3)
  public void logout() {
	  Reporter.log("logout method",true);
  }
}
