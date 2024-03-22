package testNGListners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//pass listner annotation to access the CustomListner.java class methods
@Listeners(CustomListner.class)

public class ValidLoginClass extends BaseTest 
{
	@Test
	public void login() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.name("username"));
		//ulta assertion apply kiya he to fail the method purposely
		Assert.assertEquals(usn.isDisplayed(), false, "username textbox is displayed");
		usn.sendKeys("admin");

		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.name("pwd"));
		Assert.assertEquals(pwd.isDisplayed(), false, "password is displayed");
		pwd.sendKeys("manager");

		Thread.sleep(1000);
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		Assert.assertEquals(loginBtn.isDisplayed(), false,"Login button is displayed");
		loginBtn.click();
		Thread.sleep(3000);
	}
}
