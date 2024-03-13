package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {

	@Test(enabled = true)
	public void login() {
		Reporter.log("login method", true);
	}

	@Test(enabled=false)
			public void addToCart() {
		Reporter.log("addToCart method", true);
	}
//either you can give comment to Test or use enabled flag
	
	//@Test(description = "this method is for logout", priority = 3)
	public void logout() {
		Reporter.log("logout method", true);
	}
}
