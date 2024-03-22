package testNGListners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertion_Actitime {
  @Test
  public void loginMethod() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;");

		// For independent and  Test Case
		String expectedLiginPageTitle = driver.getTitle(); // title is "actiTime - Login "
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(driver.getTitle(), expectedLiginPageTitle, "Login page is not displayed");
		
		WebElement usn = driver.findElement(By.name("username"));
		sa.assertEquals(usn.isDisplayed(), true,"username is not displayed");
		usn.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		sa.assertEquals(pwd.isDisplayed(), true, "password not displayed");
		pwd.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		sa.assertEquals(loginBtn.isDisplayed(), true,"login button is not displayed");
		loginBtn.click();		
  }
}
