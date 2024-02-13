package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	}

}
