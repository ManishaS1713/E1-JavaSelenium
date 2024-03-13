package learningTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class AlwaysRunFlag {
	@Test
	public void login() 
	{
		Assert.fail();		//fail this method purposely
		Reporter.log("login method", true);
	}

	@Test(dependsOnMethods = "login") // it will execute after login method execution

	public void addToCart() {
		Reporter.log("addToCart method", true);
	}

	@Test(dependsOnMethods = "addToCart", alwaysRun = true)
	public void logout() {
		Reporter.log("logout method", true);
	}
}
