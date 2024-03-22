package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
	static WebDriver driver;
	
	//passing the parameter from xml for cross browsing testing 
	//(one class executed in different browser)
	//check passingParameteExecution.xml file for and execute that file for output
	@Parameters({"browser","url","validUsn","validPwd"})		
  @Test
  public void validLogin(String browserName, String url, String usn, String pwd) throws InterruptedException {
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get(url);
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("username")).clear();
		  driver.findElement(By.name("username")).sendKeys(usn);;
		  Thread.sleep(1000);
		  driver.findElement(By.name("pwd")).sendKeys(pwd);
		  Thread.sleep(1000);
		  driver.findElement(By.id("loginButton")).click();
	  }
	  else
		  if(browserName.equalsIgnoreCase("firefox"))
		  {
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			  driver.get(url);
			  Thread.sleep(2000);
			  
			  driver.findElement(By.name("username")).clear();
			  driver.findElement(By.name("username")).sendKeys(usn);
			  Thread.sleep(1000);
			  driver.findElement(By.name("pwd")).sendKeys(pwd);
			  Thread.sleep(1000);
			  driver.findElement(By.id("loginButton")).click();
		  }
		  else
			  if(browserName.equalsIgnoreCase("edge"))
			  {
				  driver=new EdgeDriver();
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				  driver.get(url);
				  Thread.sleep(2000);
				  
				  driver.findElement(By.name("username")).clear();
				  driver.findElement(By.name("username")).sendKeys(usn);
				  Thread.sleep(1000);
				  driver.findElement(By.name("pwd")).sendKeys(pwd);
				  Thread.sleep(1000);
				  driver.findElement(By.id("loginButton")).click();
			  }
  }
}
