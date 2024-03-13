package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
	@Test (priority=1)
	public void login() {
		Reporter.log("this is login method having first priority", true);
	}

	@Test (priority=2)
	public void addToCart() {
		Reporter.log("this is addToCart method having second priority", true);
	}

	@Test (priority=3)
	public void logout() {
		Reporter.log("this is logout method having third priority", true);
	}
	
}
