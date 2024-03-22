package testNGListners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion_OnactiTime {
	@Test
	public void login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;");

		// For critical Test Case
		String expectedLiginPageTitle = driver.getTitle(); // title is "actiTime - Login "
		Assert.assertEquals(driver.getTitle(), expectedLiginPageTitle, "Login page is not displayed");

		WebElement usn = driver.findElement(By.name("username"));
		Assert.assertEquals(usn.isDisplayed(), true, " username is not displayed");
		usn.sendKeys("admin");			//try to give wrong data like adm then script will stop there

		WebElement pwd = driver.findElement(By.name("pwd"));
		Assert.assertEquals(pwd.isDisplayed(), true, "password is not display");
		pwd.sendKeys("manager");
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		Assert.assertEquals(loginBtn.isDisplayed(), true,"button is not display");
		loginBtn.click();

	}
}
