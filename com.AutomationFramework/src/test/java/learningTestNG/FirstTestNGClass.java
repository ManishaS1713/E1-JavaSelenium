package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
	@Test
	public void login() {
		Reporter.log("this is login method", true);
	}

	@Test
	public void addToCart() {
		Reporter.log("this is addToCart method", true);
	}

	@Test
	public void logout() {
		Reporter.log("this is logout method", true);
	}
}
