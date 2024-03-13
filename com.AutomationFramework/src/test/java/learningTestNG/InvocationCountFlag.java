package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

// invocation flag use to execute one method multiple times

public class InvocationCountFlag {
	@Test(priority = 1)
	public void login() {
		Reporter.log("login method", true);
	}

	@Test(priority = 2, invocationCount = 5)  //executing 5-times
	public void addToCart() {
		Reporter.log("addToCart method", true);
	}

	@Test(priority = 3)
	public void logout() {
		Reporter.log("logout method", true);
	}
}
