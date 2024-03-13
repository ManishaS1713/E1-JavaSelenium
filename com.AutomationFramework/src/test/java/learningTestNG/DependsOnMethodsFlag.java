package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsFlag {
	@Test
	public void login() {
		Reporter.log("login method", true);
	}

	@Test(dependsOnMethods = "login") //it will execute after login method execution
	
	public void addToCart() {
		Reporter.log("addToCart method", true);
	}

	@Test(dependsOnMethods = "addToCart")
	public void logout() {
		Reporter.log("logout method", true);
	}
}
