package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Remo {
  @Test (groups = "Functional Testing")
  public void remo() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.google.co.in");
	  Thread.sleep(2000);
	 
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
