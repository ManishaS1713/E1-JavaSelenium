package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("email")).sendKeys("manager");
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
	}

}