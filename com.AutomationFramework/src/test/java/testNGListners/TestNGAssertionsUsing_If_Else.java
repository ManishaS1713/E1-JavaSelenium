package testNGListners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAssertionsUsing_If_Else {
  @Test
  public void validLigin() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("http://127.0.0.1/login.do;");
	  
	  //check the tile of the login webpage 
	  String expectedLiginPageTitle=driver.getTitle();
	  
	  if(driver.getTitle().equals(expectedLiginPageTitle))
	  {
		  Reporter.log("Login title matched, Test Case passed",true);
		  driver.findElement(By.name("username")).sendKeys("admin");
		  Thread.sleep(1000);
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  Thread.sleep(1000);
		  driver.findElement(By.id("loginButton")).click();
		  
	  }
	  
	//check the tile of the home webpage 
	  String expectedHomePAgeTitle=driver.getTitle();
	  
	  if(driver.getTitle().equals(expectedHomePAgeTitle))
	  {
		  Reporter.log("Homepage title matched, Test Case passed",true);
		  driver.findElement(By.linkText("Logout")).click();
		  
	  }
  }
}
